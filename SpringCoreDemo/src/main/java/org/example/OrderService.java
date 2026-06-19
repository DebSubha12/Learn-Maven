package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

   private PaymentService paymentService;

    @Autowired
    //dependency injection by constructor, jodi akta constructor thaka tahole autowired anotation na dileo chole.

    public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
    }

    public void placeOrder(){
         paymentService.pay();
        System.out.println("Order Placed");
    }
}
