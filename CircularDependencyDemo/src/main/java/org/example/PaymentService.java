package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    @Autowired
    OrderService orderService;
    public void pay(){
        System.out.println("Payment Done");

        orderService.getOrderDetails();
    }
}

