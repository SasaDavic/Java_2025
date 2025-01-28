package p25_08_2022_zadatak4;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Kreirati klasu InstagramUser koja ima:
username
Ime i prezime
email
Sve sto vam dalje zatreba dopunite klasu.

Kreiarti klasu InstagramTag koja ima:
x koordinatu na slici
y koordinatu na slici
usera koji je tagovan

Kreirati klasu InstagramImage koja ima:
niz tagova
dimenziju slike
putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
metodu dodajTag

Kreirati klasu InstagramPost koja ima
niz slika
Opis koji moze da se postavi za post
metodu dodajSliku

	 */
		
		InstagramUser user1 = new InstagramUser("Mile", "Milan Nikolic", "milan@gmail.com");
		InstagramUser user2 = new InstagramUser("Nina", "NinaStankovic", "nina@gmail.com");
		InstagramUser user3 = new InstagramUser("Djole", "Djordje Tadic", "djole@gmail.com");
		
		InstagramTag tag1 = new InstagramTag(2, 2, user1);
		InstagramTag tag2 = new InstagramTag(2, 3, user2);
		InstagramTag tag3 = new InstagramTag(2, 4, user3);
		
		InstagramImage image = new InstagramImage("1000x800", "www/instagram.com/01236");
		InstagramImage image1 = new InstagramImage("1000x800", "www/instagram.com/01248");
		
		image.dodajTag(tag1);
		image1.dodajTag(tag2);
		image1.dodajTag(tag3);
		
		InstagramPost post = new InstagramPost("Nova godina");
		post.dodajSliku(image);
		post.dodajSliku(image1);

	}

}
