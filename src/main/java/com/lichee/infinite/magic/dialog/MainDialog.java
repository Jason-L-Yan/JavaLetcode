package com.lichee.infinite.magic.dialog;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.ui.components.JBScrollPane;
import com.lichee.infinite.magic.service.AIAssistantService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * 主对话框，包含提示词输入和回答显示区域
 */
public class MainDialog extends DialogWrapper {

    private final Project project;
    private JPanel mainPanel;
    private JTextArea promptTextArea;
    private JTextArea answerTextArea;
    private JButton submitButton;
    private JButton settingsButton;

    public MainDialog(@NotNull Project project) {
        super(project); // 使用project作为父组件
        this.project = project;
        setTitle("AI 助手");
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

        // 3. 创建底部面板（放置提交按钮）
        JPanel bottomPanel = createBottomPanel();
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // 设置对话框的首选大小
        mainPanel.setPreferredSize(new Dimension(600, 500));
    }

    /**
     * 创建顶部面板（包含设置按钮）
     */
    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        settingsButton = new JButton("设置");
        settingsButton.addActionListener(e -> openSettingsDialog());
        topPanel.add(settingsButton);
        return topPanel;
    }

    /**
     * 创建中部面板（包含提示词输入区和回答显示区）
     */
    private JPanel createCenterPanelInternal() {
        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 10, 10));

        // 提示词输入区域
        JPanel promptPanel = new JPanel(new BorderLayout(5, 5));
        promptPanel.setBorder(BorderFactory.createTitledBorder("输入提示词"));
        promptTextArea = new JTextArea(5, 50); // 5行高，50列宽
        promptTextArea.setLineWrap(true); // 启用自动换行
        promptTextArea.setWrapStyleWord(true); // 在单词边界处换行
        JBScrollPane promptScrollPane = new JBScrollPane(promptTextArea);
        promptPanel.add(promptScrollPane, BorderLayout.CENTER);
        centerPanel.add(promptPanel);

        // 回答显示区域
        JPanel answerPanel = new JPanel(new BorderLayout(5, 5));
        answerPanel.setBorder(BorderFactory.createTitledBorder("回答内容"));
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
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        submitButton = new JButton("提交");
        submitButton.addActionListener(e -> submitPrompt());
        bottomPanel.add(submitButton);
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
     * 提交提示词到AI服务
     */
    private void submitPrompt() {
        String prompt = promptTextArea.getText().trim();
        if (prompt.isEmpty()) {
            Messages.showWarningDialog("请输入提示词。", "提示");
            return;
        }

        // 在实际应用中，这里应该使用 BackgroundableTask 或类似机制在后台线程中执行耗时操作
        // 此处为简化示例，直接在UI线程中调用
        try {
            AIAssistantService aiService = AIAssistantService.getInstance(project);
            String response = aiService.callApi(prompt);
            answerTextArea.setText(response);
        } catch (Exception ex) {
            Messages.showErrorDialog("调用AI服务时发生错误: " + ex.getMessage(), "错误");
        }
    }

    @Override
    protected Action @NotNull [] createActions() {
        // 不提供默认的OK/Cancel按钮，使用我们自己的提交按钮
        return new Action[]{};
    }
}