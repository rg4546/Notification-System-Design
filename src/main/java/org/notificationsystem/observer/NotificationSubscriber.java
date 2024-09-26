package org.notificationsystem.observer;

public interface NotificationSubscriber {
    void update(String subject, String message);
}

