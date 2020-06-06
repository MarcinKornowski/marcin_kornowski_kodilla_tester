package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

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
        Assertions.assertTrue(showLights);
    }


    private static Stream<Arguments> provideCar() {
        return Stream.of(
                Arguments.of("Sedan", false),
                Arguments.of("Cabrio", false),
                Arguments.of("Suv", false),
                Arguments.of("Sedan", true),
                Arguments.of("Cabrio", true),
                Arguments.of("Suv", true)
        );
    }
    @ParameterizedTest
    @MethodSource(value = "provideCar")
    public void showNextCar(String expectedCar, boolean expectedLights) {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("pickCar");
        //When
        String showCar = car.getCarType();
        boolean showLights = car.hasHeadLightsTurnedOn();
        //Than
        Assertions.assertEquals(expectedCar, showCar);
        Assertions.assertEquals(expectedLights, showLights);
    }
}
