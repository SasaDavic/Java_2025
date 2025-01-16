package p02_08_2022;

public class zadatak3 {

	public static void main(String[] args) {
		/*
		 * Naci zbir, razliku, kolicnik i proizvod brojeva a i b i rezultate smestati u odgovarajuce     
		 * promenljive.Na kraju programa odstampati rezultate
				Primer izvrsenja:
				a: 10
				b: 2
				Zbir je 12
				Razlika je 8
				Proizvod je 20
				Kolicnik je 5

		 */
		
		int a, b, zbir, razlika, proizvod;
		double kolicnik;
		a = 9;
		b = 4;
		zbir = a + b;
		razlika = a - b;
		proizvod = a * b;
		kolicnik = 1.00 * a / b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Zbir je " + zbir);
		System.out.println("Razlika je " + razlika);
		System.out.println("Proizvod je " + proizvod);
		System.out.println("Kolicnik je " + kolicnik);
	}

}
