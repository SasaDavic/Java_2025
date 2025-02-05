package p05_09_2022_zadatak5;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
Npr: Ice point vanila sa dodacima: plazma, cokolada
Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez

Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
 naziv dodatka
 cenu dodatka
 konstruktore, gettere i settere koji su vam potrebni
 metodu stampaj koja stampa u formatu:
(dodatak)  (cena)

Kreirati abstraktnu klasu Proizvod koja ima:
 niz dodataka
 metodu ubaciDodatak koja dodaje dodatak u niz
 metodu koja vraca cenu svih dodataka koje ima proizvod
 abstraktnu metodu ukupnu racunaj cenu 
 abstraktnu metodu stampaj

Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
 tip sladoleda (vanila, cokolada)
 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
 override uje metodu koja ukupnu cenu racuna:
ako je mali ice point na cenu svih dodataka doda 100
ako je veliki ice point cenu svih dodataka doda 130
override uje metodu stampaj da stampa sve podatke
	
Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
 cena podloge
 override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
override uje metodu stampaj da stampa sve podatke
	
U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. 
Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

	 */

		IcePoint iceVanila = new IcePoint("Vanila", true);
		IcePoint iceCokolada = new IcePoint("Cokolada", false);
		IcePoint iceJagoda = new IcePoint("Jagoda", false);
		
		Pica stracatela = new Pica(500);
		Pica quatroS = new Pica(300);
		
		Dodatak jagoda = new Dodatak("Preliv jagoda", 50);
		Dodatak karamela = new Dodatak("Preliv karamela", 50);
		Dodatak cokolada = new Dodatak("Preliv cokolada", 50);
		Dodatak keks = new Dodatak("Plazma keks", 20);
		Dodatak lesnik = new Dodatak("Lesnik", 100);
		
		Dodatak sunka = new Dodatak("Sunka", 150);
		Dodatak kackavalj = new Dodatak("Kackavalj", 80);
		Dodatak parmezan = new Dodatak("Parmezan", 150);
		Dodatak pecurke = new Dodatak("Pecurke", 75);
		Dodatak pecenica = new Dodatak("Pecenica", 200);
		
		iceVanila.ubaciDodatak(jagoda);
		iceVanila.ubaciDodatak(cokolada);
		iceVanila.ubaciDodatak(keks);
		iceVanila.ubaciDodatak(lesnik);
		
		iceCokolada.ubaciDodatak(lesnik);
		iceCokolada.ubaciDodatak(karamela);
		
		iceJagoda.ubaciDodatak(keks);
		
		stracatela.ubaciDodatak(pecenica);
		stracatela.ubaciDodatak(sunka);
		stracatela.ubaciDodatak(pecurke);
		stracatela.ubaciDodatak(kackavalj);
		stracatela.ubaciDodatak(parmezan);
		stracatela.ubaciDodatak(parmezan);
		
		quatroS.ubaciDodatak(kackavalj);
		quatroS.ubaciDodatak(parmezan);
		
		ArrayList<Proizvod> proizvodi = new ArrayList<>();
		proizvodi.add(iceVanila);
		proizvodi.add(iceCokolada);
		proizvodi.add(iceJagoda);
		proizvodi.add(stracatela);
		proizvodi.add(quatroS);
		
		for (int i = 0; i < proizvodi.size(); i++) {
			System.out.println();
			proizvodi.get(i).stampaj();
		}
		
		
		
		
	}

}
