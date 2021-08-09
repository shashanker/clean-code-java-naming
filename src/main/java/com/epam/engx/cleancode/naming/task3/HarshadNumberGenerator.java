package com.epam.engx.cleancode.naming.task3;

public class HarshadNumberGenerator {

	
	private static final int DECIMAL_BASE = 10;
	private static final String LINE_SEPARATOR = "\n";

	public String generate(Long limit) {
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= limit; i++) {
			if (i % calculateSumOfDigits(i) == 0) {
				result.append(i).append(LINE_SEPARATOR);
			}
		}
		return result.toString();
	}

	private int calculateSumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % DECIMAL_BASE;
            number = number / DECIMAL_BASE;
        }
		return sum;
	}

}
