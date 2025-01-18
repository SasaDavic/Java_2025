package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
	 * Napisati funkciju koja stampa zbir, razliku, 
	 * proizvod i kolicnik za dva prosledjena broja. 
	 * Brojevi su ulazni parametri funkcije. 
	 * U gravnom programu pozvati nekoliko puta funkciju 
	 * sa razlicitim prosledjenim vrednostima. 
	 */
		
		kalkulator(4, 2);
		kalkulator(10, 5);
		kalkulator(1, 8);

	}
	
	public static void kalkulator(int x, int y) {
		System.out.println("x + y = " + (x + y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x / y = " + (x / y));
	}

}
