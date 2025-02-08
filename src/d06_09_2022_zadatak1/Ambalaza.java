package d06_09_2022_zadatak1;

public abstract class Ambalaza {
	
	protected String barkod;
	protected String nazivArtikla;
	protected double netoTezinu;
	protected double brutoTezinu;
	
	public Ambalaza(String barkod, String nazivArtikla, double netoTezinu, double brutoTezinu) {
		super();
		this.barkod = barkod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezinu = netoTezinu;
		this.brutoTezinu = brutoTezinu;
	}

	public Ambalaza() {
		super();
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public double getNetoTezinu() {
		return netoTezinu;
	}

	public void setNetoTezinu(double netoTezinu) {
		this.netoTezinu = netoTezinu;
	}

	public double getBrutoTezinu() {
		return brutoTezinu;
	}

	public void setBrutoTezinu(double brutoTezinu) {
		this.brutoTezinu = brutoTezinu;
	}
	
	public double tezinaPakovanja() {
		return this.brutoTezinu - this.netoTezinu;
	}
	
	public abstract double cenaArtikla();
	public abstract void stampaj();

}
