package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService implements DeliveryServiceInterFace {

    @Override
    public boolean deliveryPackage(String address, double weight) {
        if(weight > 30) {
            return false;
        }
        return true;
    }

}
