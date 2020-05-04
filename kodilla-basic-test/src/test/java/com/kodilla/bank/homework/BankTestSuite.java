package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    //Całkowity balans ze wszystkich bankomatów------------------------------------
    @Test
    public void shouldShowTotalBalanceFromAllCasMachines() {
        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(250, bank.totalBalance());

    }


      //Wpłaty-------------------------------------------------------------
      //średnia wpłata
    @Test
    public void shouldShowAverageAmountPaidIn() {

        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(100, bank.getAverageAllDeposits(), 0.01);
    }

    //zero gdy brak wpłat
    @Test
    public void shouldShowZeroWhenNoDeposits() {

        Bank bank = new Bank();

        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(-100);

        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(-100);


        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(-100);
        bank.transactionsCashMachineFour(-100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(0, bank.getAverageAllDeposits(), 0.01);

    }

    //ilość wpłat
    @Test
    public void showTotalNumberOfDepositsMade() {
        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(7, bank.totalNumDeposits(), 0.01);
    }

    //zero gdy brak wpłat
    @Test
    public void ShouldShowZeroWhenNoDeposits() {
        Bank bank = new Bank();

        bank.transactionsCashMachineOne(-100);

        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(-100);


        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(-100);
        bank.transactionsCashMachineFour(-100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(0, bank.totalNumDeposits(), 0.01);
    }


    //Wypłaty ----------------------------------------------------------------
    //średnia wypłata
    @Test
    public void ShowAverageAmountPaidOut() {

        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(-90, bank.getAverageAllWithdrawals(), 0.01);

    }

    //zero gdy brak wypłat
    @Test
    public void ShowAverageAmountPaidOutWhenNoWithdrawalsMade() {

        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineOne(50);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineThree(100);

        assertEquals(0, bank.getAverageAllWithdrawals(), 0.01);
    }

    //ilość wypłat
    @Test
    public void showTotalNumberOfWithdrawalsMade() {
        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(-100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(-100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);
        bank.transactionsCashMachineThree(-100);
        bank.transactionsCashMachineOne(-50);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineThree(-100);

        assertEquals(5, bank.getNumWithdrawals(), 0.01);
    }

    //zero gdy brak wypłat
    @Test
    public void showTotalNumberOfWithdrawalsMadeWhenNoWithdrawals() {
        Bank bank = new Bank();

        bank.transactionsCashMachineOne(100);
        bank.transactionsCashMachineOne(100);

        bank.transactionsCashMachineTwo(100);
        bank.transactionsCashMachineTwo(100);


        bank.transactionsCashMachineThree(100);

        bank.transactionsCashMachineFour(100);
        bank.transactionsCashMachineFour(100);

        assertEquals(0, bank.getNumWithdrawals(), 0.01);
    }

}
