package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("userBean")
public class UserService implements BeanNameAware , ApplicationContextAware {
    public UserService() {
        System.out.println("UserService is started");
    }

    //1 type to create
//    @Override
//    public void setBeanName(String name) {
//
//    }

    @Override
    public void setBeanName(String name) {
        System.out.println("UserService is set bean name: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("UserService is set applicationContext: " + applicationContext);
    }
}
//callback methods
