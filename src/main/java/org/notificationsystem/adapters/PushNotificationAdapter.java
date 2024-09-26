package org.notificationsystem.adapters;

import org.notificationsystem.notification.Notification;

public class PushNotificationAdapter implements Notification {
    private ThirdPartyPushService pushService;

    public PushNotificationAdapter(ThirdPartyPushService pushService) {
        this.pushService = pushService;
    }

    @Override
    public void sendNotification(String subject, String message) {
        pushService.sendPush(message);
    }
}
