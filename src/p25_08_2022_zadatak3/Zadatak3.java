package p25_08_2022_zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Za potrebe google istorije potrebno je kreirati sledece klase.

Klasu HistoryPage koja ima:
naziv stranice
link do stranice 
vreme otvaranja stranice - sat i minut (2 atributa)
username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
konstuktore koji su logicni
gettere i setter (username i password nemaju settere)
metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
Metoda obrisi kolacice koja setuje username i password na null.
Metoda stampaj koja stampa podatke u formatu:
[sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]

Klasu History koja ima:
niz stranica koje su posecene
metoda otvori stranicu koja dodaje novi historypage u niz.
metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
metoda obrisi istoriju - metoda brise celu istoriju
metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
metoda pogledajIstoriju - stampa sve posecene stranice
metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

	 */
		
		HistoryPage h1 = new HistoryPage("YouTube", "www.youtube.com", 10, 32);
		HistoryPage h2 = new HistoryPage("Google", "www.google.com", 11, 45);
		HistoryPage h3 = new HistoryPage("Wikipedia", "www.wikipedia.com", 12, 19);
		HistoryPage h4 = new HistoryPage("Outlook", "www.outlook.com", 15, 55);
		HistoryPage h5 = new HistoryPage("GoogleMaps", "www.googlemaps.com", 16, 12);
		
		History history = new History();
		history.otvoriStranicu(h1);
		history.otvoriStranicu(h2);
		history.otvoriStranicu(h3);
		history.otvoriStranicu(h4);
		history.otvoriStranicu(h5);
		
		history.sacuvacKredencijale("YouTube", "p123", "000");
		history.sacuvacKredencijale("Wikipedia", "A123", "000");
		history.sacuvacKredencijale("Outlook", "B123", "000");
		history.sacuvacKredencijale("Google", "C123", "000");
		
		history.pogledajIstoriju();
		
		history.sacuvacKredencijale("GoogleMaps", "novo", "polje");
		history.obrisiKolacice("www.youtube.com");
		history.obrisiStranicu("www.wikipedia.com");
		history.obrisiSveKolaciceZaSadnjihSatVremena(16, 30);
		
		System.out.println();
		history.pogledajIstoriju();
		
		history.obrisiKolacice();
		System.out.println();
		history.pogledajIstoriju();
		
		history.obrisiIstoriju();
		System.out.println();
		history.pogledajIstoriju();

	}

}
