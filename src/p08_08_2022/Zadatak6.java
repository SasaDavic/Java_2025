package p08_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		/*
Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
Primer:
Unesite broj:1
Unesite broj:2
Unesite broj:2
Unesite broj:3
Unesite broj:0
Unesite broj:5
Unesite broj:3
Unesite broj:4

Kraj programa
Objasnjenje: Od svakih brojeva: 1, 2, 3 i 4 je unet po jedan.

		 */
		Scanner s = new Scanner(System.in);
		int brojac1 = 0;
		int brojac2 = 0;
		int brojac3 = 0;
		int brojac4 = 0;
		
		while (brojac1 < 1 || brojac2 < 1 || brojac3 < 1 || brojac4 < 1 ) {
			System.out.println("Unesite broj:");
			int broj = s.nextInt();
			if (broj == 1) {
				brojac1++;
			} else if (broj == 2) {
				brojac2++;
			} else if (broj == 3) {
				brojac3++;
			} else if (broj == 4) {
				brojac4++;
			}
		}
		System.out.println("Kraj programa");

	}

}
