package org.notificationsystem.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {
    private List<NotificationSubscriber> subscribers = new ArrayList<>();

    public void subscribe(NotificationSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(NotificationSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String subject, String message) {
        for (NotificationSubscriber subscriber : subscribers) {
            subscriber.update(subject, message);
        }
    }
}
