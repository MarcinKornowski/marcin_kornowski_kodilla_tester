package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random = new Random();

        Car[] cars = new Car[random.nextInt(15) + 1];
        for(int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for(Car car: cars) {
            CarUtils.describeCars(car);
        }
        //System.out.println(cars.length);

    }

    private static Car drawCar() {

        Random random = new Random();
        int drawCarBrand = random.nextInt(3);//losuje liczby od 0 do 2
        int randomSpeed = random.nextInt(50) + 1;//losuje prędkość
        System.out.println("Random speed is: " + randomSpeed);

        if(drawCarBrand == 0)
            return new Ford(randomSpeed);
        else if(drawCarBrand == 1)
            return new Opel(randomSpeed);
        else {
            return new Bmw(randomSpeed);
        }


    }

}
