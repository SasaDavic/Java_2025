package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak7 {

	public static void main(String[] args) {
		// Napisati progam koji stampa niz u obrnutom 
		// redosledu tj. od zadnjeg elementa do prvog.


		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(10));
		}
		System.out.println(numbers);
		int x = numbers.size();
		while (x > 0) {
			int a = numbers.get(x - 1);
			System.out.print(a + ", ");
			x--;
		}
		System.out.println();
		
	}

}
