package prevent_withdrawal;

import display_account.*;
import io.cucumber.java8.En;
import org.junit.Assert;
import prevent_account.PreventTeller;

public class DisplayPreventOverdrawnSteps implements En {
    private DisplayCashSlot displayCashSlot = new DisplayCashSlot();
    private ProvideUser provideUser = new ProvideUser();
    private DisplayWithdrawSlot displayWithdrawSlot = new DisplayWithdrawSlot();
    private DisplayUser displayUser = new DisplayUser(provideUser);
    private DisplayAccount displayAccount = new DisplayAccount(displayUser);
    private PreventTeller preventTeller = new PreventTeller(provideUser, displayAccount, displayWithdrawSlot);


    public DisplayPreventOverdrawnSteps() {

        Given("Customer\"Rogers\" credited account with $100", () -> {
            displayAccount.deposit(100, "Rogers");
            Assert.assertEquals(
                    "Customer Rogers credited account with $100",
                    preventTeller.showAmountCredited());
        });

        When("Customer\"Rogers\" try to withdraw $200", () -> {
            preventTeller.getMoney(200, "Rogers");
            Assert.assertEquals(
                    "Customer Rogers try to withdraw " + "$200",
                    preventTeller.withdrawAmount());
        });

        Given("Customer\"Carter\" credited account with $200", () -> {
            displayAccount.deposit(200, "Carter");
            Assert.assertEquals(
                    "Customer Carter credited account with $200",
                    preventTeller.showAmountCredited());
        });

        When("Customer\"Carter\" try to withdraw $300", () -> {
            preventTeller.getMoney(300, "Carter");
            Assert.assertEquals(
                    "Customer Carter try to withdraw " + "$300",
                    preventTeller.withdrawAmount());
        });

        Given("Customer\"Smith\" credited account with $300", () -> {
            displayAccount.deposit(300, "Smith");
            Assert.assertEquals(
                    "Customer Smith credited account with $300",
                    preventTeller.showAmountCredited());
        });

        When("Customer\"Smith\" try to withdraw $400", () -> {
            preventTeller.getMoney(400, "Smith");
            Assert.assertEquals(
                    "Customer Smith try to withdraw " + "$400",
                    preventTeller.withdrawAmount());
        });

        Then("nothing should be dispensed to {string}", (String string) -> {
            Assert.assertEquals("Incorrect account balance", 0 + " nothing should be dispensed to " + string,
                    displayCashSlot.getContent() + " nothing should be dispensed to " + provideUser.getUserName());
        });

        Then("Customer {string} want {int} should be told that he has insufficient balance", (string, int1) -> {
            String inform = preventTeller.information();
            Assert.assertEquals("Customer " + string + " should be told that he has insufficient balance", inform);
        });

    }

}
