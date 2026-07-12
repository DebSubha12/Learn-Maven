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

    public void setPaymentProperties(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }
}
