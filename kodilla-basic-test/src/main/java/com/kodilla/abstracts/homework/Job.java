package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String responsibilities;

    public Job(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void showSalary();

}
