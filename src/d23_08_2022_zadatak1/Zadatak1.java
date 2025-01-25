package d23_08_2022_zadatak1;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	 * Kreirati klasu ZeleniKarton koja ima:
ime i prezime studenta 
broj indeksa 
naziv predmeta
ime i prezime profesora
ocenu - od 5 do 10
gettere i settere
konstruktore
metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
metodu stampaj koja stampa podatke u formatu:
		(naziv predmeta) - (ocena)
		Student: ime i prezime, broj indeksa
		Profesor: ime i prezime

	U glavnoj klasi:
kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

	 */
		ArrayList<ZeleniKarton> index = new ArrayList<ZeleniKarton>();
		ZeleniKarton z1 = new ZeleniKarton("Ana Nikolic", 1234, "Matematicka Analiza", "Danijela Jovic", 5);
		ZeleniKarton z2 = new ZeleniKarton("Ana Nikolic", 1234, "Matematicka Statistika", "Biljana Delic", 8);
		ZeleniKarton z3 = new ZeleniKarton("Milica Cenic", 8534, "Matematicka Analiza", "Danijela Jovic", 10);
		ZeleniKarton z4 = new ZeleniKarton("Milica Cenic", 8534, "Matematicka Statistika", "Biljana Delic", 5);
		ZeleniKarton z5 = new ZeleniKarton("Dusan Peric", 1895, "Matematicka Analiza", "Danijela Jovic", 9);
		ZeleniKarton z6 = new ZeleniKarton("Milos Nikolic", 1984, "Matematicka Analiza", "Danijela Jovic", 9);
		ZeleniKarton z7 = new ZeleniKarton("Dusan Peric", 1895, "Geometrija", "Miroslav Jovic", 8);
		ZeleniKarton z8 = new ZeleniKarton("Milos Nikolic", 1984, "Geometrija", "Miroslav Jovic", 8);
		ZeleniKarton z9 = new ZeleniKarton("Ana Nikolic", 1234, "Geometrija", "Miroslav Jovic", 5);
		ZeleniKarton z10 = new ZeleniKarton("Milica Cenic", 8534, "Geometrija", "Miroslav Jovic", 10);
		index.add(z1);
		index.add(z2);
		index.add(z3);
		index.add(z4);
		index.add(z5);
		index.add(z6);
		index.add(z7);
		index.add(z8);
		index.add(z9);
		index.add(z10);
		int suma = 0;
		int sumaPolozenih = 0;
		int brojacPolozenih = 0;
		
		for (int i = 0; i < index.size(); i++) {
			suma += index.get(i).getOcena();
			if (index.get(i).polozen() == true) {
				sumaPolozenih += index.get(i).getOcena();
				brojacPolozenih++;
			}
			System.out.print(i + 1 + ". ");
			index.get(i).stampaj();
			System.out.println();
		}
		System.out.println("Prosek: " + suma * 1.00 / index.size());
		System.out.println("Prosek polozenih: " + sumaPolozenih * 1.00 / brojacPolozenih);
		

	}

}
