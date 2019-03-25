package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		//Number to be factorized
		Integer number = 12;
		
		// Call exception
		if(number <= 0) {
			throw new NegativeNumbersNotAllowed ("Number should not be lower than zero");
		}
		
		//Call function
		List<Integer> factorList = getPrimeFactorDecomposition(number);
		
		//Print results
		System.out.println(factorList.toString());
	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		//Create list of factors
		List<Integer> list = new ArrayList<Integer>();
		
		for(int factor=2; factor<=number; ) {
			if(number%factor == 0) { // If the number divided by factor has no decimals
				list.add(factor); //Add the factor to the list
				number = number/factor; // Divide the number by the factor
			}else {
				factor++; //If the factor is not useful, add ones
			}
		}
		
		return list;
	}

}
