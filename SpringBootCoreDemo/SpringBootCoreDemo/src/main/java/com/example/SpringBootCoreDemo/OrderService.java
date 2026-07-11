package com.example.SpringBootCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    @Autowired
    public void OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
