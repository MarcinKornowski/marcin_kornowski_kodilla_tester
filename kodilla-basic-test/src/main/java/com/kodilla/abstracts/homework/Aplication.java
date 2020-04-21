package com.kodilla.abstracts.homework;

public class Aplication {

    public static void main(String[] args) {

        Shape squere = new Squere();
        Shape rectangle = new Rectangle();
        Shape trapezium = new Trapezium();

        squere.getArea();
        squere.getPerimeter();

        rectangle.getArea();
        rectangle.getPerimeter();

        trapezium.getArea();
        trapezium.getPerimeter();

    }

}
