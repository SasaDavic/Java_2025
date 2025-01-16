package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
Napisati program koji u sebi ima definisan niz od 10 broja 
(brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. 
K i novu vrednost unosi korisnik.
Primer:
Unesite pozicjiu od 0 do 9: 3
Unesite novu vrednost: 11
Element na 3. poziciji treba na kraju da ima vrednost 11 u 
vasem programu.

	 */

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(10));
		}
		System.out.println(numbers);
		System.out.println("Unesite pozicjiu od 0 do 9:");
		int x = s.nextInt();
		System.out.println("Unesite novu vrednost:");
		int y = s.nextInt();
		numbers.set(x, y);
		System.out.println(numbers);
		
		
	}

}
