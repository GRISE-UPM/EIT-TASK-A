package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i=1;;i++) {
			if (number/i==0) {
				list.add(i);
				if(i!=number/i) {
					list.add(number/i);
				}
			}
		}
		// TODO Method stub
		
		return list;
	}

}
