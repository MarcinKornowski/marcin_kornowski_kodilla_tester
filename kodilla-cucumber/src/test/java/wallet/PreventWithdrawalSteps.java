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

        When("I have requested $199 money from my wallet", () -> {
            this.teller.withdraw(wallet, 199);
        });

        When("I have requested $200 money from my wallet", () -> {
            this.teller.withdraw(wallet, 200);
        });

        When("I have requested $201 money from my wallet", () -> {
            this.teller.withdraw(wallet, 201);
        });

        When("I have requested $0 money from my wallet", () -> {
            this.teller.withdraw(wallet, 0);
        });

//        Then("I should receive $199 from my wallet", () -> {
//            Assert.assertEquals(199, cashSlot.getContents());
//        });
//
//        Then("I should receive $200 from my wallet", () -> {
//            Assert.assertEquals(200, cashSlot.getContents());
//        });
//
//        Then("I should receive $0 from my wallet", () -> {
//            Assert.assertEquals(0, cashSlot.getContents());
//        });

        Then("I should receive $ {int} from my wallet", (Integer int1) -> {
            Assert.assertEquals(int1, cashSlot.getContents());
        });

    }

}
