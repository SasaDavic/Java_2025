package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		/*
Napisati metodu koja stampa podatke o korisniku u formatu:
JMBG: [jmbg]
Ime: [ime]
Prezime: [prezime]
God. rodjenja: [god]
Aktivan: [true/false]
Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		 */
		
		String jmbg = "741258963741";
		String ime = "Milan";
		String prezime = "Jovic";
		int godRodjenja = 2005;
		boolean aktivan = false;
		korisnikPodaci(jmbg, ime, prezime, godRodjenja, aktivan);

	}
	
	public static void korisnikPodaci(String jmbg, String ime, String prezime, int godRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godRodjenja);
		System.out.println("Aktivan: " + aktivan); 
	}

}
