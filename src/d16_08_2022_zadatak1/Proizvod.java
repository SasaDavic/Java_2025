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

	public void povecajCenu(double povecajZa) {
		this.cena += povecajZa;
	}
	
	public double vratiCenuSaPopustom(int popust) {
		return this.cena * ((100 - popust) * 0.01);
	}
	
	public double racunajPostarinu() {
		if (this.tezinaGram < 101) {
			return 200;
		} else if (this.tezinaGram < 501) {
			return 400;
		} else {
			return 1000;
		}
	}
	
	public void stampajCenuSaPopustom(int popust) {
		System.out.println("Sa popustom od " + popust + "%");
		System.out.println(this.naziv + ": ");
		System.out.println("Stara cena: " + this.cena);
		System.out.println("Nova cena " + vratiCenuSaPopustom(popust));
		System.out.println("Postarina: " + racunajPostarinu());
	}
}
