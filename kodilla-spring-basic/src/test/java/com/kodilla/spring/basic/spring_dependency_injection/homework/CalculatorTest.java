package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTest {

    @Test
    public void shouldAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double add = bean.add(3, 6);
        Assertions.assertEquals(9, add);
    }

    @Test
    public void shouldSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double divide = bean.subtract(10, 5);
        Assertions.assertEquals(5, divide);
    }

    @Test
    public void shouldMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double multiply = bean.multiply(10, 2);
        Assertions.assertEquals(20, multiply);
    }

    @Test
    public void shouldDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double divide = bean.divide(10, 2);
        Assertions.assertEquals(5, divide);
    }

}