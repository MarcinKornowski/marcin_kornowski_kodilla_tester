package com.kodilla.abstracts.homework;

public class Architect extends Job {
    public Architect() {
        super("designs buildings");
    }

    @Override
    public void showSalary() {
        System.out.println(2000);
    }
}
