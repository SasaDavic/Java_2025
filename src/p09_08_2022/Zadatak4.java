package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Napisati program koji u sebi ima definisan niz od 5 broja 
(brojevi su proizvoljni) i koji prikazuje element na poziciji K. 
K unosi korisnik.
Primer:
Unesite pozicjiu: 2
Na pozicji 2 je vrednost 7.

	 */
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numbers.add(random.nextInt(10));
		}
		System.out.println(numbers);
		System.out.println("Unesite pozicjiu: ");
		int x = s.nextInt();
		int a = numbers.get(x);
		System.out.println("Na pozicji " + x + " je vrednost " + a);

	}

}
