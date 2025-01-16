package p05_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		/*
Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
Primer izvrsenja;
Unesite jacinu zvuka: 8
< | | | | | | | |

(Dopuna za vezbanje)
Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute) u sprotnom < | | | (sa brojem crtica jacinom zvuka)

		 */
		
		Scanner s = new Scanner(System.in);
	
	System.out.println("Unesite jacinu zvuka: ");
	int jZvuka = s.nextInt();
	
	while (jZvuka > 10 || jZvuka < 0) {
		System.out.println("Uneli ste nevazecu jacinu zvuka. Pokusajte ponovo!");
			jZvuka = s.nextInt();
		}
	
	if (jZvuka == 0) {
		System.out.println("</");
		} else {
			System.out.print("<");
			for (int i = 0; i < jZvuka; i++) {
				System.out.print(" |");
			}
		}
		

	}

}
