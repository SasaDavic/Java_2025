package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
Napisati program koji ucitava niz A duzine N, 
i koji nakon unosa niz A stampa sve elemente niza 
koji su veci od nule.
Primer izvrsenja:
Unesite N: 5
Unesite broj: 1
Unesite broj: -4
Unesite broj: 3
Unesite broj: -7
Unesite broj: 9

Brojevi veci od nule u nizu A su: 1, 3, 9,

		 */
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> nizA = new ArrayList<Integer>();
		
		System.out.println("Unesite N:");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj:");
			int x = s.nextInt();
			nizA.add(x);
		}
		System.out.print("Brojevi veci od nule u nizu A su: ");
		for (int i = 0; i < nizA.size(); i++) {
			if (nizA.get(i) > 0) {
				System.out.print(nizA.get(i) + ", ");
			}
		}
		
		

	}

}
