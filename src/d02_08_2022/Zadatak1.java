package d02_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji stampa podatke o kreditnoj kartici u 
		 * formatu kao na slici. Od informacija se pamti broj kartice 
		 * (16 cifara sa razmacima), mesec i godina do kada vazi kartica, 
		 * kao i ime i prezime vlasnika kartice. Kartica se stampa sa 
		 * zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u 
		 * liniji to ce zavisiti od duzine imena.
		 */
		
		String brKartice = "1234 1232 4321 1212";
		int mesec = 10;
		int godina = 25;
		String ime = "Sasa Zivkovic";
		System.out.println("***********************************");
		System.out.println("*  Credit Card                    *");
		System.out.println("*    ****                         *");
		System.out.println("*    ****                         *");
		System.out.println("*       " + brKartice + "       *");
		System.out.println("*                  valid > " + mesec + "/" + godina + "  *");
		System.out.println("*                                 *");
		System.out.println("*    " + ime + "                *");
		System.out.println("***********************************");
	}

}
