package d06_09_2022_zadatak1;

import java.util.ArrayList;

public class Korpa {

	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();
	
	public ArrayList<Ambalaza> getNizAmbalaza() {
		return nizAmbalaza;
	}
	public void dodajAmbalazu(Ambalaza a) {
		this.nizAmbalaza.add(a);
	}
	public void izbaciAmbalazu(String barKod) {
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			if (this.nizAmbalaza.get(i).getBarkod().equals(barKod)) {
				this.nizAmbalaza.remove(i);
				i--; //ako ima vise proizvoda sa istim barkodom, jedan iza drugog. Ovo obezbedjuje da ne preskocimo neki
			}
		}
	}
	private double ukupnaCenaPopust(double popust) {
		double suma = 0;
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			suma += this.nizAmbalaza.get(i).cenaArtikla() * (1 - popust / 100);
		}
		return suma;
	}
	
	public double ukupnaCenaKorpe(SuperKartica kartica) {
		return ukupnaCenaPopust(kartica.getPopust());
	}
}
