package d15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
	/*
(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

Primer izvrsenja: 
izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

Napomena: Resiti bez koriscenja petlji. 

	 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite a:");
		int a = s.nextInt();
		System.out.println("Unesite b:");
		int b = s.nextInt();
		System.out.println("Izmedju broja " + a + " i broja " + b + " je " + prebrojiCeleBrojeve(a, b) + " broja!");

	}
	
	public static int prebrojiCeleBrojeve(int a, int b) {
		if (a <= b) {
			return b - a - 1;
		} else return a - b - 1;
	}

}
