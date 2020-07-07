package display_account;

public class DisplayCashSlot {
    private int content;

    public int getContent() {
        return content;
    }

    public void dispense(int amount) {
        this.content = amount;
    }
}
