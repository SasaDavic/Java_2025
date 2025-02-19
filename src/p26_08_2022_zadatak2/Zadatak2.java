package p26_08_2022_zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
	Napraviti klasu PlatnaKartica koja ima
  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
  atribut broj kartice  primer: 4012-1239-1221-3381
  atribut godina - godina do kada vazi kartica
  atribut mesec-  mesec do kada vazi kartica
  konstruktor sa parametrima
  gettere za sve atribute, bez settera
   metodu dodajSredstva koja povecava sumu za unetu vrednost
  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
  metodu koja stampa podatke o kartici u formatu:
	  4012-1239-1221-3381, 11/2019, $212

	  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
 ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
getter i setter za ovlasceno lice
konstruktor sa parametrima
  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
  implementira metodu koja stampa podatke o kartici u formatu:
	  Visa Card: 4012-1239-1221-3381, 11/2019, $212

	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
  konstruktor sa parametrima
  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
  metoda naplatiOdrzavanje, koja sa racuna skida $2.
  implementira metodu koja stampa podatke o kartici u formatu:
	  Master Card: 12/2019, 4012-1239-1221-3381, $232
	  u main funkciji, napraviti visa i master kartice i testirati funkcije

	 */
		
		MasterKartica m1 = new MasterKartica(1000, "4012-1239-1221-3381", 2026, 11);
		MasterKartica m2 = new MasterKartica(10000, "7896-9654-1236-7412", 2030, 1);
		
		VisaKartica v1 = new VisaKartica(500, "7896-7412-8952-9632", 2026, 5, "Milan Mitic");
		VisaKartica v2 = new VisaKartica(1500, "7896-7412-8523-6589", 2025, 8, "Jelena Jonic");
		
		m1.dodajSredstva(1000);
		m1.naplatiOdrzavanje();
		m2.izvrsiTransakciju(5000);
		m1.stampaj();
		m2.stampaj();
		
		v1.dodajSredstva(500);
		v2.izvrsiTransakciju(100);
		v1.stampaj();
		v2.stampaj();
		
		
		

	}

}
