package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();
    CashMachine cashMachine4 = new CashMachine();

    Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4});

    //Całkowity balans ze wszystkich bankomatów------------------------------------
    @Test
    public void shouldShowTotalBalanceFromAllCasMachines() {

        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(-100);

        //When
        double totalBalance = bank.totalBalance();

        //Than
        assertEquals(350, totalBalance);
    }


      //Wpłaty-------------------------------------------------------------
      //średnia wpłata
    @Test
    public void shouldShowAverageAmountPaidIn() {

        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);

        //When
        double averageAllDeposits = bank.getAverageAllDeposits();

        //Than
        assertEquals(100, averageAllDeposits);
    }

    //zero gdy brak wpłat
    @Test
    public void shouldShowZeroWhenNoDeposits() {

        //Given
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(-100);

        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(-100);

        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-50);

        cashMachine4.makeTransaction(-100);
        cashMachine4.makeTransaction(-100);
        cashMachine4.makeTransaction(-100);

        //When
        double averageAllDeposits = bank.getAverageAllDeposits();

        //Than
        assertEquals(0, averageAllDeposits);
    }

    //ilość wpłat
    @Test
    public void showTotalNumberOfDepositsMade() {
        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);

        //When
        double totalNumOfDeposits = bank.totalNumDeposits();

        //Than
        assertEquals(8, totalNumOfDeposits);
    }

    //zero gdy brak wpłat
    @Test
    public void ShouldShowZeroWhenNoDeposits() {
        //Given
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(-100);

        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(-100);

        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-50);

        cashMachine4.makeTransaction(-100);
        cashMachine4.makeTransaction(-100);
        cashMachine4.makeTransaction(-100);

        //When
        double totalNumOfDeposits = bank.totalNumDeposits();

        //Than
        assertEquals(0, totalNumOfDeposits);
    }

    //Wypłaty ----------------------------------------------------------------
    //średnia wypłata
    @Test
    public void ShowAverageAmountPaidOut() {
        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);

        //When
        double averageAllWithdrawals = bank.getAverageAllWithdrawals();

        //Than
        assertEquals(-87.5, averageAllWithdrawals);
    }

    //zero gdy brak wypłat
    @Test
    public void ShowAverageAmountPaidOutWhenNoWithdrawalsMade() {
        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);

        //When
        double averageAllWithdrawals = bank.getAverageAllWithdrawals();

        //Than
        assertEquals(0, averageAllWithdrawals);
    }

    //ilość wypłat
    @Test
    public void showTotalNumberOfWithdrawalsMade() {
        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(-100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(-100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(-100);
        cashMachine3.makeTransaction(-50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);

        //When
        double totalNumOfWithdrawals = bank.getNumWithdrawals();

        //Than
        assertEquals(4, totalNumOfWithdrawals);
    }

    //zero gdy brak wypłat
    @Test
    public void showTotalNumberOfWithdrawalsMadeWhenNoWithdrawals() {

        //Given
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(100);
        cashMachine1.makeTransaction(100);

        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(100);
        cashMachine2.makeTransaction(100);

        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(100);
        cashMachine3.makeTransaction(50);

        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        cashMachine4.makeTransaction(100);
        
        //When
        double totalNumOfWithdrawals = bank.getNumWithdrawals();

        //Than
        assertEquals(0, totalNumOfWithdrawals);

    }

}
