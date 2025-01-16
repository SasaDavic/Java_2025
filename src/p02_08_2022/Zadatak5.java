package p02_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna povrsinu kvadrata stranice a, 
		 * i povrsinu kruga poluprecnika r. PI = 3.14. 
		 * Povrsina kruga je r (na kvadrat) * pi
				Primer izvrsenja:
				a: 5
				Povrsina kvadrata je 25
				r: 3
				Povrsina kruga je 28.26
		 */
		
		int a, r;
		a = 5;
		r = 3;
		
		int pKvadrata = a * a;
		double pKruga = r * r * 3.14;
		
		System.out.println("a: " + a);
		System.out.println("Povrsina kvadrata je " + pKvadrata);
		System.out.println("r: " + r);
		System.out.println("Povrsina kruga je " + pKruga);

	}

}
