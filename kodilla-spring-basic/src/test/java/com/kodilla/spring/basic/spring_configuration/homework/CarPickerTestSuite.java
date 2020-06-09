package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarPickerTestSuite {

    @Test
    public void shouldReturnCarWithLightsOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("pickCar");
        //When
        String showCar = car.getCarType();
        System.out.println(showCar);
        boolean showLights = car.hasHeadLightsTurnedOn();
        //Then
        Assertions.assertEquals("Sedan", showCar);
    }
}
