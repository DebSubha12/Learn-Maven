package com.example.SpringBootCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public PaymentProperties getPaymentProperties() {
        return paymentProperties;
    }

    public void print(){
        System.out.println(getPaymentProperties().getType());
        System.out.println(getPaymentProperties().getRetryCount());
        System.out.println(getPaymentProperties().isEnabled());
        System.out.println(getPaymentProperties().getTimeout());
    }
}
