package p06_09_2022_zadatak2;

import java.util.ArrayList;

public abstract class Proizvod {

	public Proizvod() {
		super();
	}
	protected ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();
	
	public void ubaciDodatak(Dodatak d) {
		this.dodaci.add(d);
	}
	
	public double cenaSvihDodatakaProizvoda() {
		double suma = 0;
		for (int i = 0; i < this.dodaci.size(); i++) {
			suma += this.dodaci.get(i).getCena();
		}
		return suma;
	}
	
	public abstract double racunajUkupnuCenu();
	public abstract void stampaj();
}
