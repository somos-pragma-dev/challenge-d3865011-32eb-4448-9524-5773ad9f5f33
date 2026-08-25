package com.example.notification;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @CommandHandler
    public void handleNotification(NotificationCommand command) {
        // Handle notification logic
    }
    @EventHandler
    public void on(NotificationEvent event) {
        // Handle notification event
    }
    @QueryHandler
    public NotificationResult handle(NotificationQuery query) {
        // Handle notification query
        return null;
    }
}