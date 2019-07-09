package rpnbdd;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	RPNCalculator calculator;
	String input;
	@Given("RPNCalculator")
	public void rpncalculator() {
		 calculator = new RPNCalculator();
	}

	@When("I give an input as {string}")
	public void iGiveAnInputAs(String string) {
	  this.input = string;
	}

	@Then("I should get {string}")
	public void iShouldGet(String string) {
	    double result = calculator.evaluate(this.input);
	    assertEquals(Double.parseDouble(string),result,0.0001);
	}
}
