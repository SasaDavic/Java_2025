package p04_08_2022;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		/*
Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
Korisnik unosi 5 akcija. Jednu od sledecih:
pojacaj - pojacava zvuka za 10
smanji - smanjuje zvuk za 10.
mute - postavlja zvuk na 0.
Na kraju programa odstampati jacinu zvuka.
NAPOMENA: Jacina zvuka nikad ne moze da ode iznad 100 niti da padne ispod 0.

Primer izvrsenja: 
Unesite akciju: pojacaj (objasnjenj: nakon ovoga je 85)
Unesit akciju: pojacaj (objasnjenje: nakon ovoga je 95)
Unesite akciju: pojacaj (objasnjeje: nakon ovoga je 100, jer ne moze da bude 105)
Unesit akciju: mute (ovjasnjenje: nakon ovoga je 0)
Unesit akciju: smanji (objasnjenje: nakon ovoga ostaje 0)
Jacina zvuka je 0.

		 */
		
		Scanner s = new Scanner(System.in);
		int jacinaZvuka = 75;
		int brojac = 0;
		
		while (brojac < 5) {
			System.out.println("Unesite akciju (pojacaj, smanji, mute): ");
			String akcija = s.next();
			if (akcija.equals("pojacaj")) {
				jacinaZvuka += 10;
			} else if (akcija.equals("smanji")) {
				jacinaZvuka -= 10;
			} else if (akcija.equals("mute")) {
				jacinaZvuka = 0;
			} else {
				System.out.println("Uneli ste pogresnu akciju!");
			}
			if (jacinaZvuka > 100) {
				jacinaZvuka = 100;
			}
			if (jacinaZvuka < 0) {
				jacinaZvuka = 0;
			}
			brojac++;
		}

		System.out.println("Jacina zvuka je " + jacinaZvuka);
		

	}

}
