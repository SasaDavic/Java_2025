package p25_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Sastojak koja ima:
naziv
cenu
gettere i settere
konstruktore
metodu za stampanje koja stampa  podatke u formatu:
naziv - cena.din
	
Kreirati klasu Pasta koja ima:
niz sastojaka
metodu za dodavanje sastojka
defaultni konstruktor
metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
metodu za stampu koja stampa podatke u formatu:
Pasta je sa sastojcima:
naziv - cena.din
naziv - cena.din
naziv - cena.din
Cena paste je cena.din

U glavnom programu kreirati objekte i testirati funkcionalnosti 

(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

	 */
		
		Sastojak s1 = new Sastojak("Spageti", 70);
		Sastojak s2 = new Sastojak("Paradajz", 50);
		Sastojak s3 = new Sastojak("Sampinjoni", 40);
		Sastojak s4 = new Sastojak("Parmezan", 120);
		Sastojak s5 = new Sastojak("Sunka", 80);
		Sastojak s6 = new Sastojak("Origano", 5);
		
		Pasta p = new Pasta();
		p.dodajSastojak(s1);
		p.dodajSastojak(s2);
		p.dodajSastojak(s3);
		p.dodajSastojak(s4);
		p.dodajSastojak(s5);
		p.dodajSastojak(s6);
		p.stampaj();
		
		p.brisiSastojak("Sampinjoni");
		p.stampaj();
		

	}

}
