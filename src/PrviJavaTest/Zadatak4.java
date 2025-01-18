package PrviJavaTest;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Zadatak (Metode)
Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre. 
Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju a vraca konvertovanu vrednost.

Podsetnik za konverziju jedinica:
1m = 100 cm
1m = 10 dm
1m = 0.001 km

Primer poziva metode
Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5

U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.

Primer izvrsenja programa:
3.5m je 350cm
3.5m je 35dm
3.5m je 0.0035km

	 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj metara: ");
		double m = s.nextDouble();
		System.out.println("Unesite jedinicu za konverziju (cm/dm/km): ");
		String j = s.next();
		System.out.println(m + "m je " + konverzija(m, j) + " " +j);

	}
	
	public static double konverzija (double metar, String jedinica) {
		if (jedinica.equals("cm")) {
			return metar * 100;
		} else if (jedinica.equals("dm")) {
			return metar * 10;
		} else if (jedinica.equals("km")) {
			return metar * 0.001;
		}
		return 0;
	}

}
