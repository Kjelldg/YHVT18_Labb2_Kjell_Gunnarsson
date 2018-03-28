package calculatorTests;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.InputMismatchException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

class ExceptionsTest {

	public static Calculator calculator;

	@BeforeEach
	public void Init() {
		// ARRANGE
		calculator = new Calculator();
	}

	@Test
	public void InputContainingLettersShouldThrowInputMissmatchException() {
		assertThrows(InputMismatchException.class, () -> calculator.calculateExpression("12*3g"));
	}

	@Test
	public void DivisionWithZeroShouldThrowArithmeticException() {

		// ACT AND ASSERT
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
	}

	@Test
	public void InputWithBigWhitespaceShouldThrowInputMissmatchException() {
		assertThrows(InputMismatchException.class, () -> calculator.containsWhiteSpace("110/ 6"));
	}

	@Test
	public void InputWithDuplicateArithmeticOperandsShouldThrowInputMissMatchException() {

		// assertThrows(InputMismatchException.class, () ->
		// calc.calculateExpression("%%"));
	}

	@Test
	public void CalculateExpressionMethodShouldReturnAStringWithCharsConveritibleToDoubles() {
		assertThrows(NumberFormatException.class, () -> calculator.resultIsWithinRangeOfDouble("HEJ"));
	}

	@Test
	public void CalculateExpressionMethodShouldNotReturnNull() {
		assertThrows(NullPointerException.class, () -> calculator.resultIsWithinRangeOfDouble(null));
	}

}
