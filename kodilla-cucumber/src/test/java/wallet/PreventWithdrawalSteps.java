package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventWithdrawalSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);


    public PreventWithdrawalSteps() {

        Given("I have $200 in my wallet", () -> {
            this.wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I have requested $-50 money from my wallet", () -> {
            this.teller.withdraw(wallet, -50);
        });

        When("I have requested $0 money from my wallet", () -> {
            this.teller.withdraw(wallet, 0);
        });

        When("I have requested $100 money from my wallet", () -> {
            this.teller.withdraw(wallet, 100);
        });

        When("I have requested $199 money from my wallet", () -> {
            this.teller.withdraw(wallet, 199);
        });

        When("I have requested $200 money from my wallet", () -> {
            this.teller.withdraw(wallet, 200);
        });

        When("I have requested $201 money from my wallet", () -> {
            this.teller.withdraw(wallet, 201);
        });

        When("I have requested $300 money from my wallet", () -> {
            this.teller.withdraw(wallet, 300);
        });

        Then("I should receive $ {int} from my wallet", (int1) -> {
            Assert.assertEquals(int1, cashSlot.getContents());
        });

    }

}
