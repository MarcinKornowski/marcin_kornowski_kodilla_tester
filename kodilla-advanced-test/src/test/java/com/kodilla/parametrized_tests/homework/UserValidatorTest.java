package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {

    UserValidator user = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {
            "JohnSmiths",
            "John_Smiths",
            "John-Smiths",
            "John.Smiths",
            "JohnSmiths1980",
            "johnsmiths1980",
            "john.smiths",
            "john_smiths",
            "john-smiths",
            "johnSmiths",
            "johnSmiths1980",
            "john_Smiths",
            "john-Smiths",
            "john.Smiths",
            "JoS",
            "JOs",
            "jos"
    })
    public void shouldReturnTrueIfUserNameIsCorrect(String userName) {
        assertTrue(user.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Js", "js", "J1", "S1", "s1", "j1", "S-", "12", "    "})
    public void shouldReturnFalseIfUserNameIsIncorrect(String userName) {
        assertFalse(user.validateUsername(userName));
    }


    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfStringIsEmpty(String userName) {
        assertFalse(user.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "smiths@gmail.com",
            "Smiths@gmail.com",
            "john.smiths1980@gmail.c",
            "john.Smiths1980@gmail.co",
            "john.smiths@gmail.come",
            "john.Smiths@gmail.comee",
            "John.smiths@gmail.comeee",
            "John.smiths1980@gmail.com",
            "john_smiths@gmail.com",
            "john_Smiths@gmail.com",
            "John_smiths@gmail.com",
            "john_smiths1980@gmail.com",
            "john_Smiths1980@gmail.com",
            "John_smiths1980@gmail.com",
            "john-smiths@gmail.com",
            "John.Smiths@gmail.com",
            "JohnSmiths@gmail.comerc",
            "John.Smiths1980@gmail.com",
            ""})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(user.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "  ",
            "johnSmithsgmail.com",
            "johnsmiths@gmailcom",
            "john@smith@gmail.com",
            "john smiths@gmail.com",
            "johnSmiths@gmail.comerce",
            "john.Smiths@gmail.comerce",
            "JohnSmiths.@gmail.comerc",
            })
    public void shouldReturnFalseIfEmailIsIncorrect(String email) {
        assertFalse(user.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfAddressIsEmpty(String email) {
        assertTrue(user.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfAddressIsNull(String email) {
        assertFalse(user.validateEmail(email));
    }


}