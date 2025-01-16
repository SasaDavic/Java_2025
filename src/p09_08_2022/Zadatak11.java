package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
	/*
Napisati program koji vrsi mesanje niza. 
Niz je duzine 10, proizvoljnih brojeva. 
Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva 
random elementa iz niza.
primer jedne zamene:
Ako je niz
1,2,3,4,5,6,7,8,9,10
i prvi random indeks je 4 a drugi random indeks je 6
1,2,3,4,7,6,5,8,9,10

	 */
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Integer> niz = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			niz.add(i);
		}
		System.out.println(niz);
		
		for (int i = 0; i < 8; i++) {
			int x = random.nextInt(10);
			int y = random.nextInt(10);
			int a = niz.get(x);
			int b = niz.get(y);
			System.out.println("Menjamo mesto " + x + " sa mestom " + y);
			niz.set(x, b);
			niz.set(y, a);
			System.out.println(niz);
		}
	}

}
