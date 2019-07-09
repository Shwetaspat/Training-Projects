package simpleCalculatorSoap;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import defaultnamespace.Calculator;
import defaultnamespace.CalculatorService;

public class Steps {
	int firstNumber;
	int secondNumber;
	 Calculator calculatorClient;

	@Given("RPNCalculator Soap Service")
	public void rpncalculatorSoapService() {
	    // Write code here that turns the phrase above into concrete actions
CalculatorService service = new CalculatorService();
calculatorClient = service.getCalculator();}

	@When("I give an input as {int} and {int}")
	public void iGiveAnInputAsAnd(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	   this.firstNumber = int1;
	   this.secondNumber = int2;
	}

	@Then("I should get output as {int}")
	public void iShouldGetOutputAs(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
   int result = calculatorClient.add(this.firstNumber,this.secondNumber);
    assertEquals(int1,result,0.0001);}
}
