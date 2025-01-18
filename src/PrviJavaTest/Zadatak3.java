package PrviJavaTest;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Zadatak (While petlja)
Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo unosi lozinku a zatim program od korisnika zahteva unos 
kojim potvrdjuje lozinku sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke. Korisnik moze 
maksimalno 3 puta da pogresi potvrdu lozinke.
Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku “Mogucnost postavljanja lozinke je blokirana”
Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena” 

Primer izvrsenja 1:
Unesite lozinku: sifra123
Potvrdite lozinku: pogresna
Lozinke se ne poklapaju
Potvrdite lozinku: pogresna
Lozinke se ne poklapaju
Potvrdite lozinku: sifra123
Lozinka je uspesno postavljena

Primer izvrsenja 2:
Unesite lozinku: sifra123
Potvrdite lozinku: pogresna
Lozinke se ne poklapaju
Potvrdite lozinku: pogresna
Lozinke se ne poklapaju
Potvrdite lozinku: pogresna
Lozinke se ne poklapaju
Potvrdite lozinku: pogresna
Mogucnost postavljanja lozinke je blokirana

	 */
		Scanner s = new Scanner(System.in);
		int brojac = 0;
		boolean uspesnoPostavljenaLozinka = false;
		System.out.println("Unesite lozinku: ");
		String lozinka = s.next();
		
		while (brojac < 3 && uspesnoPostavljenaLozinka == false) {
			System.out.println("Potvrdite lozinku: ");
			String potvrditeLoz = s.next();
			if (lozinka.equals(potvrditeLoz)) {
				uspesnoPostavljenaLozinka = true;
				System.out.println("Lozinka je uspesno postavljena!");
			} else {
				System.out.println("Lozinke se ne poklapaju");
				brojac++;
			}
		}
		if (brojac == 3) {
			System.out.println("Mogucnost postavljanja lozinke je blokirana!");
		}

	}

}
