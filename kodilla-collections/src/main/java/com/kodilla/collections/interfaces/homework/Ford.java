package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car{

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increasesSpeed() {
        return this.speed += 20;
        //getSpeed();
    }

    @Override
    public int decreasesSpeed() {
        if(this.speed <= 0) {
            return this.speed =  0;
        } else {
            return this.speed -= 30;
            //getSpeed();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}
