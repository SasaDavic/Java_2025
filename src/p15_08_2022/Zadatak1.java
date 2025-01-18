package p15_08_2022;

public class Zadatak1 {
	/*
	 * Napisati metodu koja stampa ime i prezime
	 * i u glavnom programu pozvati metodu na izvrsenje 5 puta.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			fullName();
		}


	}
	
	public static void fullName() {
		System.out.println("Sasa Davic");
	}

}
