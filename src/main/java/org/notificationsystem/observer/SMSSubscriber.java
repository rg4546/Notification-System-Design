package org.notificationsystem.observer;

public class SMSSubscriber implements NotificationSubscriber {
    @Override
    public void update(String subject, String message) {
        System.out.println("SMS Subscriber received: " + message);
    }
}
