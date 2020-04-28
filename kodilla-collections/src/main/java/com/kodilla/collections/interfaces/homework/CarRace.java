package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(100);
        doRace(ford);

        Opel opel = new Opel(100);
        doRace(opel);

        Bmw bmw = new Bmw(100);
        doRace(bmw);

    }

    public static void doRace(Car car) {
        car.increasesSpeed();
        car.increasesSpeed();
        car.increasesSpeed();
        car.decreasesSpeed();
        car.decreasesSpeed();
        System.out.println(car.getSpeed());
    }

}
