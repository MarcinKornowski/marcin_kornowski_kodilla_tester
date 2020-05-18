package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrders(new Order("1"));
        warehouse.addOrders(new Order("2"));
        warehouse.addOrders(new Order("3"));
        warehouse.addOrders(new Order("4"));
        warehouse.addOrders(new Order("5"));
        try {
            Order order = warehouse.getOrder("5");
            System.out.println("Order number " + order.getNumber() + " is in the Warehouse");
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no such order in the Warehouse");
        } finally {
            System.out.println("Thank you for your enquiry");
        }
    }
}
