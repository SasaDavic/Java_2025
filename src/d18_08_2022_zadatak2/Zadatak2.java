package d18_08_2022_zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
2.Kreirati klasu FacebookPost koja ima:
Od atributa:
ime i prezime korisnika koji je objavio post
ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
tekst objave
broj lajkova
broj deljenja
  Od metoda:
like(), koja povecava broj lajkova za 1.
dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
share(), koja povecava broj deljenja za 1
print(), koja stampa objavu u formatu:
(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
(tekst objave)
Likes (broj lajkova) | Shares (broj deljenja)

U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


Primer stampanja:
Milan Jovanovic >>> Pera Peric
Ovo je tekst objave
Likes 3 | Shares 1

(dopuna 19.08)
Kreirati klasu FacebookPost koja ima:
Od atributa:
ime i prezime korisnika koji je objavio post
ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
tekst objave
broj lajkova
broj deljenja

Konstruktore:
difoltni konstuktor
konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
  
 Od metoda:  
like(), koja povecava broj lajkova za 1.
dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
share(), koja povecava broj deljenja za 1
print(), koja stampa objavu u formatu:
(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
(tekst objave)
Likes (broj lajkova) | Shares (broj deljenja)

U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


Primer stampanja:
Milan Jovanovic >>> Pera Peric
Ovo je tekst objave
Likes 3 | Shares 1



	 */
		
		FacebookPost k1 = new FacebookPost("Milan Golubovic", "Jovana Delic", "Gde su svi nestali? Dosta vremena je proslo...");
		for (int i = 0; i < 15; i++) {
			k1.like();
			k1.share();
		}
		k1.dislike();
		k1.print();
		
		FacebookPost k2 = new FacebookPost("Keky", "Lili", ":)");
		k2.like();
		k2.share();
		k2.dislike();
		k2.dislike();
		k2.print();
		
		

	}

}
