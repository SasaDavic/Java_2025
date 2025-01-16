package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, 
formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
a ostale elemente niza b ispuniti jedinicama.
(niz b je iste duzine kao i niz a)

Unesite N: 6
Unesite broj: 1
Unesite broj: 5
Unesite broj: 2
Unesite broj: 7
Unesite broj: 8
Unesite broj: -1

Niz a: 1, 5, 2, 7, 8, -1
Niz b: 1, 5, 2, 1, 1, 1

	 */
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> nizA = new ArrayList<Integer>();
		ArrayList<Integer> nizB = new ArrayList<Integer>();

		System.out.println("Unesite N:");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj:");
			int x = s.nextInt();
			nizA.add(x);
		}
		for (int i = 0; i < nizA.size(); i++) {
			if (i < 3) {
				nizB.add(nizA.get(i));
			} else {
				nizB.add(1);
			}
		}
		System.out.print("Niz a: ");
		for (int i = 0; i < nizA.size(); i++) {
			System.out.print(nizA.get(i) + ", ");
		}
		System.out.println();
		
		System.out.print("Niz b: ");
		for (int i = 0; i < nizB.size(); i++) {
			System.out.print(nizB.get(i) + ", ");
		}
	}

}
