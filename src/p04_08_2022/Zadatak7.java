package p04_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		/*
Napisati program koji simulira ponasanje kontrole za zvuk na 
jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
Korisnik unosi akciju sa tastature. Jednu od sledecih:
pojacaj - pojacava zvuka za 10
smanji - smanjuje zvuk za 10.
mute - postavlja zvuk na 0.
Na kraju programa odstampati jacinu zvuka
Primer izvrsenja 1:
Jacina zvuka je 75.
Unesite akciju: pojacaj
Nova jacina zvuka je 85

		 */
		
		Scanner s = new Scanner(System.in);
		
		int jacinaZvuka = 75;
		
		System.out.println("Jacina zvuka je " + jacinaZvuka + ".");
		System.out.println("Unesite akciju (pojacaj/smanji/mute):");
		String akcija = s.next();
		
		if (akcija.equals("pojacaj")) {
			jacinaZvuka += 10;
		} else if (akcija.equals("smanji")) {
			jacinaZvuka -= 10;
		} else if (akcija.equals("mute")) {
			jacinaZvuka = 0;
		} else {
			System.out.println("Uneli ste navazecu akciju!");
		}
		
		System.out.println("Nova jacina zvuka je " + jacinaZvuka);
		
		

	}

}
