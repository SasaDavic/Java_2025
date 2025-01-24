package p23_08_2022_zadatak3;

public class Sastojak {

	public Sastojak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	private String naziv;
	private double cena;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public void stampaj() {
		System.out.println(this.naziv + " - " + this.cena + " din.");
	}
	
	
}
