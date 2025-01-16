package d04_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #) 
tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne. Konkatanacija stringova u javi

Primer izvrsenja 1:
Unesite a: 10  -> # 10
Unesite b: -2   -> -2 # 10
Unesite c: -1   -> -1 -2 # 10
Unesite d: 9    -> -1 -2 # 10 9
String p ime vrednost = -1 -2 # 10 9

Primer izvrsenja 2:
Unesite a: 5
Unesite b: 4
Unesite c: 41
Unesite d: -1
String p ime vrednost = -1 # 5 4 41

Primer izvrsenja 3:
Unesite a: 11
Unesite b: 2
Unesite c: 7
Unesite d: 15
String p ime vrednost = # 11 2 7 15

Primer izvrsenja 4:
Unesite a: -11
Unesite b: -2
Unesite c: -7
Unesite d: 15
String p ime vrednost = -7 -2 -11 # 15

		 */
		
		Scanner s = new Scanner(System.in);
		String p = "#";
		
		System.out.println("Unesite a: ");
		int a = s.nextInt();
		
		if (a >= 0) {
			p += " " + a;
		} else {
			p = a + " " + p;
		}
		
		System.out.println("Unesite b: ");
		int b = s.nextInt();
		
		if (b >= 0) {
			p += " " + b;
		} else {
			p = b + " " + p;
		}
		
		System.out.println("Unesite c: ");
		int c = s.nextInt();
		
		if (c >= 0) {
			p += " " + c;
		} else {
			p = c + " " + p;
		}
		
		System.out.println("Unesite d: ");
		int d = s.nextInt();
		
		if (d >= 0) {
			p += " " + d;
		} else {
			p = d + " " + p;
		}
		
		System.out.println("String p ime vrednost = " + p);

	}

}
