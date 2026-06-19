package org.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // jodi 2 to bean thake tahole confusion create hoi, tokhon akta primary annotation dile seta age priority pabe
public class UpiPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("paying using UpiPayment");
    }
}
