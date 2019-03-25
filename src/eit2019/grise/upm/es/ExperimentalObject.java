package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 15;
		 
			try {
				List<Integer> factors = getPrimeFactorDecomposition();
			} catch (NegativeNumbersNotAllowed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static List<Integer> getPrimeFactorDecomposition() throws NegativeNumbersNotAllowed {
		
		
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      int number;
	      number = sc.nextInt();
	      
	      List<Integer> factors = new ArrayList<Integer>();
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
		
		// TODO Method stub
		

	}
			return factors;
}}
