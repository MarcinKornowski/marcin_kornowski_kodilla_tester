package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#getPersonForTesting")
    public void shouldReturnPersonBMI(double heightInMeter, double weightInKilograms, String expected) {
        //when
        Person person = new Person(heightInMeter, weightInKilograms);
        //then
        assertEquals(expected, person.getBMI());
    }
}
