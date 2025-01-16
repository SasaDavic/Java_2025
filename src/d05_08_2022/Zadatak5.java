package d05_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
Unesite N: 5
Unesite broj: 1
Unesite broj: 2
Unesite broj: 0
Unesite broj: 4
Unesite broj: 1
Rezultujuci broj je 12041

	 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		int broj = 0;

		for (int i = 1; i <= n; i++) {
		System.out.println("Unesite broj: ");
			int a = s.nextInt();
			int stepen = (int) Math.pow(10, n - i);
			broj = broj + a*stepen;
			
		}
		System.out.println("Rezultujuci broj je " + broj); 
		
	}

}
