package d16_08_2022_zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Kreirati klasu SmartAirConditioning koja ima:
atribut za marku klime (npr: Samsung, Galanz, Gree, …)
atribut za izabranu temperaturu 
atribut za mod (hladi/greje) - string
metodu za stampu (proizvoljno)
metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
Metoda kao parametar prima temperaturu koja je napolju.

U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

	 */
		int spoljnaTemperatura = 30;
		
		SmartAirConditioning s1 = new SmartAirConditioning();
		s1.marka = "Midea";
		s1.mod = "hladi";
		s1.temperatura = 17;
		
		s1.stampaj();
		if (s1.jeNapoljuToplije(spoljnaTemperatura) == true) {
			System.out.println("Napolju je toplije nego unutra!");
		} else {
			System.out.println("Unutra je toplije!");
		}
		System.out.println();
		SmartAirConditioning s2 = new SmartAirConditioning();
		s2.marka = "Samsung";
		s2.mod = "greje";
		s2.temperatura = 35;
		
		s2.stampaj();
		if (s2.jeNapoljuToplije(spoljnaTemperatura) == true) {
			System.out.println("Napolju je toplije nego unutra!");
		} else {
			System.out.println("Unutra je toplije!");
		}

	}

}
