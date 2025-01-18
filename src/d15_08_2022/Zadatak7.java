package d15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
	/*
	 * (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
	 * U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
	 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite 3 cela broja: ");
		System.out.println("A:");
		int a = s.nextInt();
		System.out.println("B:");
		int b = s.nextInt();
		System.out.println("C:");
		int c = s.nextInt();
		System.out.println("Najmanji broj je " + minBroj(a, b, c));
		
	}
	
	public static int minBroj(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= c) {
			return b;
 		} else return c;
	}

}
