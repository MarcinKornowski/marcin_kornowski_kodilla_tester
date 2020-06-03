package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarPicker {

    @Bean
    public Car pickCar(String season) {
        Car car;
        if(season.equals("autumn") || season.equals("spring")) {
            car = new Sedan();
        } else if(season.equals("summer")) {
            car = new Cabrio();
        } else {
            car = new Suv();
        }
        return car;
    }

}
