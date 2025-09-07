package com.lichee.infinite.magic.dialog;

// import com.example.aiassistant.service.AppSettingsService;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.ui.components.JBPasswordField;
import com.jetbrains.cef.remote.thrift.annotation.Nullable;
import com.lichee.infinite.magic.service.AppSettingsService;
import com.lichee.infinite.magicplugin.utils.MagicPluginBundle;

import javax.swing.*;
import java.awt.*;

public class SettingsDialog extends DialogWrapper {
    // ... 其他字段 ...
    private JPanel mainPanel;
    private JTextField apiUrlField;
    private JPasswordField apiTokenField;
    private JTextField modelNameField;
    private JTextField systemPromptField;

    // ... 不再需要直接持有 Project ...
    public SettingsDialog() { // 构造函数可以不需要 Project了
        super(true);
        setTitle(MagicPluginBundle.message("ui.api.settings"));
        setModal(false); // 设置为非模态对话框，允许用户与IDE其他部分交互
        setResizable(true); // 设置对话框可调整大小
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        initMainPanel();
        loadSettings();
        return mainPanel;
    }

    /**
     * 初始化主面板及其所有UI组件
     */
    private void initMainPanel() {
        mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setPreferredSize(new Dimension(500, 120));

        // 创建表单面板
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // API URL 输入
        formPanel.add(new JLabel(MagicPluginBundle.message("ui.api.url")));
        apiUrlField = new JTextField(30);
        formPanel.add(apiUrlField);

        // API Token 输入
        formPanel.add(new JLabel(MagicPluginBundle.message("ui.api.token")));
        apiTokenField = new JBPasswordField(); // 使用密码字段
        formPanel.add(apiTokenField);

        formPanel.add(new JLabel(MagicPluginBundle.message("ui.model.name")));
        modelNameField = new JTextField(30);
        formPanel.add(modelNameField);

        formPanel.add(new JLabel(MagicPluginBundle.message("ui.system.prompt")));
        systemPromptField = new JTextField(30);
        formPanel.add(systemPromptField);

        mainPanel.add(formPanel, BorderLayout.CENTER);
    }

    @Override
    protected void doOKAction() {
        saveSettings();
//        super.doOKAction();
    }

    /**
     * 加载已保存的设置
     */
    private void loadSettings() {
        AppSettingsService settingsService = AppSettingsService.getInstance();
        apiUrlField.setText(settingsService.getApiUrl());
        apiTokenField.setText(settingsService.getApiToken());
        modelNameField.setText(settingsService.getModelName()); // 加载模型名称
        systemPromptField.setText(settingsService.getSystemPrompt());
    }

    /**
     * 保存设置
     */
    private void saveSettings() {
        String apiUrl = apiUrlField.getText().trim();
        String apiToken = new String(apiTokenField.getPassword()).trim();
        String modelName = modelNameField.getText().trim(); // 获取模型名称
        String systemPrompt = systemPromptField.getText().trim();

        if (apiUrl.isEmpty() || apiToken.isEmpty() || modelName.isEmpty()) {
            Messages.showErrorDialog(this.getContentPane(), MagicPluginBundle.message("ui.api.address.token.model.notEmpty"), MagicPluginBundle.message("ui.error"));
            return;
        }

        try {
            AppSettingsService settingsService = AppSettingsService.getInstance();
            settingsService.setApiUrl(apiUrl);
            settingsService.setApiToken(apiToken);
            settingsService.setModelName(modelName);
            settingsService.setSystemPrompt(systemPrompt);

            Messages.showInfoMessage(this.getContentPane(), MagicPluginBundle.message("ui.setting.save.success"), MagicPluginBundle.message("ui.success"));
            close(DialogWrapper.OK_EXIT_CODE); // 关闭对话框
        } catch (Exception ex) {
            Messages.showErrorDialog(this.getContentPane(), MagicPluginBundle.message("ui.saveSettings.error") + ex.getMessage(), MagicPluginBundle.message("ui.error"));
            // 出现异常时也关闭对话框
            close(DialogWrapper.CANCEL_EXIT_CODE);
        }
    }
}
