package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {

	public static void main(String[] args) {
	/*
Napisati program koji ispisuje niz brojeva na ekranu. 
Niz je definisan proizvoljno.
Primer:
1, 2, 34, 5, 7, -9
KORISTECI PETLJU !!!!!!!!!!!!!!!!!!

	 */
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(10));
		}
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + ", ");
		}

	}

}
