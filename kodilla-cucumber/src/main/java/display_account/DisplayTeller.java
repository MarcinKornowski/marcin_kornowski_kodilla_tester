package display_account;

public class DisplayTeller {
    private DisplayCashSlot displayCashSlot;
    private DisplayAccount displayAccount;
    private ProvideUser provideUser;

    public DisplayTeller(DisplayCashSlot displayCashSlot, ProvideUser provideUser, DisplayAccount displayAccount) {
        this.displayCashSlot = displayCashSlot;
        this.provideUser = provideUser;
        this.displayAccount = displayAccount;
    }

    public void getMoney(int amount, String name) {
        if((displayAccount.getBalance() < amount) || amount < 0) {
            displayCashSlot.dispense(0);
            displayAccount.debit(0, name);
        } else {
            displayCashSlot.dispense(amount);
            displayAccount.debit(amount, name);
        }
    }

    public String showAmountCredited() {
        return "User " + provideUser.getUserName() + " credited account with $"
                + displayAccount.getBalance();
    }

    public String checkBalance() {
        return "User " + provideUser.getUserName() + " checks balance";
    }

    public String showBalance() {
        return "User " + provideUser.getUserName() + " should see account balance $"
                + displayAccount.getBalance();
    }
}
