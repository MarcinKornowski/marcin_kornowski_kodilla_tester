package wallet;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if((wallet.getBalance() < amount) || (amount < 0)) {
            cashSlot.dispense(0);
            wallet.debit(0);
        } else {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
    }
}
