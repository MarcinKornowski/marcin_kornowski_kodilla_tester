package com.kodilla.abstracts.homework;

public class PoliceOfficer extends Job {
    public PoliceOfficer() {
        super("protects people");
    }

    @Override
    public void showSalary() {
        System.out.println(1800);
    }
}
