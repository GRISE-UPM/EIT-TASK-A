package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		// TODO Auto-generated method stub

		getPrimeFactorDecomposition(5);
	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Pair> numbers = new ArrayList<Pair>();
		
		ArrayList<ArrayList<Integer>> listOLists = new ArrayList<ArrayList<Integer>>();
		
		List<Integer> prime = new ArrayList<Integer>();
		
		prime.add(2);
		prime.add(3);
		

		int outcome = 1;	
		while (outcome < number) {
			outcome *= prime.get(0);
			System.out.println(outcome);
		}
			
		
		
		// TODO Method stub
		
		
		
		return list;
	}

}
