package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    //Sumuje bilans ze wszystkich bankomatów
    public double totalBalance() {

        double balance = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            balance += cashMachines[i].getBalance();
        }
        return balance;
    }


    //********************************************************************************************
    //Wpłaty

    public double getAverageAllDeposits() {
        double average = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            average += cashMachines[i].getDeposits();
        }

        if(totalNumDeposits() == 0) {
            return 0;
        } else {
            return average / totalNumDeposits();
        }

    }

   public double totalNumDeposits() {
        double deposit = 0;
       for(int i = 0; i < cashMachines.length; i++) {
           deposit += cashMachines[i].getAmountOfDeposits();
       }
       return deposit;

    }


//   *************************************************************************************************
//     Wypłaty
//    średnia ze wszytkich wypłat
    public double getAverageAllWithdrawals() {

        double average = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            average += cashMachines[i].getWithdrawal();
        }
        if(getNumWithdrawals() == 0) {
            return 0;
        } else {
            return average / getNumWithdrawals();
        }
    }

    //iloścć wszystkich transakcji wypłaty
    public int getNumWithdrawals() {
        int withdrawals = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            withdrawals += cashMachines[i].getAmountOfWithdrawals();
        }
        return withdrawals;
    }
}
