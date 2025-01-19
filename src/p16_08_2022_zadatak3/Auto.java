package p16_08_2022_zadatak3;

public class Auto {


	public String imeVlasnika;
	public String marka;
	public int brVrata;
	public double potrosnjaNa100Km;
	public int trenutnBrzina;
	
	public int godProizvodnje;
	public int mesecIstekaRegistracije;
	public int kubikaza;
	
	public String brRegistracije;
	public boolean klimaOn;
	
	public int maxBrzina;
	
	public double kapacitetRezervoara;
	public double trenutnoGorivaURezervoaru;
	
	public void stampaj() {
		System.out.println(this.imeVlasnika);
		System.out.println(this.marka + " - " + this.brVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnjaNa100Km + " l na 100km");
		System.out.println(this.trenutnBrzina + " km/h je trenutna brzina.");
		System.out.println("Registracija: " + this.brRegistracije);
		System.out.println("Godina proizvodnje: " + this.godProizvodnje);
		if (jeOldtimer() == true) {
			System.out.println("Vozilo je oldtimer!");
		}
		System.out.println("Potrosnja vozila u ovom trenutku je: " + potrosnja());
	}

	public boolean jePrekoracio (int ogranicenje) {
		if (this.trenutnBrzina > ogranicenje) {
			return true;
		}
		return false;
	}
	
	public int kazna (int ogranicenje) {
		if (jePrekoracio(ogranicenje) == true) {
			return (this.trenutnBrzina - ogranicenje) * 1000;
		}
		return 0;
	}
	
	public boolean jeOldtimer() {
		if (this.godProizvodnje < 1950) {
			return true;
		}
		return false;
	}
	public boolean vaziRegistracija(int mesec) {
		if (this.mesecIstekaRegistracije >= mesec) {
			return true;
		}
		return false;
	}
	public double cenaRegistracije() {
		if (this.kubikaza <= 2000) {
			return this.kubikaza * 100;
		} else {
			return this.kubikaza * 100 * 1.3;
		}
	}
	public void dodajGas() {
		this.trenutnBrzina += 10;
		if (this.trenutnBrzina > this.maxBrzina) {
			this.trenutnBrzina = this.maxBrzina;
		}
	}
	public void koci() {
		this.trenutnBrzina -= 10;
		if (this.trenutnBrzina < 0) {
			this.trenutnBrzina = 0;
		}
	}
	public double potrosnja() {
		double x = this.trenutnBrzina * 0.01  * this.potrosnjaNa100Km;
		if (this.klimaOn == true) {
			return x * 1.2;
		} else 
			return x;
	}
	public void stampajTablu() {
		int brCrtica = (this.trenutnBrzina * 100) / this.maxBrzina;
		for (int i = 0; i < 100; i++) {
			if (i < brCrtica) {
				System.out.print("|");
			} else {
				System.out.print(".");
			}
		}
		System.out.println(this.trenutnBrzina + "/" + this.maxBrzina + " km/h");
	}
	
	public double natoci (double kolikoLitra) {
		if (this.kapacitetRezervoara >= this.trenutnoGorivaURezervoaru + kolikoLitra) {
			double a = kolikoLitra * 170;
			System.out.println("Natocili ste " + kolikoLitra + "l, to je " + a + "din.");
			return a;
		} else {
			double b = this.kapacitetRezervoara - this.trenutnoGorivaURezervoaru;
			double c = b * 170;
			System.out.println("Rezervoar je pun! Natocili ste " + b + "l, to je " + c + "din.");
			return b;
		}
	}
	

}
