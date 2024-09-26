package org.notificationsystem.factories;

import org.notificationsystem.notification.EmailNotification;
import org.notificationsystem.notification.Notification;
import org.notificationsystem.notification.SMSNotification;

public class NotificationFactory {
    public static Notification getNotification(String channel) {
        if (channel.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (channel.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Invalid notification channel");
    }
}
