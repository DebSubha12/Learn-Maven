package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);
       OrderService order=context.getBean(OrderService.class);
       order.placeOrder();

       AppCofig appCofig=context.getBean(AppCofig.class);
       appCofig.demo();
    }
}