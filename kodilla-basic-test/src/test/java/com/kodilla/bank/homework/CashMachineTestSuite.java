package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CashMachineTestSuite {

    //Sprawdza czy tablica jest pusta
    @Test
    public void shouldReturnZeroBalance() {
        CashMachine cashMachine = new CashMachine();
        int[] deposit = cashMachine.getAmount();
        assertEquals(0, deposit.length);
    }

    //Sprawdza czy elementy są dodawane do tablicy
    @Test
    public void shouldAddThreeElementsToArray() {

        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(200);
        cashMachine.makeTransaction(-50);


        int[] deposit = cashMachine.getAmount();
        assertEquals(3, deposit.length);
        assertEquals(100, deposit[0]);
        assertEquals(200, deposit[1]);
        assertEquals(-50, deposit[2]);

    }

    //Pokazuje balans
   @Test
    public void shouldShowTotalBalance() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(200);
        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(100);

        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-50);

        Assertions.assertEquals(400, cashMachine.getBalance(), 0.01);

   }
    //Wpłaty************************************************************************
    //Pokazuje sumę wpłat
    @Test
    public void shouldShowTotalDeposits() {

        CashMachine cashMachine = new CashMachine();

        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(200);
        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(100);

        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-250);

        Assertions.assertEquals(500, cashMachine.getDeposits(), 0.01);

    }
    //Pokazuje zero gdy nie ma wpłat
    @Test
    public void shouldShowZeroWhenNoDeposits() {

        CashMachine cashMachine = new CashMachine();

        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-250);

        Assertions.assertEquals(0, cashMachine.getDeposits(), 0.01);
    }

    //Pokazuje liczbę transakcji wpłaty
    @Test
    public void shouldShowNumberOfDeposits() {

        CashMachine cashMachine = new CashMachine();

        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(200);
        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(100);

        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-250);

        Assertions.assertEquals(4, cashMachine.getAmountOfDeposits());

    }

    //Powinno okazać zerową ilość wpłąt gdy ich brak
    @Test
    public void shouldShowZeroWhenNumOfDepositsIsZero() {

        CashMachine cashMachine = new CashMachine();

        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(-250);

        Assertions.assertEquals(0, cashMachine.getAmountOfDeposits());

    }

    //Wypłaty***********************************************************************

    //Pokazuje sumę wypłat
   @Test
    public void showTotalWithdrawals()  {

       CashMachine cashMachine = new CashMachine();

       cashMachine.makeTransaction(100);
       cashMachine.makeTransaction(200);
       cashMachine.makeTransaction(100);
       cashMachine.makeTransaction(100);


       cashMachine.makeTransaction(-50);
       cashMachine.makeTransaction(-250);

       Assertions.assertEquals(-300, cashMachine.getWithdrawal(), 0.01);
   }

   //Pokazuje zero gdy nie ma wypłat
   @Test
   public void shouldShowZeroWhenNoWithdrawals(){

       CashMachine cashMachine = new CashMachine();

       cashMachine.makeTransaction(100);
       cashMachine.makeTransaction(200);
       cashMachine.makeTransaction(100);
       cashMachine.makeTransaction(100);

       Assertions.assertEquals(0, cashMachine.getWithdrawal(), 0.01);

   }

   //pokazuje liczbę transakcji wypłaty
   @Test
   public void shouldShowNumberOfWithdrawals() {

       CashMachine cashMachine = new CashMachine();

       cashMachine.makeTransaction(100);
       cashMachine.makeTransaction(200);
       cashMachine.makeTransaction(100);
       cashMachine.makeTransaction(100);

       cashMachine.makeTransaction(-50);
       cashMachine.makeTransaction(-50);
       cashMachine.makeTransaction(-250);

       Assertions.assertEquals(3, cashMachine.getAmountOfWithdrawals());
   }

    //Powinno pokazać zerową ilość wypłąt gdy ich brak
    @Test
    public void shouldShowZeroWhenNumOfWithdrawalsIsZero() {

        CashMachine cashMachine = new CashMachine();

        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(200);
        cashMachine.makeTransaction(100);
        cashMachine.makeTransaction(100);

        Assertions.assertEquals(0, cashMachine.getAmountOfWithdrawals());
    }
}
