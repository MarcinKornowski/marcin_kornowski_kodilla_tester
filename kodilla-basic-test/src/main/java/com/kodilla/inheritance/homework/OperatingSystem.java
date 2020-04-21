package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int publicationYear;

    public OperatingSystem(int publicationYear) {

        this.publicationYear = publicationYear;

    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void showPublicationYear() {
        System.out.println("The publication year is " + publicationYear);
    }

    public void turnOn() {
        System.out.println("Windows 10 is turning on");
    }

    public void turnOff() {
        System.out.println("Windows 10 is turning off");
    }

}
