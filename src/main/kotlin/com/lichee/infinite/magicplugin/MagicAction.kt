package com.lichee.infinite.magicplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.lichee.infinite.magicplugin.utils.MagicPluginBundle

internal class MagicAction : AnAction() {
    
    init {
        val text = MagicPluginBundle.message("action.MagicAction.text")
        val description = MagicPluginBundle.message("action.MagicAction.description")
        templatePresentation.text = text
        templatePresentation.description = description
    }
    
    override fun actionPerformed(p0: AnActionEvent) {
        val title = MagicPluginBundle.message("delete.device.title")
        val content = MagicPluginBundle.message("delete.device.content")
        
        NotificationGroupManager.getInstance()
            .getNotificationGroup("MagicPluginNotification")
            .createNotification(title, content, NotificationType.INFORMATION)
            .notify(p0.project)
        print("Magic")
    }
}
