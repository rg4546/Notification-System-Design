package org.notificationsystem.facade;

import org.notificationsystem.factories.NotificationFactory;
import org.notificationsystem.notification.Notification;
import org.notificationsystem.singleton.SubscriptionManager;

import java.util.List;

public class NotificationFacade {
    private Notification notification;

    public NotificationFacade(String channel) {
        this.notification = NotificationFactory.getNotification(channel);
    }

    public void send(String subject, String message, String s) {
        List<String> subscribers = SubscriptionManager.getInstance().getSubscribedUsers();
        for (String user : subscribers) {
            System.out.println("Sending to " + user);
            notification.sendNotification(subject, message);
        }
    }
}
