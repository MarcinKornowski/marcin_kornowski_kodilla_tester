package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlight() {
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("Helsinki", "Berlin"));
        flightsList.add(new Flight("Helsinki", "Toronto"));
        flightsList.add(new Flight("Toronto", "Dubai"));
        flightsList.add(new Flight("Toronto", "Paris"));
        flightsList.add(new Flight("Dubai", "Pekin"));
        flightsList.add(new Flight("Dubai", "London"));
        flightsList.add(new Flight("London", "Dubai"));
        return flightsList;
    }

}
