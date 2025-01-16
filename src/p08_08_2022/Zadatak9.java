package p08_08_2022;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		/*
Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. 
Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75. 
Pojacaj - akcije koja povecava jacinu zvuka za 10 
smanji - akcija koja smajnjuje jacinu zvuka za 10. 
Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
Na kraju programa odstampati jacinu zvuka.

Primer izvrsenja:
Unesite akciju: pojacaj (iz 75 u 85)
Unesite akciju: pojacaj ( iz 85 u 95)
Unesite akciju: pojacaj (iz 95 u 100)
Unesite akciju: smanji (iz 100 u 90)
Unesite akciju: smanji (iz 90 u 80)
Unesite akciju: play
Jacina zvuka je 80.

		 */
		Scanner s = new Scanner(System.in);
		int jZvuka = 75;
		String akcija = "";
		while(!akcija.equals("play")) {
			System.out.println("Unesite akciju(pojacaj, smanji, play): ");
			akcija = s.next();
			if (akcija.equals("pojacaj")) {
				jZvuka += 10;
			} else if (akcija.equals("smanji")) {
				jZvuka -= 10;
			} 
			if (!akcija.equals("pojacaj") && !akcija.equals("smanji") && !akcija.equals("play")) {
				System.out.println("Niste uneli validnu akciju! Pokusajte ponovo!");
			}
			if (jZvuka > 100) {
				jZvuka = 100;
			} else if (jZvuka < 0) {
				jZvuka = 0;
			}
			
		}
		System.out.println("Jacina zvuka je " + jZvuka + ".");

	}

}
