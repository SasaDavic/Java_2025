package p04_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 i deljiv sa 3.
			Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.

		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite ceo broj: ");
		int a = s.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Broj koji ste uneli je deljiv sa 2.");
		}
		if (a % 3 == 0) {
			System.out.println("Broj koji ste uneli je deljiv sa 3.");
		}

	}

}
