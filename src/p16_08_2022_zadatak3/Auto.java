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
	
	
	public void stampaj() {
		System.out.println(this.imeVlasnika);
		System.out.println(this.marka + " - " + this.brVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnjaNa100Km + " l na 100km");
		System.out.println(this.trenutnBrzina + " km/h je trenutna brzina.");
		System.out.println("Godina proizvodnje: " + this.godProizvodnje);
		if (jeOldtimer() == true) {
			System.out.println("Auto je oldtimer!");
		}
		if (vaziRegistracija(6) == true) {
			System.out.println("Registracija nije istekla!");
		} else {
			System.out.println("Registracije je istekla, cena registracije je: " + cenaRegistracije());
		}
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
	

}
