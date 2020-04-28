package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {

    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increasesSpeed() {
        return this.speed += 30;
        //getSpeed();
    }

    @Override
    public int decreasesSpeed() {
        if(this.speed <= 0) {
            return this.speed = 0;
        } else {
            return this.speed -= 30;
            //getSpeed();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }
}
