package d16_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Napisati klasu Proizvod koja ima atribute
naziv proizvoda (String)
cenu proizvoda (double)
težinu proizvoda u gramima. (double)
	i metode:
stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

(DOPUNA -DOMACI 18.08.)
povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da 
menja atribut cena i ova funkcija nema povratnu vrednost.
vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se 
uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez 
ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
za tezinu do 100g, postarina iznosi 200din
za tezinu od 101g do 500g, postarina iznosi 400din
za tezinu preko 500g, postarina iznosi 1000din

U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

	 */
		Proizvod p1 = new Proizvod();
		p1.naziv = "Banane";
		p1.cena = 120;
		p1.tezinaGram = 1021;
		
		p1.stampaj();
		System.out.print("To je " + p1.konvertuj("kg") + " kg");
		System.out.println(",odnosno " + p1.konvertuj("t") + " t");
		System.out.println();
		p1.povecajCenu(80);
		
		
		
		Proizvod p2 = new Proizvod();
		p2.naziv = "Mango";
		p2.cena = 350;
		p2.tezinaGram = 2500;
		p2.stampaj();
		p2.povecajCenu(150);
		
		System.out.print("To je " + p2.konvertuj("kg") + " kg");
		System.out.println(",odnosno " + p2.konvertuj("t") + " t");
		System.out.println("--------------------------------------------------------");
		
		p1.stampaj();
		p2.stampaj();
		System.out.println("--------------------------------------------------------");
		
		p1.stampajCenuSaPopustom(20);
		System.out.println();
		p2.stampajCenuSaPopustom(15);
		
		

	}

}
