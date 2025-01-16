package p08_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
Napisati program koji od korisnika ucitava N brojeva i te brojeve samo odsampa nakon unosa. 
Primer izvrsenja:
Unesite N: 3
Unesite broj: 1
Unet broj je 1.
Unesite broj: 4
Unet broj je 4.
Unesite broj: 9
Unet broj je 9.

		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("Unesite broj: ");
			int a = s.nextInt();
			System.out.println("Unet broj je " + a + ".");
			i++;
		}
		
		
	}

}
