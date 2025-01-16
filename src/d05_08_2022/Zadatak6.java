package d05_08_2022;

public class Zadatak6 {

	public static void main(String[] args) {
		/*
Napisati program koji pronalazi 7 stepen broja 2. 
Izvrsenje:
2 na stepen 7 je 128

		 */
		int stepen = 1;
		int broj = 2;
		
		for (int i = 0; i < 7; i++) {
			stepen *= broj;
		}
		System.out.println("2 na stepen 7 je " + stepen);
		
	}

}
