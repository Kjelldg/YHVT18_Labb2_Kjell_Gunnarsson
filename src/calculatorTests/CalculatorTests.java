package calculatorTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

class CalculatorTests {

	public static Calculator calculator;

	@BeforeEach
	void Initialize() {
		calculator = new Calculator();
	}

	@Test
	public void ReturnCorrectNumber() {
		// ACT
		double expected = 2;
		double actual = Double.parseDouble(calculator.calculateExpression("1+1"));
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void ReturnsCorrectMultipliedNumber() {
		// ACT
		double expected = 12d;
		double actual = calculator.multiply(3, 4);
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void ReturnsCorrectDividedNumber() {
		// ACT
		double expected = 5d;
		double actual = calculator.divide(20, 4);
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void ReturnsCorrectAddedNumber() {
		// ACT
		double expected = 12d;
		double actual = calculator.add(8, 4);
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void ReturnsCorrectSubtractedNumber() {
		// ACT
		double expected = 12d;
		double actual = calculator.subtract(14, 2);
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void ReturnsCorrectModulus() {
		// ACT
		double expected = 0;
		double actual = calculator.modulus(3, 3);
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void ResultIsInBetweenAllowedValues() {
		// ACT
		boolean resultMax = calculator.resultIsWithinRangeOfDouble(String.valueOf(Double.MAX_VALUE));
		boolean resultMin = calculator.resultIsWithinRangeOfDouble(String.valueOf(Double.MIN_VALUE));
		// ASSERT
		assertEquals(true, resultMax);
		assertEquals(true, resultMin);
	}

}
