package d25_08_2022_zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. 
Znaci nije vam potrebna provera za opseg brojeva.

Za potrebe Lotto igre na srecu potrebno je 
Kreirati klasu Kombinacija koja ima:
id kombinacije (String)
niz brojeva - niz je od 7 broja (ArrayList<Integer>)
konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
gettere za atribute Kombinacija(String id, int jedan, int dva, …)
metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
Zaglavlje metode je:
public boolean daLiJeIstaKombinacija( Kombinacija k)
metoda vraca true ako su svi elementi na istim pozicija isti
npr: this [0] == k [0], this [1] == k [1] …. 
metodu za stampu koja stampa podatke u formatu
ID: id kombinacije
brojevi: 1, 3, 5, 14, 15, 21, 23


Kreirati klasu Listic koja ima: 
niz kombinacija - maksimalno 7 kombinacija
metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. 
Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. 
Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
Zaglavlje metode 
public boolean dobitna(Kombinacija dobitnaKombinacija)
metodu koja stampa listic u formatu
ID: id kombinacije
brojevi: 1, 3, 5, 14, 15, 21, 23

ID: id kombinacije
brojevi: 1, 3, 5, 14, 15, 21, 23

…… i tako za sve kombinacije

	 */
		Kombinacija dobitna = new Kombinacija("a010", 7, 14, 18, 24, 29, 32, 36);
		
		Kombinacija k1 = new Kombinacija("a001", 1, 4, 9, 15, 21, 26, 38);
		Kombinacija k2 = new Kombinacija("a002", 3, 11, 15, 17, 26, 27, 36);
		Kombinacija k3 = new Kombinacija("a003", 7, 17, 27, 31, 33, 37, 39);
		Kombinacija k4 = new Kombinacija("a004", 4, 14, 16, 18, 26, 37, 38);
		Kombinacija k5 = new Kombinacija("a005", 9, 13, 15, 17, 25, 28, 34);
		Kombinacija k6 = new Kombinacija("a006", 6, 18, 23, 27, 34, 37, 38);
		Kombinacija k7 = new Kombinacija("a007", 7, 14, 18, 24, 29, 32, 36);
		
		Listic loto = new Listic();
		
		loto.dodajKombinaciju(k1);
		loto.dodajKombinaciju(k2);
		loto.dodajKombinaciju(k3);
		loto.dodajKombinaciju(k4);
		loto.dodajKombinaciju(k5);
		loto.dodajKombinaciju(k6);
		loto.dodajKombinaciju(k7);
		
		loto.printListic(dobitna);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
