package p16_08_2022_zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Kreirati klasu Auto koja ima:
ime i prezime vozaca
marku automobila
broj vrata
potrosnju na 100km (npr: 10)
trenutnu brzinu kojom se auto krece
metodu za stampu koja stampa podatke u formatu:
[Vozac]
	[Marka] - [br vrata]-ro vrata
	Sa potrosnjom od [potrosnja] l na 100km
	[Trenutna brzina auta] km/h je trenutna brzina.
	Primer:
	Milan Jovanovic
	BMW - 5-ro vrata
	Sa potrosnjom od 10 l na 100km
	200 km/h je trenutna brzina

(Dopuna)
U okviru klase Auto, implementirati jos 2 metode:
metoda koja vraca informaciju da li je vozac prekoracio brzinu. 
Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true 
ili false ako je trenutna brzina veca od ogranicenja.
metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu 
prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje 
brzine
U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu 
informacija koje dobijete od njih.

(Dopuna 2)
Dopuniti klasu Auto tako da ima:
atribut godinu proizvodnje
atribut mesec do kad je registrovan auto (int)
atribut kubikaza auta (npr: 1600 - 5000)
metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, 
za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

(Dopuna 3)
Dopuniti klasu Auto tako da ima:
atribut broj registracije
da li je ukljucena klima u autu
metodu dodajGas, koja povecava trenutnu brzinu za 10.
metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

(Dopuna 4)
Dopuniti klasu Auto tako da ima:
atribut za maksimalnu brzinu na auto (npr: 240)
Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa 
               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

(Dopuna 5)
Dopuniti klasu Auto tako da ima:
kapacitet rezervoara
trenutnu kolicinu goriva u rezervoaru (u litrima)
metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva. Litar goriva je 170din. 
Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara, takodje ukoliko se unese kolicina koja prelazi kapacitet, 
tu kolicinu koja prelazi ne racunate u cenu.


	 */
		int mesecSada = 5;
		int ogranicenje = 60;
		
		Auto a1 = new Auto();
		a1.kapacitetRezervoara = 40;
		a1.trenutnoGorivaURezervoaru = 35;
		a1.brVrata = 5;
		a1.imeVlasnika = "Marko Nikolic";
		a1.marka = "BMW";
		a1.potrosnjaNa100Km = 8;
		a1.trenutnBrzina = 120;
		a1.godProizvodnje = 1945;
		a1.kubikaza = 3000;
		a1.mesecIstekaRegistracije = 10;
		a1.brRegistracije = "NI987-25";
		a1.klimaOn = true;
		a1.maxBrzina = 240;
		a1.stampaj();
		
		if (a1.kazna(ogranicenje) != 0) {
			System.out.println("Vozac " + a1.imeVlasnika + 
					" je prekoracio dozvoljenu brzinu, treba da plati kaznu " + a1.kazna(ogranicenje));
		}
		if (a1.vaziRegistracija(mesecSada) == false) {
			System.out.println("Vozilu je istekla registracija!!! Cena nove registracije je " + a1.cenaRegistracije());
		}
		a1.stampajTablu();
		a1.koci();
		a1.stampajTablu();
		a1.natoci(3);
		System.out.println();
		
		Auto a2 = new Auto();
		a2.kapacitetRezervoara = 25;
		a2.trenutnoGorivaURezervoaru = 22;
		a2.brVrata = 3;
		a2.imeVlasnika = "Ivana Jovic";
		a2.marka = "Yugo";
		a2.potrosnjaNa100Km = 11;
		a2.trenutnBrzina = 50;
		a2.kubikaza = 1800;
		a2.godProizvodnje = 1980;
		a2.mesecIstekaRegistracije = 4;
		a2.brRegistracije = "BG789-21";
		a2.klimaOn = false;
		a2.maxBrzina = 120;
		a2.stampaj();
		
		if (a2.kazna(ogranicenje) != 0) {
			System.out.println("Vozac " + a2.imeVlasnika + 
					" je prekoracio dozvoljenu brzinu, treba da plati kaznu " + a2.kazna(ogranicenje));
		}
		if (a2.vaziRegistracija(mesecSada) == false) {
			System.out.println("Vozilu je istekla registracija!!! Cena nove registracije je " + a2.cenaRegistracije());
		}
		a2.stampajTablu();
		a2.dodajGas();
		a2.dodajGas();
		a2.stampajTablu();
		a2.natoci(5);
		
		
		
	}

}
