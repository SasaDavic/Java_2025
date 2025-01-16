package d05_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. 
Na kraju programa prikazati sumu.
Primer izvrsenja:
Unesite N: 5
Unesite broj: 1
Unesite broj: 2
Unesite broj: 9
Unesite broj: 6
Unesite broj: 8
Suma parnih brojeva je 16
Objasnjenje: 2 + 6 + 8 = 16

	 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj: ");
			int a = s.nextInt();
			if (a % 2 == 0) {
				suma += a;
			}
			
		}
		System.out.println("Suma je " + suma);
		
		
		
	}

}
