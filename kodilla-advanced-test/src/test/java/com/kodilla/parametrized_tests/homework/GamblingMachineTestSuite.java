package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1)

    public void shouldReturnSetOfNumbersFromZeroToSix(int number1,
          int number2,
          int number3,
          int number4,
          int number5,
          int number6) throws InvalidNumbersException {

        Set<Integer> input = new HashSet<>();
        input.add(number1);
        input.add(number2);
        input.add(number3);
        input.add(number4);
        input.add(number5);
        input.add(number6);

        GamblingMachine gamblingMachine = new GamblingMachine();
        int checkNum = gamblingMachine.howManyWins(input);
        assertTrue(checkNum >= 0 && checkNum <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineWithFiveNum.csv", numLinesToSkip = 1)

    public void shouldReturnSetOfNumbersFromZeroToSix_withException(int number1,
          int number2,
          int number3,
          int number4,
          int number5,
          int number6
    ) throws InvalidNumbersException {

        Set<Integer> input = new HashSet<>();
        input.add(number1);
        input.add(number2);
        input.add(number3);
        input.add(number4);
        input.add(number5);

        GamblingMachine gamblingMachine = new GamblingMachine();

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(input));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineWithFiveNum.csv", numLinesToSkip = 1)

    public void shouldReturnExceptionWhenNegativeNumberIsProvided(int number1,
        int number2,
        int number3,
        int number4,
        int number5,
        int number6
    ) throws InvalidNumbersException {

        Set<Integer> inputs = new HashSet<>();
        inputs.add(number1);
        inputs.add(number2);
        inputs.add(number3);
        inputs.add(number4);
        inputs.add(number5);
        inputs.add(number6);

        inputs.stream().anyMatch(input -> input < 1);

        GamblingMachine gamblingMachine = new GamblingMachine();

        int checkNum = gamblingMachine.howManyWins(inputs);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputs));

    }

}