package d06_09_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
Kreirati abstraktnu klasu Ambalaza koja ima:
barkod (primer: 328232-2823)
naziv artikla
neto tezinu
bruto tezinu
konstuktore (default-ni i sa parametrima)
gettere i settere
metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
abstraktnu metodu koja vraca cenu artikla
abstraktnu metodu stampaj

Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
atribut koji kaze da li se moze reciklirati
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu tako da ispunjava uslova:
ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
ako nije u cenu ulazi samo osnovna cena
metoda stampaj stampa sve podatke iz klase tetrapak.

Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
kaucija za flasu
atribut koji kaze da li se za flasu placa kaucija
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu
ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
ako se ne placa, (osnovna cena) * 1.2
metoda stampaj stampa sve podatke iz klase staklena flasa.

Kreirati klasu SuperKartica koja ima:
broj kartice
ime i prezime vlasnika
popust (200, 500, � )
konstuktore (default-ni i sa parametrima)
gettere i settere 
metodu stampaj koja stampa karticu u formatu:
(broj kartice), (ime i prezime)

Kreirati klasu Korpa koja ima:
niz ambalaza
metodu dodaj ambalazu
metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati 
sve metode i ispisati ukupnu cenu sa popustom.

		 */
		Tetrapak tetrapak1 = new Tetrapak("123456789", "Sok od jagode", 1000, 1050, true, 250);
		tetrapak1.stampaj();
		Tetrapak tetrapak2 = new Tetrapak("123456791", "Sok od maline", 1000, 1050, false, 250);
		tetrapak2.stampaj();
		System.out.println();
		StaklenaAmbalaza staklo1 = new StaklenaAmbalaza("741258963", "Belo vino", 700, 750, 100, true, 500);
		staklo1.stampaj();
		StaklenaAmbalaza staklo2 = new StaklenaAmbalaza("741258985", "Crno vino", 700, 750, 100, false, 500);
		staklo2.stampaj();
		System.out.println();
		SuperKartica kartica = new SuperKartica("1001", "Jovana Jelic", 10);
		kartica.stampajKarticu();
		
		Korpa korpa = new Korpa();
		korpa.dodajAmbalazu(tetrapak1);
		korpa.dodajAmbalazu(tetrapak2);
		korpa.dodajAmbalazu(staklo1);
		korpa.dodajAmbalazu(staklo2);
		
		System.out.println("Ukupno: " + korpa.ukupnaCenaKorpe(kartica));
		
		try {
		    korpa.dodajAmbalazu(new Tetrapak("123456789", "Sok od jagoda", -1050, 1200, true, 250));
		} catch (IllegalArgumentException e) {
		    System.out.println("Gre�ka prilikom dodavanja ambala�e: " + e.getMessage());
		}
	}

}
