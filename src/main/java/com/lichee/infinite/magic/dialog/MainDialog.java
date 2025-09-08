package com.lichee.infinite.magic.dialog;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.ui.components.JBScrollPane;
import com.lichee.infinite.magic.service.AIAssistantService;
import com.lichee.infinite.magicplugin.utils.MagicPluginBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 主对话框，包含提示词输入和回答显示区域
 * 改进版：包含线程安全、错误处理和用户体验优化
 */
public class MainDialog extends DialogWrapper {

    private final Project project;
    private JPanel mainPanel;
    private JTextArea promptTextArea;
    private JTextArea answerTextArea;
    private JButton submitButton;
    private JButton settingsButton;
    private JProgressBar progressBar;
    private JLabel statusLabel;
    private Disposable streamingDisposable; // 用于取消流式请求
    private final AtomicReference<StringBuilder> fullResponse = new AtomicReference<>(new StringBuilder());

    public MainDialog(@NotNull Project project) {
        super(project); // 使用project作为父组件
        this.project = project;
        setTitle(MagicPluginBundle.message("ui.ai.assistant"));
        setModal(false); // 设置为非模态对话框，允许用户与IDE其他部分交互
        init(); // 初始化对话框
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        initMainPanel();
        return mainPanel;
    }

    /**
     * 初始化主面板及其所有UI组件
     */
    private void initMainPanel() {
        mainPanel = new JPanel(new BorderLayout(10, 10));

        // 1. 创建顶部面板（放置设置按钮）
        JPanel topPanel = createTopPanel();
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // 2. 创建中部面板（放置提示词输入区和回答显示区）
        JPanel centerPanel = createCenterPanelInternal();
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // 3. 创建底部面板（放置提交按钮和状态指示器）
        JPanel bottomPanel = createBottomPanel();
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // 设置对话框的首选大小
        mainPanel.setPreferredSize(new Dimension(600, 550));
    }

    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        settingsButton = new JButton(MagicPluginBundle.message("ui.settings"));
        settingsButton.addActionListener(e -> openSettingsDialog());
        topPanel.add(settingsButton);
        return topPanel;
    }

    private JPanel createCenterPanelInternal() {
        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 10, 10));

        // 提示词输入区域
        JPanel promptPanel = new JPanel(new BorderLayout(5, 5));
        promptPanel.setBorder(BorderFactory.createTitledBorder(MagicPluginBundle.message("ui.input.prompt")));
        promptTextArea = new JTextArea(5, 50); // 5行高，50列宽
        promptTextArea.setLineWrap(true); // 启用自动换行
        promptTextArea.setWrapStyleWord(true); // 在单词边界处换行
        JBScrollPane promptScrollPane = new JBScrollPane(promptTextArea);
        promptPanel.add(promptScrollPane, BorderLayout.CENTER);
        centerPanel.add(promptPanel);

        // 回答显示区域
        JPanel answerPanel = new JPanel(new BorderLayout(5, 5));
        answerPanel.setBorder(BorderFactory.createTitledBorder(MagicPluginBundle.message("ui.answer.content")));
        answerTextArea = new JTextArea(10, 50); // 10行高，50列宽
        answerTextArea.setLineWrap(true);
        answerTextArea.setWrapStyleWord(true);
        answerTextArea.setEditable(false); // 回答区域不可编辑
        JBScrollPane answerScrollPane = new JBScrollPane(answerTextArea);
        answerPanel.add(answerScrollPane, BorderLayout.CENTER);
        centerPanel.add(answerPanel);

        return centerPanel;
    }

    /**
     * 创建底部面板（包含提交按钮）
     */
    private JPanel createBottomPanel() {
        JPanel bottomPanel = new JPanel(new BorderLayout(5, 5));

        // 状态指示器面板
        JPanel statusPanel = new JPanel(new BorderLayout(5, 5));
        statusLabel = new JLabel(MagicPluginBundle.message("ui.ready"));
        statusPanel.add(statusLabel, BorderLayout.WEST);

        progressBar = new JProgressBar();
        progressBar.setVisible(false); // 初始时隐藏进度条
        progressBar.setIndeterminate(true); // 设置为不确定进度
        statusPanel.add(progressBar, BorderLayout.CENTER);

        bottomPanel.add(statusPanel, BorderLayout.CENTER);

        // 提交按钮面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        submitButton = new JButton(MagicPluginBundle.message("ui.submit"));
        submitButton.addActionListener(e -> submitPrompt());
        buttonPanel.add(submitButton);

        bottomPanel.add(buttonPanel, BorderLayout.EAST);

        return bottomPanel;
    }

    /**
     * 打开设置对话框
     */
    private void openSettingsDialog() {
        SettingsDialog settingsDialog = new SettingsDialog();
        settingsDialog.show();
    }

    /**
     * 提交提示词到AI服务 - 使用后台任务避免阻塞UI线程
     */
    private void submitPrompt() {
        String prompt = promptTextArea.getText().trim();
        if (prompt.isEmpty()) {
            Messages.showWarningDialog(MagicPluginBundle.message("ui.prompt.enter"), MagicPluginBundle.message("ui.prompt"));
            return;
        }

        // 取消之前的请求（如果有）
        if (streamingDisposable != null && !streamingDisposable.isDisposed()) {
            streamingDisposable.dispose();
        }

        // 重置状态
        fullResponse.set(new StringBuilder());
        answerTextArea.setText("");

        // 禁用UI组件，防止重复提交
        setUiEnabled(false);
        statusLabel.setText(MagicPluginBundle.message("ui.processing"));
        progressBar.setVisible(true);

        try {
            AIAssistantService aiService = AIAssistantService.getInstance(project);
            streamingDisposable = aiService.callApiStreaming(prompt)
                    .subscribe(
                            chunk -> {
                                // 在EDT线程中更新UI
                                SwingUtilities.invokeLater(() -> {
                                    StringBuilder currentResponse = fullResponse.get();
                                    currentResponse.append(chunk);
                                    answerTextArea.setText(currentResponse.toString());
                                    // 自动滚动到最底部
                                    answerTextArea.setCaretPosition(answerTextArea.getDocument().getLength());
                                });
                            },
                            error -> {
                                SwingUtilities.invokeLater(() -> {
                                    progressBar.setVisible(false);
                                    setUiEnabled(true);
                                    statusLabel.setText(MagicPluginBundle.message("ui.error"));
                                    showErrorWithDetails(MagicPluginBundle.message("ui.ai.service.error"), error);
                                });
                            },
                            () -> {
                                SwingUtilities.invokeLater(() -> {
                                    progressBar.setVisible(false);
                                    setUiEnabled(true);
                                    statusLabel.setText(MagicPluginBundle.message("ui.ready"));
                                });
                            }
                    );
        } catch (Exception e) {
            // 处理初始调用错误
            progressBar.setVisible(false);
            setUiEnabled(true);
            statusLabel.setText(MagicPluginBundle.message("ui.error"));
            showErrorWithDetails(MagicPluginBundle.message("ui.ai.service.error"), e);
        }
    }

    /**
     * 启用或禁用UI组件
     */
    private void setUiEnabled(boolean enabled) {
        promptTextArea.setEnabled(enabled);
        submitButton.setEnabled(enabled);
        settingsButton.setEnabled(enabled);
    }

    /**
     * 显示带详细错误信息的对话框
     */
    private void showErrorWithDetails(String title, Throwable error) {
        // 创建带详细信息的错误对话框
        JTextArea errorDetails = new JTextArea(10, 50);
        errorDetails.setText(error.toString() + "\n\nStack Trace:\n" + error);
        errorDetails.setEditable(false);
        errorDetails.setCaretPosition(0);

        JScrollPane scrollPane = new JBScrollPane(errorDetails);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(MagicPluginBundle.message("ui.error.details")), BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        JOptionPane.showMessageDialog(
                this.getWindow(),
                panel,
                title,
                JOptionPane.ERROR_MESSAGE
        );
    }

    /**
     * 获取异常的堆栈跟踪信息
     */
    private String getStackTrace(Exception e) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : e.getStackTrace()) {
            sb.append(element.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    protected Action @NotNull [] createActions() {
        return new Action[]{};
    }
}