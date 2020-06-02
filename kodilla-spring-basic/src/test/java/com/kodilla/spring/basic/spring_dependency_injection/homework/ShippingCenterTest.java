package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTest {

    @Test
    public void shouldProcessDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Wellling Stret 5", 20);
        Assertions.assertEquals("Package delivered to :Wellling Stret 5", delivery);
    }

    @Test
    public void shouldReturnSuccessWhenDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Wellling Stret 5", 20);
        Assertions.assertEquals("Package delivered to :Wellling Stret 5", delivery);
    }

    @Test
    public void shouldReturnFailWhenNotDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Wellling Stret 5", 40);
        Assertions.assertEquals("Package not delivered to :Wellling Stret 5", delivery);
    }

    @Test
    public void shouldReturnMessageWhenSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String notification = bean.success("Wellling Stret 5");
        Assertions.assertNotNull(notification);
    }

    @Test
    public void shouldReturnMessageWhenFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String notification = bean.success("Wellling Stret 5");
        Assertions.assertNotNull(notification);
    }

    @Test
    public void shoutReturnTrueIfPackageLighterThan30Kg() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean packageWeight = bean.deliveryPackage("Wellling Stret 5", 20);
        Assertions.assertTrue(packageWeight);
    }

    @Test
    public void shoutReturnFalseIfPackageHeavierThan30Kg() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean packageWeight = bean.deliveryPackage("Wellling Stret 5", 40);
        Assertions.assertFalse(packageWeight);
    }

}