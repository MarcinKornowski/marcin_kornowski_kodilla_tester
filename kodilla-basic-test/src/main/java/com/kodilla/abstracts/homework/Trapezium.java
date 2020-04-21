package com.kodilla.abstracts.homework;

public class Trapezium extends Shape {

    public Trapezium() {
        super(10, 8, 6, 5);
    }

    @Override
    public void getArea() {
        System.out.println("The area of trapezium is " + (((lengthA + lengthB) * height) / 2));
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of trapezium is " + (lengthA + lengthB + 2 * lengthC));
    }
}
