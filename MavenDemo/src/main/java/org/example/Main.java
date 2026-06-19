package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotificationService notificationService = new PopUpNotification();
        // help of constructor call
        //OrderService order = new OrderService(notificationService);

        //Default construxter help
        OrderService order=new OrderService();
        order.setNotificationService(notificationService);
        order.placeOrder();
    }
}

// A CLASS should ask what it needs and not
// Build everything itself
//IOC --- Inversion of control
//DI --- Dependency Inversion

//Ioc and DI Relationship
//
// IOC id idea or principle
//DI is approch/technique to acheive IOC

//Spring Framework --> IOC Container
//        1.Create objects
//        2.Manage object
//        3.connect object together

//Object ---> called in java
//Spring IOC Container --> called Beans