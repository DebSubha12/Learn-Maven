package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

public class OrderService {
    //EmailService notification = new EmailService();

    NotificationService notificationService ;

    //NotificationService KA Object using Constructor
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    //default constructor
    public OrderService() {

    }

    //NotificationService KA Object using Setter
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public  void placeOrder() {
        System.out.println("Order Service");
        notificationService.sendNotification();
    }
}
