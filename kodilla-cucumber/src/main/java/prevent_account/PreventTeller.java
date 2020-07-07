package prevent_account;

import display_account.*;

public class PreventTeller {
    private DisplayCashSlot displayCashSlot;
    private DisplayAccount displayAccount;
    private DisplayUser displayUser;
    private ProvideUser provideUser;

    public PreventTeller(DisplayCashSlot displayCashSlot, ProvideUser provideUser, DisplayAccount displayAccount) {
        this.displayCashSlot = displayCashSlot;
        this.provideUser = provideUser;
        this.displayAccount = displayAccount;
    }

    public void getMoney(String name, int amount) {
        if((displayAccount.getBalance() < amount) || amount < 0) {
            displayCashSlot.dispense(0);
            displayAccount.debit(0, name);
        } else {
            displayCashSlot.dispense(amount);
            displayAccount.debit(amount, name);
        }
    }

    public String information(DisplayAccount displayAccount, int amount) {
        if(displayAccount.getBalance() - amount <= 0) {
            return "Customer " + provideUser.getUserName() + " should be told that he has insufficient balance";
        } else {
            return "Customer " + provideUser.getUserName() + " balance is $" + displayAccount.getBalance();
        }
    }

    public String showAmountCredited() {
        return "Customer " + provideUser.getUserName() + " credited account with $"
                + displayAccount.getBalance();
    }

    public String checkBalance() {
        return "Customer " + provideUser.getUserName() + " checks balance";
    }

    public String showBalance() {
        return "Customer " + provideUser.getUserName() + " should see account balance $"
                + displayAccount.getBalance();
    }
}
