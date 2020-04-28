package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Ford(50));
        cars.add(new Opel(50));
        cars.add(new Bmw(50));

        for(Car car: cars) {
            CarUtils.describeCars(car);
        }

        cars.remove(1);

        cars.remove(new Bmw(60));

        for(Car car: cars) {
            System.out.println("Car which left in the list: " + car);
        }

        System.out.println("Elements in the list: " + cars.size());

    }

}
