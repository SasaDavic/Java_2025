package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
	 * Napisati metodu stampajApsolutnuVrednost, 
	 * koja stampa apsolutnu vrednost   prosledjene vrednosti.

	 */

		
		apsolutnaVrednost(12);
		apsolutnaVrednost(-5);
		apsolutnaVrednost(0);
	}
	public static void apsolutnaVrednost(int x) {
		int aps = Math.abs(x);
		System.out.println("Apsolutna vrednost broja " + x + " je "
				+ aps);
	}

}
