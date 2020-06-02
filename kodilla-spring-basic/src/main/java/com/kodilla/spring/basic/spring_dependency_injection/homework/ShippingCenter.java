package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {

    @Resource(name = "notificationService")
    private NotificationService notificationService;

    @Resource(name = "deliveryService")
    private DeliveryService deliveryService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliveryPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }

}
