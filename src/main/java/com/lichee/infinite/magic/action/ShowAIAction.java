package com.lichee.infinite.magic.action;

import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.lichee.infinite.magic.dialog.MainDialog;
import com.lichee.infinite.magicplugin.utils.MagicPluginBundle;
import org.jetbrains.annotations.NotNull;

// ShowAIAction.java
public class ShowAIAction extends AnAction {
    public ShowAIAction() {
        super();
        String text = MagicPluginBundle.message("action.MagicAction.text");
        String description = MagicPluginBundle.message("action.MagicAction.description");
        getTemplatePresentation().setText(text);
        getTemplatePresentation().setDescription(description);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        if (project != null) {
            MainDialog mainDialog = new MainDialog(project);
            mainDialog.show();
        }
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        Editor editor = e.getData(CommonDataKeys.EDITOR);
        e.getPresentation().setEnabledAndVisible(editor != null);
    }
    
    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.EDT;
    }
}
