package org.notificationsystem;

import org.notificationsystem.facade.NotificationFacade;
import org.notificationsystem.observer.EmailSubscriber;
import org.notificationsystem.observer.NotificationPublisher;
import org.notificationsystem.observer.NotificationSubscriber;
import org.notificationsystem.observer.SMSSubscriber;

// Main.java
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <NotificationChannel> <Subject> <Message>");
            System.out.println("Example: java Main Email 'Subject' 'Message body'");
            return; // Exit the program if arguments are not provided
        }

        // Safely fetching the arguments
        String channel = args[0]; // "Email" or "SMS"
        String subject = args.length > 1 ? args[1] : "Default Subject";
        String message = args.length > 2 ? args[2] : "Default Message";

        // Sending Notification through Facade
        NotificationFacade facade = new NotificationFacade(channel);
        facade.send(channel, subject, message);

        // Demonstrating Observer pattern
        NotificationPublisher publisher = new NotificationPublisher();
        NotificationSubscriber emailSubscriber = new EmailSubscriber();
        NotificationSubscriber smsSubscriber = new SMSSubscriber();

        publisher.subscribe(emailSubscriber);
        publisher.subscribe(smsSubscriber);

        publisher.notifySubscribers("Observer Pattern Subject", "Observer Pattern Message");
    }
}

