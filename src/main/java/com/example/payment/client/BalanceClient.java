package com.example.payment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "balance-service")
public interface BalanceClient {
    @GetMapping("/balance/{accountId}")
    BalanceResult getBalance(@PathVariable String accountId);
}