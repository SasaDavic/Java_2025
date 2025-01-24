package p23_08_2022_zadatak3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Sastojak koja ima:
naziv sastojka
cenu 
gettere i settere 
konstuktore


--U glavnom programu kreirati 3 sastojka.
 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. 
 Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

	 */
		Scanner s = new Scanner(System.in);
		ArrayList<Sastojak> nizSastojaka = new ArrayList<Sastojak>();
		System.out.println("Koliko sastojka zelite da unesete: ");
		int x = s.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Unesite naziv sastojka: ");
			String ime = s.next();
			System.out.println("Cena: ");
			double cena = s.nextDouble();
			Sastojak a = new Sastojak(ime, cena);
			
			nizSastojaka.add(a);
		}
		for (int i = 0; i < nizSastojaka.size(); i++) {
			nizSastojaka.get(i).stampaj();
			}

	}

}
