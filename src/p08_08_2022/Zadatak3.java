package p08_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika trazi da unosi brojeve sve dok ne unese nulu. 
U ovom programu nemamo N kao u proslom zadataku.
Primer: 
Unesite broj: 1
Unesite broj: 3
Unesite broj: 5
Unesite broj: 0
Posto je uneta nula, to je kraj.

	 */

		Scanner s = new Scanner(System.in);
		int i = 1;
		while(i != 0) {
			System.out.println("Unesite broj: ");
			i = s.nextInt();
		}
		System.out.println("Posto je uneta nula, to je kraj.");
		
	}

}
