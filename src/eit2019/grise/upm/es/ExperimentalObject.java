package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {

		System.out.println(getPrimeFactorDecomposition(1));
		System.out.println(getPrimeFactorDecomposition(2));
		System.out.println(getPrimeFactorDecomposition(6));
		System.out.println(getPrimeFactorDecomposition(5));
		System.out.println(getPrimeFactorDecomposition(15));
		System.out.println(getPrimeFactorDecomposition(99));
		System.out.println(getPrimeFactorDecomposition(100));
		System.out.println(getPrimeFactorDecomposition(123467));
	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		if (number < 0) {
			throw new NegativeNumbersNotAllowed();
		}

		List<Integer> list = new ArrayList<Integer>();

		int testDigit = 2;
		while (number >= testDigit) {
			if (number % testDigit == 0) {
				list.add(testDigit);
				number = number / testDigit;
			}

			testDigit++;
		}

		return list;
	}

}
