package com.example.SpringBootCoreDemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {

    private final PaymentGateway paymentGateway;

    public DemoRunner(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(ApplicationArguments args) {

        System.out.println(paymentGateway.getPaymentProperties().getType());
        System.out.println(paymentGateway.getPaymentProperties().getRetryCount());
        System.out.println(paymentGateway.getPaymentProperties().isEnabled());
        System.out.println(paymentGateway.getPaymentProperties().getTimeout());
    }
}