package com.example.SpringBootCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
		//PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);




//		System.out.println(paymentGateway.getPaymentProperties().getType());
//		System.out.println(paymentGateway.getPaymentProperties().getRetryCount());
//		System.out.println(paymentGateway.getPaymentProperties().isEnabled());
//		System.out.println(paymentGateway.getPaymentProperties().getTimeout());
	}

}
