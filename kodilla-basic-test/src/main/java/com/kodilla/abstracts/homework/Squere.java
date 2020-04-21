package com.kodilla.abstracts.homework;

public class Squere extends Shape {


    public Squere() {
        super(5,0, 0, 0);
    }

    @Override
    public void getArea() {
        System.out.println("The area of squere is " + (lengthA * lengthA));
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of squere is " + (4 * lengthA));
    }
}
