package p16_08_2022_zadatak1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.

Primer izvrsenja:
Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
Primalac: Marko Markovic, 840-23932-334, stanje: 200
Unesite sumu za transakciju: 500
Stanje nakon stransakcije
Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
Primalac: Marko Markovic, 840-23932-334, stanje: 700

	 */
		Scanner s = new Scanner(System.in);
		
		Racun korisnik1 = new Racun();
		
		korisnik1.broj = "840-23932-323";
		korisnik1.vlasnik = "Milan Jovanovic";
		korisnik1.stanje = 1000;
		
		Racun korisnik2 = new Racun();
		
		korisnik2.broj = "840-23932-334";
		korisnik2.vlasnik = "Marko Markovic";
		korisnik2.stanje = 300;
		
		System.out.println("Racun " + korisnik1.broj);
		System.out.println("Vlasnik " + korisnik1.vlasnik);
		System.out.println("Stanje " + korisnik1.stanje);
		System.out.println();
		System.out.println("Racun " + korisnik2.broj);
		System.out.println("Vlasnik " + korisnik2.vlasnik);
		System.out.println("Stanje " + korisnik2.stanje);
		
		System.out.println("Unesite iznos za transakciju: ");
		int iznos = s.nextInt();
		
		korisnik1.stanje -= iznos;
		korisnik2.stanje += iznos;
		
		System.out.println("Racun " + korisnik1.broj);
		System.out.println("Vlasnik " + korisnik1.vlasnik);
		System.out.println("Stanje " + korisnik1.stanje);
		System.out.println();
		System.out.println("Racun " + korisnik2.broj);
		System.out.println("Vlasnik " + korisnik2.vlasnik);
		System.out.println("Stanje " + korisnik2.stanje);

	}
	
	

}
