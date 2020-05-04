package com.kodilla.bank.homework;

public class CashMachine {

    private int[] deposit;
    private int transaction;

    public CashMachine() {

        this.deposit = new int[0];
        this.transaction = 0;

    }

    //Dodaje transakcje do tablicy deposit
    public void makeTransaction(int amount) {
        transaction++;
        int[] newDeposit = new int[this.transaction];
        System.arraycopy(deposit, 0, newDeposit, 0, deposit.length);
        newDeposit[this.transaction - 1] = amount;
        this.deposit = newDeposit;
    }

    //zwraca array deposit
    public int[] getAmount() {
        return this.deposit;
    }

    //pokazuje balans całkowity
    public double getBalance() {
        int sum = 0;
        for(int i = 0; i < this.deposit.length; i++) {
             sum += this.deposit[i];
        }
        return sum;

    }

    //sumuje wszystkie wpłaty
    public int getDeposits() {
        int sumDeposit = 0;
        for(int i = 0; i < this.deposit.length; i++) {
             if(deposit[i] > 0) {
               sumDeposit += this.deposit[i];
             }
        }
        return sumDeposit;
    }


    //Pokazuje ilośc transakcji wpłaty
    public int getAmountOfDeposits() {
        int transactionDeposit = 0;
        for(int i = 0; i < this.deposit.length; i++) {
            if(this.deposit[i] > 0) {
                transactionDeposit++;
            }
        }
        return transactionDeposit;
    }

    //Sumuje wypłate
    public int getWithdrawal() {
        int sumWithdrawal = 0;
        for(int i = 0; i < this.deposit.length; i++) {
            if(this.deposit[i] < 0) {
                sumWithdrawal+= this.deposit[i];
            }
        }
        return sumWithdrawal;
    }

    //Pokazuje ilośc transakcji wypłaty
    public int getAmountOfWithdrawals() {
        int transactionWithdrawal = 0;
        for(int i = 0; i < this.deposit.length; i++) {
            if(this.deposit[i] < 0) {
                transactionWithdrawal++;
            }
        }
        return transactionWithdrawal;
    }

}
