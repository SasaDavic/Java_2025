package d05_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. 
N nam kaze koliko broja ce korisnik da unese.
Primer izvrsenja:
Unesite N: 3
Unesite broj: 1
Unesite broj: 4
Unesite broj: 9
Suma je 14.

	 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj: ");
			int a = s.nextInt();
			suma += a;
		}
		System.out.println("Suma je " + suma);
		
	}

}
