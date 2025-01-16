package p04_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.

………b=0……………a=22…………………c=50…………

		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite granice opsega: ");
		System.out.println("Donja granica B:");
		int b = s.nextInt();
		System.out.println("Gornja granica C:");
		int c = s.nextInt();
		
		System.out.println("Unesite broj A:");
		int a = s.nextInt();
		
		if(a >= b && a <= c) {
			System.out.println("Broj je u opsegu");
		} else {
			System.out.println("Broj nije u opsegu");
		}

	}

}
