package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void searchDeparture() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> departureList = FlightRepository.getFlight();
        departureList.add(new Flight("Toronto", "Dubai"));
        departureList.add(new Flight("Toronto", "Paris"));
        //when
        List<Flight> result = flightFinder.getFlightsFrom("Toronto");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Toronto", "Dubai"));
        expectedList.add(new Flight("Toronto", "Paris"));
        assertEquals(expectedList, result);
    }

    @Test
    public void searchArrivals() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> arrivalsList = FlightRepository.getFlight();
        arrivalsList.add(new Flight("Toronto", "Dubai"));
        arrivalsList.add(new Flight("London", "Dubai"));
        //when
        List<Flight> result = flightFinder.getFlightsTo("Dubai");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Toronto", "Dubai"));
        expectedList.add(new Flight("London", "Dubai"));
        assertEquals(expectedList, result);

    }


}