package p06_09_2022_zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {
	
	private String imeGrada;
	private ArrayList<Objekat> nizObjekata = new ArrayList<>();
	
	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	public PoreskaUprava(String imeGrada) {
		super();
		this.imeGrada = imeGrada;
	}

	public void dodajObjekat(Objekat o) {
		this.nizObjekata.add(o);
	}
	
	public Objekat najveciPorez() {
		double najveciP = 0;
		Objekat objekat = null;
		for (int i = 0; i < this.nizObjekata.size(); i++) {
			if (this.nizObjekata.get(i).porez() > najveciP) {
				objekat = this.nizObjekata.get(i);
				najveciP = this.nizObjekata.get(i).porez();
			}
		}
		return objekat;
	}
	
	public Objekat najmanjiPorez() {
		double najmanjiP = this.nizObjekata.get(0).porez();
		Objekat objekat = this.nizObjekata.get(0);
		for (int i = 0; i < this.nizObjekata.size(); i++) {
			if (this.nizObjekata.get(i).porez() < najmanjiP) {
				objekat = this.nizObjekata.get(i);
				najmanjiP = this.nizObjekata.get(i).porez();
			}
		}
		return objekat;
	}
	
	public double ukupanPorez() {
		double suma = 0;
		for (int i = 0; i < this.nizObjekata.size(); i++) {
			suma += this.nizObjekata.get(i).porez();
		}
		return suma;
	}
	
	public void stampajObjekte() {
		System.out.println("Poreska Uprava grad " + this.imeGrada);
		for (int i = 0; i < this.nizObjekata.size(); i++) {
			this.nizObjekata.get(i).stampaj();
			System.out.println();
		}
	}
}
