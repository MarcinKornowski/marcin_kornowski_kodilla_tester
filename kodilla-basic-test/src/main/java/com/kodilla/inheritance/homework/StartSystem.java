package com.kodilla.inheritance.homework;

public class StartSystem {

    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(2015);
        operatingSystem.turnOn();
        operatingSystem.showPublicationYear();
        operatingSystem.turnOff();

        WindowsVista windowsVista = new WindowsVista(2006);
        windowsVista.turnOn();
        windowsVista.showPublicationYear();
        windowsVista.turnOff();

        Windows7 windows7 = new Windows7(2009);
        windows7.turnOn();
        windows7.showPublicationYear();
        windows7.turnOff();
    }

}
