package p25_08_2022_zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Kreirati klasu Reakcija koja ima 
tip reakcije (smajli, like, srce)
ime i prezime korisnika koji je reagovao 
gettere, settere i konstruktore

Kreirati klasu FacebookPost koja ima:
ime i prezime korisnika koji je stavio oglas
tekst objave
niz reakcija
metodu reaguj, koja dodaje reakciju u niz
(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
Primer: Milan - lajkuje
	 Nemanja - lajkuje
	 Milan - daje srce
Post ima lajk od Nemanje i srce od Milana.
privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)

brojReakcija(“smajli) => 3
brojReakcija(“srce”) => 2
brojReakcija(“like”) => 1
brojReakcija(“cry”) => 0

metodu stampaj koja stampa podatke u formatu:
ime i prezime
tekst objave
Smajli 10 | Like 15 | Srce 2

	 */
		
		
		FacebookPost post = new FacebookPost("Miki", "Zdravo svima");
		Reakcija r1 = new Reakcija("smajli", "Luna");
		Reakcija r2 = new Reakcija("smajli", "Mima");
		Reakcija r3 = new Reakcija("like", "Miki");
		Reakcija r4 = new Reakcija("like", "Marko");
		Reakcija r5 = new Reakcija("srce", "Nidza");
		Reakcija r6 = new Reakcija("srce", "Luna");
		post.reaguj(r1);
		post.reaguj(r2);
		post.reaguj(r3);
		post.reaguj(r4);
		post.reaguj(r5);
		post.reaguj(r6);
		post.stampaj();
		

	}

}
