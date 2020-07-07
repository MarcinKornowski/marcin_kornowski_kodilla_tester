package display_account;

public class DisplayAccount {
    private int balance = 0;
    private DisplayUser displayUser;

    public DisplayAccount(DisplayUser displayUser) {

        this.displayUser = displayUser;
    }

    public void deposit(int money, String name) {
        this.balance += money;
        displayUser.showName(name);
    }

    public void debit(int money, String name) {
        this.balance -= money;
        displayUser.showName(name);
    }

    public int getBalance() {
        return balance;
    }

}
