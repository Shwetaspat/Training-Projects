package rpncalculator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {
	RPNCalculator2 rpnCalculator = new RPNCalculator2();
	double result;
	@Test
	public void testSimpleAddition() {
		result = rpnCalculator.evaluate("10 12 +");
		assertEquals(22, result, 0.0001);
		
	}
	@Test
	public void testSimpleSubtraction() {
		result = rpnCalculator.evaluate("10 12 -");
		assertEquals(-2, result, 0.0001);
		assertEquals(78 ,rpnCalculator.evaluate("100 22 -") , 0.0001);
	}
	@Test
	public void testSimpleMultiplication() {
		result = rpnCalculator.evaluate("10 12 *");
		assertEquals(120, result, 0.0001);
		
	}
	@Test
	public void testSimpleDivision() {
		result = rpnCalculator.evaluate("10 5 /");
		assertEquals(2, result, 0.0001);
		
	}
	@Test
	public void testComplexOperations() {
		assertEquals(46 ,rpnCalculator.evaluate("10 12 3 * +") , 0.0001);
		assertEquals(38 ,rpnCalculator.evaluate("100 50 / 10 9 + * ") , 0.0001);
	}
	
}
