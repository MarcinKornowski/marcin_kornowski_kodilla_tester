package com.kodilla.inheritance.homework;

public class WindowsVista extends OperatingSystem {

    public WindowsVista(int publicationYear) {
        super(publicationYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows Vista is turning on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows Vista is turning off!");
    }

}
