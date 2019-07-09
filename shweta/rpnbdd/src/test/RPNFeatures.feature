
Feature: RPNCalculator

  Scenario: Testing simple multiplication
  Given RPNCalculator
	When I give an input as "100 12 *"
	Then I should get "1200"
	
	Scenario Outline: Testing simple multiplication
  Given RPNCalculator
	When I give an input as <input>
	Then I should get <output>
	
	Examples:
			| input     | output |
			| "10 12 *" | "120"  |
			| "4 5 *"   | "20"   |
  

 