package p08_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
		/*
Napisati program koji sabira brojeve vece od nule a da ne predje sumu 100.
1 + 2 + 3 + 4 + … 

		 */
		
		int suma = 0;
		int prBr = 1;
		
		while(suma + prBr <= 100) {
			suma += prBr;
			prBr++;
		}
		System.out.println("Poslednji prirodan broj je " + prBr);
		System.out.println("Suma je " + suma);
	}

}
