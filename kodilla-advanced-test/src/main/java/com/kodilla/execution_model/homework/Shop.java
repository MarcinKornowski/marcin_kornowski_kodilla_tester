package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    //lista
    private List<Order> orders = new ArrayList<>();

    //dodaje zamówienia
    public void addOrders(Order order) {
        this.orders.add(order);
    }

    //zamówienia z okresu dwóch dat
    public List<Order> getDatesScope(LocalDate startDate, LocalDate endDate) {
        return orders
                .stream()
                .filter(u -> u.getOrderDate().isAfter(startDate) && u.getOrderDate().isBefore(endDate))
                .collect(Collectors.toList());
    }
    public static LocalDate getDate(Order order) {
        return order.getOrderDate();
    }

    //filtruje zamówienia z okreslenego zakresu wartości
    public List<Order> getOrdersScope(double lowest, double highest) {
        return orders
                .stream()
                .filter(u -> u.getOrderValue() >= lowest && u.getOrderValue() <= highest)
                .collect(Collectors.toList());
    }

    //Zwraca ilośc zamowień w kolekcji
    public int getShopSize() {
        return orders.size();
    }

    //suma wartości wszystkich zamóweiń
    public double getSumAll() {
        return orders
                .stream()
                .map(Order::getOrderValue)
                .mapToDouble(u -> u)
                .sum();
    }
}


