package p19_08_2022_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Za klasu Tacka, koja ima privatne atribute:
x - x koordinata
y - y koordinata
Javne metode:
metodu stampaj
imamo difoltni konstruktor
imamo konstuktor koji prima obe koordinate za kreiranje objekta
geter za x
geter za y
seter za x
seter za y

U glavnom programu kreirati dva objekta:
Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

	 */
		
		Tacka a1 = new Tacka();
		a1.setxKoordinata(15);
		a1.setyKoordinata(20);
		a1.stampaj();
		
		Tacka a2 = new Tacka(-5, 6);
		a2.stampaj();
		
		
		
		
		

	}

}
