package p08_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		/*
Napisati program koji ucitava N brojeva od korisnika i prikazuje koliko je K brojeva uneto.N i K unosi korisnik
Unesite N: 4
Unesite K: 1
Unesite broj: 1
Unesite broj: 2
Unesite broj: 4
Unesite broj: 1
	Uneto je 2 broja koja imaju vrednost 1. (jer su unete dve jedinice)

		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N: "); //koliko brojeva unosimo
		int n = s.nextInt();
		System.out.println("Unesite K: "); //koje brojeve brojimo
		int k = s.nextInt();
		int brojac = 0;
		
		while (n > 0) {
			System.out.println("Unesite broj: ");
			int broj = s.nextInt();
			if (broj == k) {
				brojac++;
			}
			n--;
		}
		System.out.println("Uneto je " + brojac + " broja koja imaju vrednost " + k);

	}

}
