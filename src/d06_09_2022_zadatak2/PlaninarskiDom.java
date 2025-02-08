package d06_09_2022_zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
	
	private String naziv;
	private int godOsnivanja;
	private ArrayList<Planinar> clanoviDoma = new ArrayList<>();
	
	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String naziv, int godOsnivanja) {
		super();
		this.naziv = naziv;
		this.godOsnivanja = godOsnivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}
	
	public void uclaniPlaninara(Planinar p) {
		this.clanoviDoma.add(p);
	}
	
	public void izbaciPlaninara(int idBroj) {
		for (int i = 0; i < this.clanoviDoma.size(); i++) {
			if (this.clanoviDoma.get(i).getId() == idBroj) {
				this.clanoviDoma.remove(i);
			}
		}
	}
	
	public int brojUspesnihUspona(Planina x) {
		int brojac = 0;
		for (int i = 0; i < this.clanoviDoma.size(); i++) {
			if (this.clanoviDoma.get(i).uspesanUspon(x)) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public void stampajDom() {
		System.out.println("Naziv doma: " + this.naziv);
		System.out.println("Godina osnivanja: " + this.godOsnivanja);
		System.out.println("Clanovi: ");
		for (int i = 0; i < this.clanoviDoma.size(); i++) {
			System.out.print(i + 1 + ". ");
			this.clanoviDoma.get(i).stampaj();
		}
	}
	
	public double mesecniPrihod() {
		double suma = 0;
		for (int i = 0; i < this.clanoviDoma.size(); i++) {
			suma += this.clanoviDoma.get(i).clanarina();
		}
		return suma;
	}

}
