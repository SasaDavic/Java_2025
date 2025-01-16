package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
Napisati program koji u sebi ima definisan niz od 5 broja 
(brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg 
elementa tog niza.

		 */
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			numbers.add(random.nextInt(50));
		}
		System.out.println(numbers);
		int suma = numbers.get(0) + numbers.get(numbers.size() - 1);
		System.out.println("Sumu nultog i zadnjeg elementa niza " + suma);

	}

}
