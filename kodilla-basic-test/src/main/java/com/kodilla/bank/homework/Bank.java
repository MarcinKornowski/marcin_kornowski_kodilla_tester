package com.kodilla.bank.homework;

public class Bank {

    private CashMachine cashMachineOne;
    private CashMachine cashMachineTwo;
    private CashMachine cashMachineThree;
    private CashMachine cashMachineFour;

    public Bank() {
        this.cashMachineOne = new CashMachine();
        this.cashMachineTwo = new CashMachine();
        this.cashMachineThree = new CashMachine();
        this.cashMachineFour = new CashMachine();
    }


    //ATM One dodaje transakcje w cash machine one
    public void transactionsCashMachineOne(int cash) {
        this.cashMachineOne.makeTransaction(cash);
    }

    //ATM Two dodaje transakcje w cash machine two
    public void transactionsCashMachineTwo(int cash) {
        this.cashMachineTwo.makeTransaction(cash);
    }

    //ATM Three dodaje transakcje w cash machine three
    public void transactionsCashMachineThree(int cash) {
        this.cashMachineThree.makeTransaction(cash);
    }

    //ATM Four dodaje transakcje w cash machine four
    public void transactionsCashMachineFour(int cash) {
        this.cashMachineFour.makeTransaction(cash);
    }

    //Sumuje bilans ze wszystkich bankomatów
    public double totalBalance() {
        return this.cashMachineOne.getBalance() +
                this.cashMachineTwo.getBalance() +
                this.cashMachineThree.getBalance() +
                this.cashMachineFour.getBalance();
    }


    //********************************************************************************************
    //Wpłaty
    //średnia ze wszytkich wpłat----------
    public double depositCashMachineOne() {
        return this.cashMachineOne.getDeposits();
    }
    public double depositCashMachineTwo() {
        return this.cashMachineTwo.getDeposits();
    }
    public double depositCashMachineThree() {
        return this.cashMachineThree.getDeposits();
    }
    public double depositCashMachineFour() {
        return this.cashMachineFour.getDeposits();
    }
    public double getAverageAllDeposits() {

        double average = depositCashMachineOne() +
                depositCashMachineTwo() +
                depositCashMachineThree() +
                depositCashMachineFour();

        if(totalNumDeposits() == 0) {
            return 0;
        } else {
            return average / totalNumDeposits();
        }

    }//*************

    //ilość wpłat
    public double numDepositCashMachineOne() { return this.cashMachineOne.getAmountOfDeposits(); }
    public double numDepositCashMachineTwo() { return this.cashMachineTwo.getAmountOfDeposits(); }
    public double numDepositCashMachineThree() { return this.cashMachineThree.getAmountOfDeposits(); }
    public double numDepositCashMachineFour() { return this.cashMachineFour.getAmountOfDeposits(); }

    public double totalNumDeposits() {
        double totalDeposits = numDepositCashMachineOne() +
                        numDepositCashMachineTwo() +
                        numDepositCashMachineThree() +
                        numDepositCashMachineFour();
        return totalDeposits;
    }//**************************************************************************************************





    //Wypłaty
    //*************************************************************************************************
    //średnia ze wszytkich wypłat----------

    public double withdrawalCashMachineOne() {
        return this.cashMachineOne.getWithdrawal();
    }
    public double withdrawalCashMachineTwo() {
        return this.cashMachineTwo.getWithdrawal();
    }
    public double withdrawalCashMachineThree() {
        return this.cashMachineThree.getWithdrawal();
    }
    public double withdrawalCashMachineFour() {
        return this.cashMachineFour.getWithdrawal();
    }


    public double getAverageAllWithdrawals() {

        double average = withdrawalCashMachineOne() +
                withdrawalCashMachineTwo() +
                withdrawalCashMachineThree() +
                withdrawalCashMachineFour();

        if(getNumWithdrawals() == 0) {
            return 0;
        } else {
            return average / getNumWithdrawals();
        }

    }//******************

    //iloścć wszystkich transakcji wypłaty
    public int totalWithdrawalsCashMachineOne() { return this.cashMachineOne.getAmountOfWithdrawals(); }
    public int totalWithdrawalsCashMachineTwo() { return this.cashMachineTwo.getAmountOfWithdrawals(); }
    public int totalWithdrawalsCashMachineThree() { return this.cashMachineThree.getAmountOfWithdrawals(); }
    public int totalWithdrawalsCashMachineFour() { return this.cashMachineFour.getAmountOfWithdrawals(); }


    public int getNumWithdrawals() {
        int totalTransaction = totalWithdrawalsCashMachineOne() +
                totalWithdrawalsCashMachineTwo() +
                totalWithdrawalsCashMachineThree() +
                totalWithdrawalsCashMachineFour();
        return totalTransaction;
    }//***************************************************************************************************

    public static void main(String[] args) {

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


        System.out.println(bank.totalBalance());

        System.out.println(bank.totalNumDeposits());

        System.out.println(bank.getAverageAllDeposits());

        System.out.println(bank.getNumWithdrawals());

        System.out.println(bank.getAverageAllWithdrawals());

    }
}
