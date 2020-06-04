package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{

    private LocalTime time;

    public Sedan(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean hasHeadLightsTurnedOn() {
        if(time.isAfter(LocalTime.of(6, 00)) && time.isBefore(LocalTime.of(20, 00))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }

}
