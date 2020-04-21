package com.kodilla.abstracts.homework;

public class Driver extends Job {

    public Driver() {
        super("drives a lorry");
    }

    @Override
    public void showSalary() {
        System.out.println(1000);
    }
}
