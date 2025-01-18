package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
	/*
Napisati metodu koja vraca suprotno negativni broj od prosledjenog. 
Metoda prima broj N i vraca ga sa negativnom vrednoscu.
Primer: Ako se metoda pozove za N=10, vraca -10
	Ako se metoda pozove za N=-11, vraca 11

	 */
		int x = -10;
		int y = negativnaVrednost(x);
		System.out.println("X je " + x + ", negativna vrednost je " + y);
		

	}
	
	public static int negativnaVrednost(int broj) {
		return -1 * broj;
	}

}
