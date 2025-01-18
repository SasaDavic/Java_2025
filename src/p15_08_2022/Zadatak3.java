package p15_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Napisati metoda koja stampa zvezdicu sa razmakom. 
U glavnom programu je potrebno odstampati sledecu 
sliku koristeci metode koje smo definisali.
			*  *  * 
			*  *  
			*  
	 */
		
		numStars(3);
		printLn();
		numStars(2);
		printLn();
		numStars(1);
		
	}
	
	public static void printStar() {
		System.out.print("* ");
	}
	public static void numStars(int num) {
		for (int i = 0; i < num; i++) {
			printStar();
		}
	}
	public static void printLn() {
		System.out.println();
	}

}
