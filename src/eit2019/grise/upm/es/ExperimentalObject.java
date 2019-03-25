package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.Debug;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12;
		try {
			List<Integer> factors = getPrimeFactorDecomposition(i);
			System.out.println(factors);
		} catch (NegativeNumbersNotAllowed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		
		int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;

	}

}
