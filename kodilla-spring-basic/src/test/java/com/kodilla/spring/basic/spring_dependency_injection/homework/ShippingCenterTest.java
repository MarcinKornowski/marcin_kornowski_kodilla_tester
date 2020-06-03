package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTest {

    ApplicationContext context;
    @Before public void initialize() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void shouldProcessDelivery() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Wellling Stret 5", 20);
        Assertions.assertEquals("Package delivered to :Wellling Stret 5", delivery);
    }

    @Test
    public void shouldReturnSuccessWhenDelivered() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Wellling Stret 5", 20);
        Assertions.assertEquals("Package delivered to :Wellling Stret 5", delivery);
    }

    @Test
    public void shouldReturnFailWhenNotDelivered() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Wellling Stret 5", 40);
        Assertions.assertEquals("Package not delivered to :Wellling Stret 5", delivery);
    }

    @Test
    public void shouldReturnMessageWhenSuccess() {
        NotificationService bean = context.getBean(NotificationService.class);
        String notification = bean.success("Wellling Stret 5");
        Assertions.assertNotNull(notification);
    }

    @Test
    public void shouldReturnMessageWhenFail() {
        NotificationService bean = context.getBean(NotificationService.class);
        String notification = bean.success("Wellling Stret 5");
        Assertions.assertNotNull(notification);
    }

    @Test
    public void shoutReturnTrueIfPackageLighterThan30Kg() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean packageWeight = bean.deliveryPackage("Wellling Stret 5", 20);
        Assertions.assertTrue(packageWeight);
    }

    @Test
    public void shoutReturnFalseIfPackageHeavierThan30Kg() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean packageWeight = bean.deliveryPackage("Wellling Stret 5", 40);
        Assertions.assertFalse(packageWeight);
    }

//    @After
//    public void deleteOutputFile() {
//        context.delete();
//    }

}