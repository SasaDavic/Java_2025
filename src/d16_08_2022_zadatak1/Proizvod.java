package d16_08_2022_zadatak1;

public class Proizvod {
	
	public String naziv;
	public double cena;
	public double tezinaGram;
	
	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + "din., " + this.tezinaGram + "g");
	}
	
	public double konvertuj(String jedinica) {
		if (jedinica.equals("kg")) {
			return this.tezinaGram * 0.001;
		} else if (jedinica.equals("t")) {
			return this.tezinaGram * 0.000001;
		}
		return 0;
	}

}
