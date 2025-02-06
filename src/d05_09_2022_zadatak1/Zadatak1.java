package d05_09_2022_zadatak1;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	Kreirati klasu Sektor koja ima:
 naziv sektora
 platu koja je za taj sektor

Kreirati abstraktnu klasu Radnik koja ima:
 ime i prezime
 niz sektora u kojima radi
 abstraktnu metodu koja vraca platu radnika
 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
 suma plata svih sektor / broj sektora * 0.5
 override uje metodu za platu, tako da se plata racuna po formuli:
(prosecna plata za sve sektore u kojima radi) * (broj sektora).

U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

	 */
		Sektor proizvodnja = new Sektor("Proizvodnja", 50000);
		Sektor logistika = new Sektor("Logistika", 70000);
		Sektor prodaja = new Sektor("Prodaja", 80000);
		Sektor finansije = new Sektor("Finansije", 120000);
		Sektor ljudskiResursi = new Sektor("Ljudski resursi", 65000);
		
		Menadzer menadzer = new Menadzer("Milan Mitic");
		menadzer.zaposliSeUSektor(prodaja);
		menadzer.zaposliSeUSektor(finansije);
		menadzer.zaposliSeUSektor(ljudskiResursi);
		
		Magacioner magacioner = new Magacioner("Dragan Dragic");
		magacioner.zaposliSeUSektor(prodaja);
		magacioner.zaposliSeUSektor(proizvodnja);
		magacioner.zaposliSeUSektor(logistika);
		
		ArrayList<Radnik> radnici = new ArrayList<>();
		radnici.add(magacioner);
		radnici.add(menadzer);
		
		for (int i = 0; i < radnici.size(); i++) {
			System.out.println(radnici.get(i).getPunoIme());
			System.out.println("Plata: " + radnici.get(i).plata());
		}

	}

}
