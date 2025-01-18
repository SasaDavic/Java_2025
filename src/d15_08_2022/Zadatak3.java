package d15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. 
METODA NISTA NE STAMPA.
ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int x = s.nextInt();
		System.out.println("Unesite drugi broj: ");
		int y = s.nextInt();
		System.out.println("Nova vrednost je " + spojiBrojeve(x, y));

	}
	//pp je da je novi broj takodje int ne String
	public static int spojiBrojeve (int a, int b) {
		if (a < 0 || b < 0) {
			return 0;
		}
		if (b < 10) {
			return a * 10 + b;
		} else if (b < 100) {
			return a * 100 + b;
		} else if (b < 1000) {
			return a * 1000 + b;
		}
		return 0;
	}

}
