package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;

public class PersonSources{
    static List<Arguments> getPersonForTesting() {
        return List.of(
                Arguments.of(new Person(1.55, 45), 18.75),
                Arguments.of(new Person(1.60, 55), 21.48),
                Arguments.of(new Person(1.65, 60), 22.05),
                Arguments.of(new Person(1.70, 65), 23.89),
                Arguments.of(new Person(1.75, 70), 22.87),
                Arguments.of(new Person(1.80, 75), 23.14),
                Arguments.of(new Person(1.85, 85), 24.85),
                Arguments.of(new Person(1.90, 95), 26.31)
        );
    }
}
