package org.itstep;

public class AppRuner {

	public static void main(String[] args) {

		int result = 0;

		try {
			result = 23 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Wrong operation!");
		}

		System.out.println(result);

	}

}
