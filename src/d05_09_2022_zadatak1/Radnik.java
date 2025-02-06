package d05_09_2022_zadatak1;

import java.util.ArrayList;

public abstract class Radnik {
	
	public Radnik(String punoIme) {
		super();
		this.punoIme = punoIme;
	}

	protected String punoIme;
	
	protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();
	
	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public abstract double plata();
	
	public void zaposliSeUSektor(Sektor s) {
		this.nizSektora.add(s);
	}

}
