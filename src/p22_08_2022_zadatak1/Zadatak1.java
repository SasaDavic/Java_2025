package p22_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Film koja ima:
naziv filma
iz koje godine je film 
reziser
konstruktore, gettere i settere koji su potrebni
metodu print koja stampa podatke u formatu
naziv filma, godina
Rezirao je: Ime prezime, starost.god


Kreirati klasu Reziser koja ima:
ime i prezime rezisera
starost
konstruktore, gettere i settere koji su potrebni
metodu print koja stampa podatke u formatu
ime prezime, starost.god

U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda


	 */
		
		Reziser r1 = new Reziser("Frank Darabont", 66);
		Film f1 = new Film("The Shawshank Redemption", 1994, r1);
		Film f2 = new Film("The Mist", 2007, r1);
		
		f1.print();
		f2.print();
		
		
	}

}
