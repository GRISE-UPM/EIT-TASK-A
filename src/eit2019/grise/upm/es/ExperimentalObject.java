package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
	
	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		//Create list of factors
		List<Integer> list = new ArrayList<Integer>();
		
		for(int factor=2; factor<=number; ) {
			if(number%factor == 0) { 
				list.add(factor);
				number = number/factor; 
			}
			else {
				factor++; 
			}
		}
		
		return list;
	}

}
