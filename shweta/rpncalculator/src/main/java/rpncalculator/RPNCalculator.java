package rpncalculator;

import java.util.Stack;


public class RPNCalculator {

	double firstOperand;
	double secondOperand;
	double result;
	Stack<Double> stack = new Stack<Double>();
	Operations operation;

	public double evaluate(String input) {
		
		// TODO Auto-generated method stub
		String[] tokens = input.split(" ");
		
		for(String token : tokens) {
			
			if(token.equals("+")) {
				operation = new Addition();
				performOperation(stack, operation);
				
			} else if(token.equals("-")) {
				operation = new Subtraction();
				performOperation(stack, operation);
				
			} else if(token.equals("*")) {
				operation = new MUltiplication();
				performOperation(stack, operation);
				
			}else if(token.equals("/")) {
				operation = new Division();
				performOperation(stack, operation);
			}
			else {
				
				pushStack(Double.parseDouble(token));
			}
		}
		
		return popStack();
	}
	private void extractInput() {
		secondOperand = popStack();
		firstOperand = popStack();
	}
	public void performOperation(Stack <Double> stack, Operations operation) {
		secondOperand = popStack();
		firstOperand = popStack();		
		double result=operation.calculate(firstOperand, secondOperand);
		pushStack(result);
		

	}
	public double popStack() {
		return stack.pop();
	}
	public void pushStack(double result) {
		 stack.push(result);
	}
}
