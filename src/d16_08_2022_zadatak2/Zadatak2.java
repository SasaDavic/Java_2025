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


(DOPUNA 18.08.)Kreirati klasu SmartAirConditioning koja ima:
atribut za marku klime (npr: Samsung, Galanz, Gree, …)
atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
atribut za izabranu temperaturu (minimum je 16, maksimum 35)
atribut za mod (hladi/greje)
metodu za stampu - stampa u formatu 
marka - mod - termperatura

metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)

metodu koja racuna koliko klima novca potrosi za mesec dana
Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
Metoda vraca ukupnu cenu za taj mesec

U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.


	 */
		int spoljnaTemperatura = 30;
		
		SmartAirConditioning s1 = new SmartAirConditioning();
		s1.marka = "Midea";
		s1.mod = "hladi";
		s1.temperatura = 17;
		s1.potrosnjaEEHladi = 1;
		s1.potrosnjaEEGreje = 2;
		
		s1.stampaj();
		if (s1.jeNapoljuToplije(spoljnaTemperatura) == true) {
			System.out.println("Napolju je toplije nego unutra!");
		} else {
			System.out.println("Unutra je toplije!");
		}
		s1.stamajPotrosnju();
		System.out.println();
		
		SmartAirConditioning s2 = new SmartAirConditioning();
		s2.marka = "Samsung";
		s2.mod = "greje";
		s2.temperatura = 35;
		s2.potrosnjaEEHladi = 1;
		s2.potrosnjaEEGreje = 2;
		
		s2.stampaj();
		if (s2.jeNapoljuToplije(spoljnaTemperatura) == true) {
			System.out.println("Napolju je toplije nego unutra!");
		} else {
			System.out.println("Unutra je toplije!");
		}
		s2.stamajPotrosnju();

	}

}
