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

	 */
		
		FacebookPost k1 = new FacebookPost();
		k1.imeKorisnika = "Milan Golubovic";
		k1.imeKorisnikaGdeJePost = "Jovana Delic";
		k1.textPosta = "Gde su svi nestali? Dosta vremena je proslo...";
		k1.brLike = 15;
		k1.brShare = 5;
		k1.like();
		k1.dislike();
		k1.dislike();
		k1.share();
		k1.print();
		System.out.println();
		FacebookPost k2 = new FacebookPost();
		k2.imeKorisnika = "Keky";
		k2.imeKorisnikaGdeJePost = "Lili";
		k2.textPosta = ":)";
		k2.brLike = 0;
		k2.brShare = 0;
		k2.like();
		k2.dislike();
		k2.dislike();
		k2.share();
		k2.print();

	}

}
