package d04_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. 
		 * Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

				T1 i T2 su pozicije login forme. M je pozicija na kojoj je kliknuto
				
				Primer izvrsenja 1:
				Unesite x za T1: 10
				Unesite y za T1: 100
				Unesite x za T2: 100
				Unesite y za T2: 0
				Unestie x za M: 50
				Unesite y za M: 50
				Kliknuto je unutar forme
				
				Primer izvrsenja 2:
				Unesite x za T1: 10
				Unesite y za T1: 100
				Unesite x za T2: 100
				Unesite y za T2: 0
				Unestie x za M: 120
				Unesite y za M: 50
				Nije kliknuto je unutar forme
				
						 */
		
		System.out.println("A(x1, y1)");
		System.out.println(".______________________________________________________");
		System.out.println("|                                                      |");	
		System.out.println("|                                                      |");	
		System.out.println("|             .M(x,y)                                  |");	
		System.out.println("|                                                      |");	
		System.out.println("|______________________________________________________|.B(x2,y2)");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite x1: ");
		int x1 = s.nextInt();
		System.out.println("Unesite y1: ");
		int y1 = s.nextInt();
		System.out.println("Unesite x2: ");
		int x2 = s.nextInt();
		System.out.println("Unesite y2: ");
		int y2 = s.nextInt();
		System.out.println("Unesite x: ");
		int x = s.nextInt();
		System.out.println("Unesite y: ");
		int y = s.nextInt();
		
		if (x >= x1 && x <= x2 && y <= y1 && y >= y2) {
			System.out.println("Kliknuto je unutar forme");
		} else {
			System.out.println("Nije kliknuto je unutar forme");
		}
		
	}

}
