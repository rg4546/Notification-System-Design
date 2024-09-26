package org.notificationsystem.observer;

public class EmailSubscriber implements NotificationSubscriber {
    @Override
    public void update(String subject, String message) {
        System.out.println("Email Subscriber received: " + subject + " - " + message);
    }
}
