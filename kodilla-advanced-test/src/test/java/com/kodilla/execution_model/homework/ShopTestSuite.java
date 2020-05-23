package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(15.0, LocalDate.of(2020,05,05), "johnSmith");
    Order order2 = new Order(25.0, LocalDate.of(2020,05,10), "johnSmith");
    Order order3 = new Order(50.0, LocalDate.of(2020, 05,15), "tomYork");
    Order order4 = new Order(75.0, LocalDate.of(2020,05,20), "tonyHank");
    Order order5 = new Order(100.0, LocalDate.of(2020, 05, 25), "aliceSmoke");
    Order order6 = new Order(125.0, LocalDate.of(2020, 05, 30), "aliceSmoke");
    Order order7 = new Order(150.0, LocalDate.of(2020,06,05), "tonyHank");

    //Sprawdza czy zamówienia są dodane do kolekcji
    @Test
    public void shouldAddOrdersToShop() {
        //when
        int numOfOrders = shop.getShopSize();
        //then
        assertEquals(7, numOfOrders);
    }

    //Sprawdza pobrane zamówienia z określonego zakresu wartości
    @Test
    public void shouldReturnExpectedScopeOfOrdersValue() {
        //when
        int ordersActual = shop.getOrdersScope(30, 110).size();
        //then
        assertEquals(3, ordersActual);
    }

    //Sprawdza czy na podstawie podanych dat zawraca odpowiednie zamówienia
    @Test
    public void shouldReturnExpectedScopeOfOrdersDate() {
        //when
        int datesActual = shop.getDatesScope(
                LocalDate.of(2020,05,10),
                LocalDate.of(2020,06,05))
                .size();
        //then
        assertEquals(4, datesActual);
    }

    //Sprawdza ilośc zamówień w kolekcji
    @Test
    public void shouldReturnAmountOfOrdersInShop() {
        //given
        int numOfOrdersInShop = shop.getShopSize();
        //than
        assertEquals(7, numOfOrdersInShop);
    }

    //sumuje wartośc wszystkich zamówień
    @Test
    public void shouldSumUpAllOrdersValue() {
        //when
        double sumOrders = shop.getSumAll();
        //then
        assertEquals(540, sumOrders);
    }

    @BeforeEach
    public void initializeOrders() {
        shop.addOrders(order1);
        shop.addOrders(order2);
        shop.addOrders(order3);
        shop.addOrders(order4);
        shop.addOrders(order5);
        shop.addOrders(order6);
        shop.addOrders(order7);
    }
}