package FizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("Chosen number is divisible by three", () -> {
            this.number = 36;
        });

        Given("Chosen number is divisible by five", () -> {
            this.number = 50;
        });

        Given("Chosen number is divisible by three and five", () -> {
            this.number = 60;
        });

        Given("Chosen number is not divisible by three and five", () -> {
            this.number = 82;
        });

        When("I pass number", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkNumber(number);
        });

        Then("I should get correct {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
