package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak12 {

	public static void main(String[] args) {
	/*
Napisati program koji ima niz duzine 25 
proizvoljnih elemenata i stampa niz kao tablu dimenzije 5x5.
Primer stampe:
1, 2, 3, 4, 6,
5, 6, 7, 3, 4,
5, 2, 1, 4, 5,
6, 6, 6, 2, 1
1, 9, 8, 7, 6

	 */
		
		Random random = new Random();
		ArrayList<Integer> niz = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			niz.add(random.nextInt(10));
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(niz.get(j + 5*i) + ", ");
			}
			System.out.println();
		}
	}

}
