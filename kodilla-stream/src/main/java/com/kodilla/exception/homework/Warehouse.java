package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();
    private Order order;

    public List<Order> addOrders(Order order) {
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }

}
