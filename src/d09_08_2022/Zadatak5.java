package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji ucitava niz stringova duzine N, 
	 * tako da ucitavanje elemenata u niz a bude obrnuto. 
		Primer:
		Unesite N: 4
		Unesite string: xxx1
		Unesite string: xxx4
		Unesite string: xxx6
		Unesite string: xxx9

		Niz a: xxx9, xxx6, xxx4, xxx1
		Komentar: Stanje niza a u memoriji je:
			a[0]="xxx9",
			a[1]="xxx6",
			a[2]="xxx4",
			a[3]="xxx1",

	 */
		Scanner s = new Scanner(System.in);
		ArrayList<String> nizA = new ArrayList<String>();
		
		System.out.println("Unesite N:");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			nizA.add(" ");
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite string:");
			String x = s.next();
			nizA.set(n-1-i, x);
		}

		System.out.print("Niz a: ");
		for (int i = 0; i < nizA.size(); i++) {
			System.out.print(nizA.get(i) + ", ");
		}
		
	}

}
