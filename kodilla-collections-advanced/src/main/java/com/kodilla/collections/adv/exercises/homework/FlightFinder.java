package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    List<Flight> searchFlight = FlightRepository.getFlight();

    public List<Flight> getFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for(Flight flight : searchFlight) {
            if(flight.getDeparture().equals(departure)) {
                flightsFrom.add(flight);
            }
        }
        return flightsFrom;
    }

    public List<Flight> getFlightsTo(String arrivals) {
        List<Flight> flightsTo = new ArrayList<>();
        for(Flight flight : searchFlight) {
            if(flight.getArrivals().equals(arrivals)) {
                flightsTo.add(flight);
            }
        }
        return flightsTo;
    }
}
