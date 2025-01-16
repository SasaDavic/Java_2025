package d02_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		/*
Napisati program koji ima informacije koje ucitava informacije sa tastature:
Ime 
Prezime
godinu rodjenja
I stampa informaicije u formatu:
[ime] [prezime] - [startost] god

Primer izvrsenja: 
Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se 
informacije
Milan Jovanovic - 26 god

		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite ime: ");
		String ime = s.next();
		System.out.println("Unesite prezime: ");
		String prezime = s.next();
		System.out.println("Unesite godinu rodjenja: ");
		int godRodjenja = s.nextInt();
		int starost = 2025 - godRodjenja;
		
		System.out.println(ime + " " + prezime + " - " + starost + " god.");
		
	}

}
