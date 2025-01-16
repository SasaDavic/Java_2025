package p02_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji na ekranu stampa podatke u formatu:
			[IME I PREZIME]
			[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
			[EMAIL]

		 */

		String fullName = "Sasa Davic";
		String phoneNumber = "+381-65-896-852",
				homeAddress = "Nikole Pasica 34",
				city = "Nis";
		String email = "s@gmail.com";
		
		System.out.println(fullName);
		System.out.println(phoneNumber + ", " + homeAddress +
				", " + city);
		System.out.println(email);
	}

}
