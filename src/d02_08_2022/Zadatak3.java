package d02_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji cuva i stampa podatke jednog bug reporta. Bug je onaj koji ste radili na manuelnom delu
				“Aplikacija: Viber
				Opis problema: Ne uspevam sliku da pošaljem, izađe mi greška. Probao sam sliku koju imam u telefonu sačuvanu da pošaljem.
				Zadatak: Proveriti slučaj koji je korisnik prijavio (zamislite da slanje slike zaista ne radi) i sastavite bug report.”. 
				Bug report od informacija ima:
				ID (broj)
				Title
				Severity
				Priority
				Description
				Environment
				Steps to reproduce (jedna promenlijva)
				Expected result
				Actual result
				Imate slobodu da stampate podatke kako vam se najvise svidja.

		 */
		int id = 202;
		String title = "Neuspesno slanje slike u Viber aplikaciji.";
		String severity = "Medium";
		String priority = "High";
		String description = "Korisnik ne moze da posalje sliku iz galerije preko Viber aplikacije. "
				+ "Nakon pokusaja prikazuje se greska bez detalja";
		String environment = "\t• OS: Android 11 \n \t• Viber verzija: 19.2.0 \n \t• Uredjaj: Xiaomi Redmi Note 10";
		String str = "\t 1.Otvorite aplikaciju Viber \n \t 2.Otvorite bilo koji chat \n \t 3.Kliknite na ikonu za slanje slike \n \t "
				+ "4.Izaberite sliku iz galerije telefona \n \t 5.Pritisnite dugme za slanje";
		String er = "Izabrana slika treba da bude uspesno poslata u chat";
		String ar = "Pojavljuje se poruka greske \"Slanje nije uspelo\" i slika se ne salje";
		
		System.out.println("ID: " + id);
		System.out.println("Title:" + title);
		System.out.println("Severity: " + severity);
		System.out.println("Priority: " + priority);
		System.out.println("Description: " + description);
		System.out.println("Environment: \n" + environment);
		System.out.println("Steps to reproduce: \n" + str);
		System.out.println("Expected result: " + er);
		System.out.println("Actual result: " + ar);

	}

}
