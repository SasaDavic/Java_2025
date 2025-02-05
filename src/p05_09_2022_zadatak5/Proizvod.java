package p05_09_2022_zadatak5;

import java.util.ArrayList;

	public abstract class Proizvod {
	
	public Proizvod() {
		super();
	}

	protected ArrayList<Dodatak> dodaci = new ArrayList<>();
	
	
	public ArrayList<Dodatak> getDodaci() {
		return dodaci;
	}

	public void setDodaci(ArrayList<Dodatak> dodaci) {
		this.dodaci = dodaci;
	}

	public void ubaciDodatak(Dodatak d) {
		this.dodaci.add(d);
	}
	
	public double cenaSvihDodataka() {
		double suma = 0;
		for (int i = 0; i < dodaci.size(); i++) {
			suma += dodaci.get(i).getCena();
		}
		return suma;
	}
	
	public abstract void stampaj();
	
	public abstract double racunajUkupnuCenu();
	
	
	
	
	
}
