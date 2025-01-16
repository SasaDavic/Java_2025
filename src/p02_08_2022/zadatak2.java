package p02_08_2022;

public class zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji na ekranu stampa podatke u formatu:
			Sifra [SIFRA PROIZVODA]
			[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
			[BOJA], [VELICINA

		 */

		String productCode = "x932k20";
		String productName = "Nike Patike";
		int productPrice = 90;
		double discount = 13.5;
		String color = "Crna";
		double size = 46.5;
		
		System.out.println("Sifra " + productCode);
		System.out.println(productName + " - $" + productPrice +
				" - Popust " + discount + "%");
		System.out.println(color + ", " + size);
		
		
	}

}
