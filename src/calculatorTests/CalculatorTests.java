package calculatorTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by Kjell, Marcus & Jessica.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

class CalculatorTests {

	public static Calculator calculator;

	@BeforeEach // Instantierar objektet före varje test.
	void Initialize() {
		calculator = new Calculator();
	}

	@Test
	public void ReturnCorrectNumber() {
		// ACT
		double expectedValue = 200;
		double actualValue = Double.parseDouble(calculator.calculateExpression("100+100"));
		// ASSERT
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void ReturnsCorrectMultipliedNumber() {
		// ACT
		double expectedValue = 25d;
		double actualValue = calculator.multiply(5, 5);
		// ASSERT
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void ReturnsCorrectDividedNumber() {
		// ACT
		double expectedValue = 10d;
		double actualValue = calculator.divide(50, 5);
		// ASSERT
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void ReturnsCorrectAddedNumber() {
		// ACT
		double expectedValue = 20d;
		double actualValue = calculator.add(16, 4);
		// ASSERT
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void ReturnsCorrectSubtractedNumber() {
		// ACT
		double expectedValue = 300d;
		double actualValue = calculator.subtract(400, 100);
		// ASSERT
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void ReturnsCorrectModulus() {
		// ACT
		double expectedValue = 0;
		double actualValue = calculator.modulus(20, 20);
		// ASSERT
		assertEquals(expectedValue, actualValue);
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
