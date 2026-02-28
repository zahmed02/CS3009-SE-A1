package com.alphasoft.exercise5.external;

public class MockPayService {
    public void simulatePayment(double amount) {
        System.out.println("[MockPayService] Simulating payment of $" + amount);
    }
}
