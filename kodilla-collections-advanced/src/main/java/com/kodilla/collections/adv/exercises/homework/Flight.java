package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {

    private String departure;
    private String arrivals;

    public Flight(String departure, String arrivals) {
        this.departure = departure;
        this.arrivals = arrivals;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrivals() {
        return arrivals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrivals, flight.arrivals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrivals);
    }
}
