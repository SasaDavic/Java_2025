package p04_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji sa tastature ucitava sledece podatke:
				pol osobe 
				cena proizvoda
				da li je proizvod neophodan (unosimo da ili ne)
				I na kraju ispisuje informaciju da li ce se proizvod kupiti. 
				Proizvod se kupuje ako je pol osobe zenski i proizvod je neophodan, nezavisno od cene proizvoda.

		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pol osobe: ");
		String pol = s.next();
		System.out.println("Cena proizvoda: ");
		double cena = s.nextDouble();
		System.out.println("Da li je proizvod neophodan?");
		boolean neophodan = s.nextBoolean();
		
		if (pol.equals("z") && neophodan == true) {
			System.out.println("Proizvod se kupuje");
		} else {
			System.out.println("Proizvod se ne mora kupiti");
		}

	}

}
