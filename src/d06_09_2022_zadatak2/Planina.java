package d06_09_2022_zadatak2;

public class Planina {
	
	private String ime;
	private String drzava;
	private double visina;
	
	
	public Planina() {
		super();
	    this.ime = "Nepoznata planina";   // postavlja neku default vrednost
	    this.drzava = "Nepoznata drzava"; // postavlja neku default vrednost
	    this.visina = 0; // ili neka default vrednost
		if (visina < 0) {
			throw new IllegalArgumentException("Visina planine ne moze biti negativna!");
		}
	}

	public Planina(String ime, String drzava, double visina) {
		super();
		if (visina < 0) {
			throw new IllegalArgumentException("Visina planine ne moze biti negativna!");
		}
		this.ime = ime;
		this.drzava = drzava;
		this.visina = visina;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public double getVisina() {
		return visina;
	}
	// Seter sa validacijom
	public void setVisina(double visina) {
		if (visina < 0) {
			throw new IllegalArgumentException("Visina planine ne moze biti negativna!");
		}
		this.visina = visina;
	}
	
	
	
	
	
}
