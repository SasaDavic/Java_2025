package p05_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		/*
Napisati program koji od korisnika ucitava 2 cela broja A i B . Program stampa sve brojeve od 1 do 10 osim brojeva A i B
Primer izvrsenja:
Unesite a: 3
Uneiste b: 5
1, 2, 4, 6, 7, 8, 9, 10 => (objasnjenje: 3 i 5 nisu odstampani)

		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite 2 cela broja od 1 do 10.");
		System.out.println("Unesite a: ");
		int a = s.nextInt();
		System.out.println("Unesite b: ");
		int b = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			if (i != a && i != b) {
				System.out.print(i + ", ");
			}
		}
		
		
	}

}
