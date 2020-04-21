package com.kodilla.abstracts.homework;

public class JobApp {

    public static void main(String[] args) {

        Job driver = new Driver();
        Duties driverDuties = new Duties();

        Job architect = new Architect();
        Duties architectDuties = new Duties();

        Job policeOfficer = new PoliceOfficer();
        Duties policeOfficerDuties = new Duties();


        Person person1 = new Person("Tom", 30, "driver");
        System.out.println(person1.personName);
        driverDuties.showDuties(driver);

        Person person2 = new Person("John", 40, "architect");
        System.out.println(person2.personName);
        architectDuties.showDuties(architect);

        Person person3 = new Person("Mike", 35, "police officer");
        System.out.println(person3.personName);
        policeOfficerDuties.showDuties(policeOfficer);

    }

}
