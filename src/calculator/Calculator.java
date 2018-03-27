package calculator;

import java.util.InputMismatchException;

/*
 * Created by Kjell, Marcus & Jessica.
 */

public class Calculator {

	public String calculateExpression(String expression) {
		String temp = expression;
		// Remove whitespace if necessary
		if (containsWhiteSpace(temp))
			removeAllWhiteSpace(temp);
		// run method to remove any non digits or mathematical operands
		temp = removeAllNonDigitsExceptAtritmeticOperands(expression);

		// TODO: Write code that parse the expression and returns a string with the
		// expected result.
		temp = parseExpression(temp);

		// RETURN STRING OR EXCEPTION
		if (resultIsWithinRangeOfDouble(temp))
			return temp;
		else
			throw new InputMismatchException("VALUE NOT PARSABLE");
	}

	public String parseExpression(String s) {
		String[] numbers;
		if (s.contains("+")) {
			numbers = s.split("\\p{Punct}");
			return String.valueOf(add(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1])));
		}
		return null;
	}

	public double add(double tal1, double tal2) {
		return tal1 + tal2;
	}

	public double subtract(double tal1, double tal2) {
		return tal1 - tal2;
	}

	public double multiply(double tal1, double tal2) {
		return tal1 * tal2;
	}

	public double divide(double a, double b) {

		if (b == 0)
			throw new ArithmeticException();

		return a / b;
	}

	public double modulus(double a, double b) {
		return a % b;
	}

	public String removeAllWhiteSpace(String s) {
		String temp;
		temp = s.replaceAll("\\s", "");
		return temp;
	}

	public String removeAllNonDigitsExceptAtritmeticOperands(String s) {
		String temp = s;
		for (char c : s.toCharArray()) {

			if (Character.toString(c).matches("\\p{Alpha}")) {
				throw new InputMismatchException();
			}
		}
		temp = s.replaceAll("\\p{Alpha}", "");
		return temp;
	}

	public boolean containsWhiteSpace(String s) {

		String str = s;
		boolean ok = str.contains(" ") ? true : false;
		if (ok == true)
			throw new InputMismatchException();

		return ok;
	}

	public boolean resultIsWithinRangeOfDouble(String s) throws NullPointerException, NumberFormatException {

		try {
			double result = Double.parseDouble(s);
			return result <= Double.MAX_VALUE && result >= Double.MIN_VALUE;
		} finally {

		}
	}

}
