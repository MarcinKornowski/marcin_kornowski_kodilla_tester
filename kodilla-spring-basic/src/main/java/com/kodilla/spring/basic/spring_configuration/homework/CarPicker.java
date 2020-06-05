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
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        if(month == 1 || month == 2 || (month == 3 && day <= 20) || (month == 12 && day >= 21)) {
            car = new Suv(time);
        } else if(month == 7 || month == 8 || (month == 6 && day >= 20) || (month == 9 && day <= 22)) {
            car = new Cabrio(time);
        } else {
            car = new Sedan(time);
        }
        return car;

    }

}



