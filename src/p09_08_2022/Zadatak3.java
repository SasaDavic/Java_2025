package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
	 Napisati program koji u sebi ima definisan niz od 5 broja 
	 (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog 
	 (na poziciji nula) i zadnjeg elemnta niza.

	 */
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			number.add(random.nextInt(10));
		}
		System.out.println(number);
		int a = number.get(0);
		int b = number.get(number.size() - 1);
		number.set(0, b);
		number.set(number.size() - 1, a);
		System.out.println(number);

	}

}
