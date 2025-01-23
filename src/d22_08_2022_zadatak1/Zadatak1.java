package d22_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora)

Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora) 

	U glavnom programu napraviti vise autora sa vise knjiga.

		 */
		
		Autor autor1 = new Autor("Stanislav", "Lem");
		Knjiga knjiga1 = new Knjiga("9788660340896", "GLAS GOSPODARA", 2024);
		Knjiga knjiga2 = new Knjiga("9788660340841", "EDEN", 2024);
		knjiga1.setAutor(autor1);
		knjiga2.setAutor(autor1);
		knjiga1.print();
		knjiga2.print();
		
		
		
		
	}

}
