package org.notificationsystem.notification;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending SMS with Message: " + message);
    }
}
