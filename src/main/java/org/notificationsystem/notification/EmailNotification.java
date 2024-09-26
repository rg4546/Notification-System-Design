package org.notificationsystem.notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending Email with Subject: " + subject + ", Message: " + message);
    }
}
