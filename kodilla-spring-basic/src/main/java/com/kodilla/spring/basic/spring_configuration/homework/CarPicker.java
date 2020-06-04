package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarPicker {


    @Bean
    public Car pickCar() {
        Car car;
        LocalTime time = LocalTime.of(21, 00);

        LocalDate date = LocalDate.of(2020, 7, 2);
        //LocalDate date = LocalDate.now();

        LocalDate summerStart = LocalDate.of(2020, 6, 1);
        LocalDate summerEnd = LocalDate.of(2020, 9, 30);
        LocalDate winterStart = LocalDate.of(2020, 12, 1);
        LocalDate winterEnd = LocalDate.of(2021, 03, 30);

        if (date.isAfter(summerStart) && date.isBefore(summerEnd)) {
            car = new Cabrio(time);
        } else if (date.isAfter(winterStart) && date.isBefore(winterEnd)) {
            car = new Suv(time);
        } else {
            car = new Sedan(time);
        }
        return car;
    }

}


