package com.kodilla.abstracts.homework;

public abstract class Shape {

    int lengthA;
    int lengthB;
    int lengthC;
    int height;

    public Shape(int lengthA, int lengthB, int lengthC , int height) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.height = height;
    }

    public int getLengthA() {
        return lengthA;
    }

    public int getLengthB() {
        return lengthB;
    }

    public int getHeight() {
        return height;
    }

    public abstract void getArea();

    public abstract void getPerimeter();


}
