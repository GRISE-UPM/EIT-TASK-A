package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		List<Integer> list = new ArrayList<Integer>();  // lista de resultados
		
		// TODO Method stub

		// buscar el menor numero primo divisor
		// dividir el numero entre dicho primo divisor
		// repetir 
		
		assert number>1;
		
		// empezar con el numero primo 2 como primer factor a probar
		int factor = 2;
		
		while (factor <= number)
		{
			// si es divisible
			while (number % factor == 0 ) {
				list.add(new Integer(factor));	// se añade a la lista
				number = number/factor;			// se divide para continuar
			}
			
			// si no fuera divisible, se continua
			factor++;
		}
		
		return list;
	}       
}
