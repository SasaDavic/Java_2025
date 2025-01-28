package d25_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Napisati klasu Student koja ima
broj indeksa
ime i prezime
tip studija (osnovne, master, doktorske)
niz ispita
konstuktore koje mislite da ce vam trebati
gettere i settere za indeks, ime i prezime, tip studija
getter za niz predmeta
metodu dodaj ispit u niz ispita
metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
metodu stampaj koja stampa u formatu:
(broj indeksa) - (ime i prezime) - (tip studija)
Predmeti:
(naziv predmeta) - (profesor) - (ocena)
(naziv predmeta) - (profesor) - (ocena)
(naziv predmeta) - (profesor) - (ocena)
Prosecna ocena: (prosecna ocena)


Napisati klasu Ispit koja ima
naziv predmeta
ocenu (u rasponu od 5 do 10)
Ime i prezime profesora koji predaje predmet
konstuktore koje mislite da ce vam trebati
gettere i settere za sve atribute
metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
metodu koja stampa ispit u formatu:
(naziv predmeta) - (profesor) - (ocena)


	 */
		
		Ispit matematika1 = new Ispit("Matematicka Analiza 1", 5, "Dragana Cvetkovic");
		Ispit matematika2 = new Ispit("Matematicka Analiza 2", 8, "Dragana Cvetkovic");
		Ispit matematika3 = new Ispit("Matematicka Analiza 3", 10, "Dragana Cvetkovic");
		Ispit matematika4 = new Ispit("Matematicka Analiza 4", 7, "Dragana Cvetkovic");
		Ispit kompleksna1 = new Ispit("Kompleksna Analiza 1", 8, "Dijana Milosevic");
		Ispit kompleksna2 = new Ispit("Kompleksna Analiza 2", 5, "Dijana Milosevic");
		Ispit geometrija = new Ispit("Geometrija", 10, "Milan Zlatanovic");
		Ispit ageometrija = new Ispit("Analiticka Geometrija", 9, "Milan Zlatanovic");
		Ispit funkcionalna = new Ispit("Funkcionalna Analiza", 5, "Milica Zlatkovic");
		
		Student student = new Student(1234, "Miodrag Peric", "Master");
		student.dodajIspit(matematika1);
		student.dodajIspit(matematika2);
		student.dodajIspit(matematika3);
		student.dodajIspit(matematika4);
		student.dodajIspit(kompleksna1);
		student.dodajIspit(kompleksna2);
		student.dodajIspit(geometrija);
		student.dodajIspit(ageometrija);
		student.dodajIspit(funkcionalna);
		student.print();
		
	}

}
