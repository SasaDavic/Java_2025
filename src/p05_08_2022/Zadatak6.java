package p05_08_2022;

public class Zadatak6 {

	public static void main(String[] args) {
		// Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100

		
		for (int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		for (int i = 2; i < 101; i += 2) {
			System.out.print(i + ", ");
		}
		
	}

}
