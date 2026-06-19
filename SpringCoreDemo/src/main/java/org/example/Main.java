package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;



public class Main {
    public static void main(String[] args) {

        //ApplicationContext Basically IOC Container


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();
    }
}


