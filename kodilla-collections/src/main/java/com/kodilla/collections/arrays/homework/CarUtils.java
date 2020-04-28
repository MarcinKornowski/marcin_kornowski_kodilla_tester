package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {

    public static void describeCars(Car car) {
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car speed is: " + car.getSpeed());
        System.out.println("Car increased speed is: " + car.increasesSpeed());
        System.out.println("Car decreased speed is: " + car.decreasesSpeed());
    }

    private static String getCarBrand(Car car) {
        if(car instanceof Ford)
            return "Ford";
       else if(car instanceof Opel)
            return "Opel";
        else if(car instanceof Bmw)
           return "Bmw";
       else {
           return "Unknown brand of the car";
        }
    }

}
