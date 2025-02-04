package p05_09_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati apstraktnu klasu Student koja ima:
ime i prezime studenta
broj indeksa
godinu studija
gettere, settere i konstruktore
apstraktnu metodu koja vraca cenu skolarine.
apstraktnu metodu koja vraca da li je student na buzetu ili ne.
metodu koja stampa podatke u formatu:
ime i prezime, broj indeksa, godina studija
Finansiranje: budzet/samofinansirajuci
Cena skolarine: cena

	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
koja za cenu skolarine vraca 90000
za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija

Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
koja za cenu skolarine vraca 100000
za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
	U glavnoj klasi kreirati studente i testirati funkciolanosti
	 */
		
		StudentOsnovnih studentO1 = new StudentOsnovnih("Milan Mitic", 1100, 2);
		StudentOsnovnih studentO2 = new StudentOsnovnih("Jovan Mitic", 1101, 5);
		
		StudentMaster studentM1 = new StudentMaster("Milena Matic", 1052, 1);
		StudentMaster studentM2 = new StudentMaster("Petar Matic", 1078, 2);
		
		studentO1.stampaj();
		System.out.println("----------------------------");
		studentO2.stampaj();
		System.out.println("----------------------------");
		studentM1.stampaj();
		System.out.println("----------------------------");
		studentM2.stampaj();

	}

}
