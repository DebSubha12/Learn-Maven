package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);
//       OrderService order=context.getBean(OrderService.class);
//       order.placeOrder();
//
//       AppCofig appCofig=context.getBean(AppCofig.class);
//       appCofig.demo();

        CartService cart =context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        context.close();
    }
}