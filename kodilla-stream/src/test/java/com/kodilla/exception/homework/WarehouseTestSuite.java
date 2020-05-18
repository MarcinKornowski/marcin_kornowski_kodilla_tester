package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
   @Test
    public void shouldConfirmOrderWhichIsIn() throws OrderDoesntExistException {
       //given
       Warehouse warehouse = new Warehouse();
       warehouse.addOrders(new Order("1"));
       warehouse.addOrders(new Order("2"));
       warehouse.addOrders(new Order("3"));
       warehouse.addOrders(new Order("4"));
       warehouse.addOrders(new Order("5"));
       //when
       Order order  = warehouse.getOrder("4");
       //then
       assertEquals(warehouse.getOrder("4"), order);
   }

   @Test(expected = OrderDoesntExistException.class)
   public void shouldConfirmIfOderIsNotIn() throws OrderDoesntExistException {
      //given
      Warehouse warehouse = new Warehouse();
      warehouse.addOrders(new Order("1"));
      warehouse.addOrders(new Order("2"));
      warehouse.addOrders(new Order("3"));
      warehouse.addOrders(new Order("4"));
      warehouse.addOrders(new Order("5"));
      //when
      Order order  = warehouse.getOrder("9");
      //then
      assertEquals(warehouse.getOrder("4"), order);
   }
}