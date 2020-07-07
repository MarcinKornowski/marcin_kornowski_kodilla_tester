package prevent_withdrawal;

import display_account.*;
import io.cucumber.java8.En;
import org.junit.Assert;
import prevent_account.PreventTeller;

public class DisplayPreventOverdrawnSteps implements En {
    private DisplayCashSlot displayCashSlot = new DisplayCashSlot();
    private ProvideUser provideUser = new ProvideUser();
    private DisplayUser displayUser = new DisplayUser(provideUser);
    private DisplayAccount displayAccount = new DisplayAccount(displayUser);
    private PreventTeller preventTeller = new PreventTeller(displayCashSlot, provideUser, displayAccount);


    public DisplayPreventOverdrawnSteps() {


        Given("Customer\"Rogers\" credited account with $100", () -> {
            displayAccount.deposit(100, "Rogers");
            Assert.assertEquals("Customer Rogers credited account with $100",
                    preventTeller.showAmountCredited());
            System.out.println(preventTeller.showAmountCredited());
        });

        When("Customer\"Rogers\" try to withdraw $200", () -> {
            //preventTeller.getMoney("Rogers", 200);
            displayAccount.debit(200, "Rogers");
        });

        Given("Customer\"Carter\" credited account with $200", () -> {
            displayAccount.deposit(200, "Rogers");
            Assert.assertEquals("Customer Carter credited account with $200",
                    preventTeller.showAmountCredited());
            System.out.println(preventTeller.showAmountCredited());
        });

        When("Customer\"Carter\" try to withdraw $300", () -> {
            preventTeller.getMoney("Carter", 300);
        });

        Then("nothing should be dispensed to {string}", (String string) -> {
            Assert.assertEquals("Incorrect account balance", 0 + " nothing should be dispensed to " + string,
                    displayCashSlot.getContent() + " nothing should be dispensed to " + provideUser.getUserName());
        });

//        Then("Customer {string} should be told that he has insufficient balance", (String string) -> {
//            String inform = preventTeller.information(displayAccount, 200);
//            Assert.assertEquals("Customer " + string + " should be told that he has insufficient balance", inform);
//            System.out.println(inform);
//        });

        Then("Customer {string} want {int} should be told that he has insufficient balance", (string, int1) -> {
            String inform = preventTeller.information(displayAccount, 200);
            Assert.assertEquals("Customer " + string + " should be told that he has insufficient balance", inform);
            System.out.println(inform);
        });

    }

}
