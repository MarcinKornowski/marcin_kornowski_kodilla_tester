package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double adding = a + b;
        this.display.display(adding);
        return adding;
    }

    public double subtract(double a, double b) {
        double subtracting = a - b;
        this.display.display(subtracting);
        return subtracting;
    }

    public double multiply(double a, double b) {
        double multiplying = a * b;
        this.display.display(multiplying);
        return multiplying;
    }

    public double divide(double a, double b) {
        double dividing = a / b;
        this.display.display(dividing);
        return dividing;
    }

}
