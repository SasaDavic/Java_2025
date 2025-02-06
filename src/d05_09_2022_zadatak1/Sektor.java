package d05_09_2022_zadatak1;

public class Sektor {
	
	public Sektor(String naziv, double plata) {
		super();
		this.naziv = naziv;
		this.plata = plata;
	}
	private String naziv;
	private double plata;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	
}
