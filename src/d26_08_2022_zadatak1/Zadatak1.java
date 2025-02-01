package d26_08_2022_zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Osoba koja ima:
ime i prezime
jmbg
godinu rodjenja
default-ni konstuktor
konstuktor sa parametrima
gettere i settere 
metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)

Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
broj (broj koji igrac nosi)
poziciju koju igra (odbrambeni, napadac, … )
kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
default-ni konstuktor
konstuktor sa parametrima
gettere i settere za broj, kapiten i poziciju
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
godine iskustva
tip trenera (kondicioni, za igru, pomocni, personalni)
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
Podatke za igrace i trenere unosi korisnik sa tastature.

	 */
	//	Igrac i1 = new Igrac("Mile Peric", "741258963", 2005, 15, "odbrambeni", true);
	//	Igrac i2 = new Igrac("Milos Peric", "741258982", 2006, 23, "napadac", false);
		
	//	Trener t1 = new Trener("Dusan Nikolic", "851258963", 1982, 30, "kondicioni");
	//	Trener t2 = new Trener("Milan Nikolic", "231258963", 1995, 15, "pomocni");
	//	Trener t3 = new Trener("Dragan Stevic", "745658963", 2000, 5, "personalni");
		
	//	i1.stampaj();
	//	i2.stampaj();
	//	t1.stampaj();
	//	t2.stampaj();
	//	t3.stampaj();
		
		
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Koliko igraca zelite da upisete? ");
		int x = s.nextInt();
		
		for (int i = 0; i < x; i++) {
			s.nextLine();
			System.out.println("Ime igraca: ");
			String ime = s.nextLine();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godina rodjenja: ");
			int god = s.nextInt();
			System.out.println("Broj dresa: ");
			int broj = s.nextInt();
			System.out.println("Pozicija: ");
			String poz = s.next();
			System.out.println("Da li je igrac kapiten?: ");
			boolean kap = s.nextBoolean();
			
			Igrac igrac = new Igrac(ime, jmbg, god, broj, poz, kap);
			igraci.add(igrac);
		}
		
		System.out.println("Koliko trenera zelite da upisete? ");
		int y = s.nextInt();
		
		for (int i = 0; i < y; i++) {
			s.nextLine();							//nextLine() konzumira ceo red, uključujući znak za novi red. 
													//Pa ovim pokupimo sve sto je ostalo
			System.out.println("Ime trenera: ");
			String ime = s.nextLine();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godina rodjenja: ");
			int god = s.nextInt();
			System.out.println("Godine iskustva: ");
			int godIsk = s.nextInt();
			System.out.println("Tip trenera: ");
			String tip = s.next();
			
			Trener trener = new Trener(ime, jmbg, god, godIsk, tip);
			treneri.add(trener);
		}
		
		System.out.println("Igraci: ");
		for (int i = 0; i < igraci.size(); i++) {
			System.out.print(i + 1 + ". ");
			igraci.get(i).stampaj();
		}
		
		System.out.println("Treneri: ");
		for (int i = 0; i < treneri.size(); i++) {
			System.out.print(i + 1 + ". ");
			treneri.get(i).stampaj();
		}
		
		
		
		
	}

}
