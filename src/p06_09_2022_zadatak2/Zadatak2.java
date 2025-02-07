package p06_09_2022_zadatak2;

import java.util.ArrayList;

public class Zadatak2 {

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
	
U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

(DOPUNA ZA VEZBANJE)
Dopuna na 2.zad
Kreirati klasu Kasa koja ima:
niz svih dostupnih dodataka sa cenama.
niz proizvoda
metodu dodaj proizvod
Difoltni konstuktor u kom se u niz dodaju 10 razlicitih sastojaka u niz
Npr: luk, piletina, junetina, prsuta, jaja, cokolada, …
metodu koja trazi dodatak iz niza prema prosledjenom nazivu sastojka. Metoda vraca dodatak (objekat tipa Dodatak)
metodu sracunajCenuPorudzbine, koja racuna i vraca sumu svih proizvoda
metodu setampajRacun, metoda stampa sve proizvode i ukupan racun
U mainu kreirati jednu kasu i u nju dodajte 3-4 proizvoda sa nekoliko dodatak i stampajte racun.
U mainu ne kreirate dodatke!!!! Koristite samo one koje vec ima kasa.

	 */
		
	/*	Dodatak d1 = new Dodatak("piletina", 150);
		Dodatak d2 = new Dodatak("junetina", 200);
		Dodatak d3 = new Dodatak("prsuta", 120);
		Dodatak d4 = new Dodatak("sunka", 100);
		Dodatak d5 = new Dodatak("jaje", 10);
		Dodatak d6 = new Dodatak("luk", 10);
		Dodatak d7 = new Dodatak("kackavalj", 70);
		Dodatak d8 = new Dodatak("pecurke", 50);
		Dodatak d9 = new Dodatak("cokolada", 80);
		Dodatak d10 = new Dodatak("jagoda", 150);
		Dodatak d11 = new Dodatak("karamela", 75);
		Dodatak d12 = new Dodatak("keks", 30);
		Dodatak d13 = new Dodatak("lesnik", 110);
		Dodatak d14 = new Dodatak("slag", 20);
		Dodatak d15 = new Dodatak("kikiriki", 70);
		
		IcePoint ice1 = new IcePoint("vanila", true);
		IcePoint ice2 = new IcePoint("cokolada", false);
		IcePoint ice3 = new IcePoint("stracatela", true);
		
		Pica quatroS = new Pica(150);
		Pica mocarela = new Pica(300);
		
		ice1.ubaciDodatak(d11);
		ice1.ubaciDodatak(d12);
		ice1.ubaciDodatak(d13);
		ice2.ubaciDodatak(d10);
		ice2.ubaciDodatak(d15);
		ice3.ubaciDodatak(d14);
		quatroS.ubaciDodatak(d7);
		quatroS.ubaciDodatak(d4);
		quatroS.ubaciDodatak(d1);
		mocarela.ubaciDodatak(d7);
		
		ArrayList<Proizvod> proizvodi = new ArrayList<>();
		proizvodi.add(ice1);
		proizvodi.add(ice2);
		proizvodi.add(ice3);
		proizvodi.add(mocarela);
		proizvodi.add(quatroS);
		
		for (int i = 0; i < proizvodi.size(); i++) {
			proizvodi.get(i).stampaj();
		}
		*/
		
		
		//main za dopunu - preko kase
		
		IcePoint ice1 = new IcePoint("vanila", true);
		IcePoint ice2 = new IcePoint("cokolada", false);
		IcePoint ice3 = new IcePoint("stracatela", true);
		
		Pica quatroS = new Pica(150);
		Pica mocarela = new Pica(300);
		
		Kasa kasa = new Kasa();
		
		ice1.ubaciDodatak(kasa.traziDodatak("jagoda"));
		ice1.ubaciDodatak(kasa.traziDodatak("keks"));
	    ice1.ubaciDodatak(kasa.traziDodatak("lesnik"));
		
	    ice2.ubaciDodatak(kasa.traziDodatak("jagoda"));
        ice2.ubaciDodatak(kasa.traziDodatak("kikiriki"));
        
        ice3.ubaciDodatak(kasa.traziDodatak("slag"));
        
        quatroS.ubaciDodatak(kasa.traziDodatak("kackavalj"));
        quatroS.ubaciDodatak(kasa.traziDodatak("sunka"));
        quatroS.ubaciDodatak(kasa.traziDodatak("piletina"));
        
        mocarela.ubaciDodatak(kasa.traziDodatak("kackavalj"));
	    
	    
		kasa.dodajProizvod(ice1);
		kasa.dodajProizvod(ice2);
		kasa.dodajProizvod(ice3);
		kasa.dodajProizvod(quatroS);
		kasa.dodajProizvod(mocarela);
		
		 // Ispisi račun
        kasa.setampajRacun();  // Ovaj metod stampa sve proizvode i ukupnu cenu
		
		
	}
	
	

}
