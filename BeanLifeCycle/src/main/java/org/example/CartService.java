package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService {

    private Map<Integer, String> map;

    public CartService() {
        map = new HashMap<>();
        System.out.println("CartService Constructor Called");
    }

    @PostConstruct
    public void start() {
        System.out.println("Bean is ready");
        map.put(1, "Adi");
        map.put(2, "Soyad");
    }

    public void addToCart() {
        System.out.println("Adding to cart");
    }

    public String getValue(int key) {
        return map.get(key);
    }

    @PreDestroy
    public void stop() {
        map.clear();
        System.out.println("Bean is stopped");
    }

//    @Override
//    public void destroy() throws Exception {
//        map.clear();
//        System.out.println("Bean destroyed");
//    }

//    public String getCart() {
//        System.out.println("Getting cart");
//        return map.toString();
//    }

    // Uncomment if you want to use InitializingBean instead of @PostConstruct

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet() Called");
//        map.put(1, "Adi");
//        map.put(2, "Soyad");
//    }
}