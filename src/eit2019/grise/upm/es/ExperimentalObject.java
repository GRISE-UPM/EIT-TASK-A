package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		List<Integer> list = new ArrayList<Integer>();
		list = getPrimeFactorDecomposition(49);
		System.out.println("My list for 49 = "+Arrays.toString(list.toArray()));
		
		list = getPrimeFactorDecomposition(5);
		System.out.println("My list for 5 = "+Arrays.toString(list.toArray()));
		
		list = getPrimeFactorDecomposition(64);
		System.out.println("My list for 64 = "+Arrays.toString(list.toArray()));
		
		list = getPrimeFactorDecomposition(87);
		System.out.println("My list for 87 = "+Arrays.toString(list.toArray()));
	
		list = getPrimeFactorDecomposition(99);
		System.out.println("My list for 99 = "+Arrays.toString(list.toArray()));
		
		list = getPrimeFactorDecomposition(199);
		System.out.println("My list for 199 = "+Arrays.toString(list.toArray()));
		
		list = getPrimeFactorDecomposition(3863);
		System.out.println("My list for 3863 = "+Arrays.toString(list.toArray()));
		
		
	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		List<Integer> list = new ArrayList<Integer>();

		while (number>1) {
			for(int j = 2; j<=number; j++) {
				if(number%j == 0) {
					list.add(j);
					number = number/j;
					j=number;
				}
			}
		}
		return list;
	}

}
