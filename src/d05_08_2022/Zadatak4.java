package d05_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
Unesite N: 5
Unesite broj: 1
Unesite broj: 2
Unesite broj: 9
Unesite broj: 6
Unesite broj: 8
Srednja vrednost je 5. 
5 jer je celobrojno deljenje!

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
		int avg = suma / n;
		System.out.println("Srednja vrednost je " + avg);

	}

}
