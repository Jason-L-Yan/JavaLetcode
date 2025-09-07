package com.lichee.infinite.magicplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType

internal class MagicAction : AnAction() {
    override fun actionPerformed(p0: AnActionEvent) {
        NotificationGroupManager.getInstance()
            .getNotificationGroup("MagicPluginNotification")
            .createNotification("Magic Action", "Magic action executed!", NotificationType.INFORMATION)
            .notify(p0.project)
        print("Magic")
    }
}
