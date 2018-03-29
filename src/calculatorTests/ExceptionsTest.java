package calculatorTests;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Created by Kjell, Marcus & Jessica.
 */

import java.util.InputMismatchException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

class ExceptionsTest {

	public static Calculator calculator;

	@BeforeEach // Instantierar objektet före varje test.
	public void Init() {
		calculator = new Calculator();
	}

	@Test
	public void InputContainingLettersShouldThrowInputMissmatchException() {
		assertThrows(InputMismatchException.class, () -> calculator.calculateExpression("18*2g"));
	}

	@Test
	public void DivisionWithZeroShouldThrowArithmeticException() {

		// ACT AND ASSERT
		assertThrows(ArithmeticException.class, () -> calculator.divide(200, 0));
	}

	@Test
	public void InputWithBigWhitespaceShouldThrowInputMissmatchException() {
		assertThrows(InputMismatchException.class, () -> calculator.containsWhiteSpace(" 9 / 3"));
	}

	@Test
	public void InputWithDuplicateArithmeticOperandsShouldThrowInputMissMatchException() {

	}

	@Test
	public void CalculateExpressionMethodShouldReturnAStringWithCharsConveritibleToDoubles() {
		assertThrows(NumberFormatException.class, () -> calculator.resultIsWithinRangeOfDouble("TEST"));
	}

	@Test
	public void CalculateExpressionMethodShouldNotReturnNull() {
		assertThrows(NullPointerException.class, () -> calculator.resultIsWithinRangeOfDouble(null));
	}

}
