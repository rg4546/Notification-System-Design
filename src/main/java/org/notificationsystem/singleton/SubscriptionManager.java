package org.notificationsystem.singleton;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionManager {
    private static SubscriptionManager instance;
    private List<String> subscribedUsers;

    private SubscriptionManager() {
        this.subscribedUsers = new ArrayList<>();
        subscribedUsers.add("user1@example.com"); // Mocked data
        subscribedUsers.add("user2@example.com");
    }

    public static SubscriptionManager getInstance() {
        if (instance == null) {
            instance = new SubscriptionManager();
        }
        return instance;
    }

    public List<String> getSubscribedUsers() {
        return subscribedUsers;
    }
}
