package com.example.balance;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    @CommandHandler
    public void handleBalance(BalanceCommand command) {
        // Handle balance logic
    }
    @EventHandler
    public void on(BalanceEvent event) {
        // Handle balance event
    }
    @QueryHandler
    public BalanceResult handle(BalanceQuery query) {
        // Handle balance query
        return null;
    }
}