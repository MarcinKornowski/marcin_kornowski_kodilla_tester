package display_account;

public class DisplayWithdrawSlot {
    private int cash;

    public int getCash() {
        return  cash;
    }

    public void dispenseCash(int amount) {
        this.cash = amount;
    }
}
