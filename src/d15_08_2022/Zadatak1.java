package d15_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	 * Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa 
	 * prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje
	 * metode za razlicite vrednosti
	 */
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite vrednost: ");
		int n = s.nextInt();
		stampajVrednostZa10Vecu(n);
		

	}
	
	public static void stampajVrednostZa10Vecu(int vrednost) {
		int x = vrednost + 10;
		System.out.println("Vrednost koje je za 10 veca od broja " + vrednost + " je vrednost " + x);
	}

}
