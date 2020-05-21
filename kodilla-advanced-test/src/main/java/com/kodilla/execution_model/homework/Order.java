package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String personLogin;

    public Order(double orderValue, LocalDate orderDate, String personLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.personLogin = personLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getPersonLogin() {
        return personLogin;
    }
}
