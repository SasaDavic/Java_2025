package d08_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		/*
Napisati program koji od korisnika ucitava stanje na racunu a zatim sa racuna skida dok god ima 
sredstava za transakciju. U slucaju da nema dovoljno sredstava ispisati odgovarajucu gresku.
Primer izvrsenja:
Unesite stanje na racunu: 100
Na racunu imate $100, Unesite sumu za sledecu transakciju: 50
Na racunu imate $50, Unesite sumu za sledecu transakciju: 31
Na racunu imate $19, Unesite sumu za sledecu transakciju: 20
Nemate dovoljno sredstava na racunu.Na racunu vam je ostalo $19

		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite stanje na racunu: ");
		int stanje = s.nextInt();
		boolean activeLoop = true;
		while(activeLoop == true) {
			System.out.println("Na racunu imate $" + stanje + ", Unesite sumu za sledecu transakciju: ");
			int transakcija = s.nextInt();
			if (transakcija <= stanje) {
				stanje -= transakcija;
			} else {
				activeLoop = false;
			}
		}
		System.out.println("Nemate dovoljno sredstava na racunu. Na racunu vam je ostalo $" + stanje);

	}

}
