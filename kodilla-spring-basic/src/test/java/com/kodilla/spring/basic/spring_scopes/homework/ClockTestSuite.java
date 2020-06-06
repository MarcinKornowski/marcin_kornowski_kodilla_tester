package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void showTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock timeOne = context.getBean(Clock.class);
        Clock timeTwo = context.getBean(Clock.class);
        Clock timeThree = context.getBean(Clock.class);

        Assertions.assertNotEquals(timeOne, timeTwo);
        Assertions.assertNotEquals(timeTwo, timeThree);
        Assertions.assertNotEquals(timeOne, timeThree);

    }

}