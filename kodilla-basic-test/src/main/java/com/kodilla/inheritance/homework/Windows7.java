package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {

    public Windows7(int publicationYear) {
        super(publicationYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows7 is turning on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows7 is turning off!");
    }

}
