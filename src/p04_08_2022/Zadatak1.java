package p04_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispisuje da li je broj b manji od broja a. 
		 * A i B unosimo sa tastature.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite A:");
		int a = s.nextInt();
		System.out.println("Unesite B:");
		int b = s.nextInt();
		if (a < b) {
			System.out.println("B je veci od broja A");
		} else  if (a > b) {
			System.out.println("B je manji od broja A");
		} else {
			System.out.println("A i B su isti!");
		}

	}

}
