package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources{
    static Stream<Arguments> getPersonForTesting() {
        return Stream.of(
                Arguments.of(1.60, 40, "Severely underweight"),
                Arguments.of(1.60, 45, "Underweight"),
                Arguments.of(1.60, 50, "Normal (healthy weight)"),
                Arguments.of(1.60, 65, "Overweight"),
                Arguments.of(1.60, 80, "Obese Class I (Moderately obese)"),
                Arguments.of(1.60, 90, "Obese Class II (Severely obese)"),
                Arguments.of(1.60, 110, "Obese Class III (Very severely obese)"),
                Arguments.of(1.60, 120, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.60, 140, "Obese Class V (Super Obese)")
        );
    }
}
