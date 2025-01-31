package p26_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Osoba koja od atributa ima:
 ime i prezime
 jmbg
konstuktor sa parametrima
metodu stampaj koja stampa podatke u formatu
			ime prezime, jmbg

Kreirati klasu Student koja nasledjuje klasu Osoba, 
			koja od dodatnih atributa ima:
broj indeksa
dug za skolarinu 
konstuktor sa parametrima
metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
Napisati metod stampajStudenta da stampa sve podatke o studentu

Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
			koja od dodatnih atributa ima:
naziv predmeta koji predaje
iznos plate
konstuktor sa parametrima
metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
Napisati metodu stampajProfu da stampa sve podatke o profesoru


			U glavnom programu kreirati 2 studenta i 2 profesora.

	(dopuna)
	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu

	 */
		
		
		Student osoba1 = new Student("Milan Markovic", "789654123", 1002, 20000);
		Student osoba2 = new Student("Jovana Markovic", "789659632", 1003, 40000);
		
		Profesor p1 = new Profesor("Marija Cvetkovic", "741258963", "Uvod u topologiju", 150000);
		Profesor p2 = new Profesor("Dragana Cvetkovic", "741257412", "Matematicka analiza 3", 200000);
		
		osoba1.stampaj();
		osoba2.stampaj();
		
		p1.stampaj();
		p2.stampaj();
		System.out.println();
		p2.povecajPlatu(10);
		p2.stampaj();
		System.out.println();
		osoba2.uplatiSkolarinu(10000);
		osoba2.stampaj();
	}

}
