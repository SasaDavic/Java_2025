package p05_09_2022_zadatak3;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Kreirati abstraktnu klasu Figura koja ima
abstraktnu metodu povrsina
abstraktnu metodu obim
metodu koja stampa podatke u formatu:
Povrsina je (povrsina)
Obim je (obim)

Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
stranicu a
gettere/settere/konstruktore
implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
implementira metodu obim

Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
stranice a i b
gettere/settere/konstruktore
implementira metodu povrsina
implementira metodu obim

U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime i 
za svaku figuru ispisati ponaosob


	 */
		Figura figura1 = new JednakostranicniTrougao(2);
		Figura figura2 = new JednakostranicniTrougao(3);
		Figura figura3 = new Pravougaonik(2, 3);
		Figura figura4 = new Pravougaonik(3, 4);
		Figura figura5 = new Pravougaonik(4, 5);
		
		//zbir svih povrsina
		double sumaP = 0;
		//zbir svih obima
		double sumaO = 0;
		
		ArrayList<Figura> figure = new ArrayList<>();
		figure.add(figura1);
		figure.add(figura2);
		figure.add(figura3);
		figure.add(figura4);
		figure.add(figura5);
		
		for (int i = 0; i < figure.size(); i++) {
			sumaP += figure.get(i).povrsina();
			sumaO += figure.get(i).obim();
		}
		System.out.println("Zbir svih povrsina je: " + sumaP);
		System.out.println("Zbir svih obima je: " + sumaO);
		
		for (int i = 0; i < figure.size(); i++) {
			System.out.print(i + 1);
			figure.get(i).stampaj();
		}
		
		
	}

}
