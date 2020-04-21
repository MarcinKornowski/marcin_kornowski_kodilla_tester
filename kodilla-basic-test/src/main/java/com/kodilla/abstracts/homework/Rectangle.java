package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle() {
        super(5, 10, 0, 0);
    }

    @Override
    public void getArea() {
        System.out.println("The area of rectangle is " + (lengthA * lengthB));
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of rectangle is " + ((2 * lengthA) + (2 * lengthB)));
    }
}
