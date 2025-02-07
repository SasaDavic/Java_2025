package p06_09_2022_zadatak2;

import java.util.ArrayList;

public class Kasa {

	private ArrayList<Dodatak> nizDodataka = new ArrayList<Dodatak>();
	private ArrayList<Proizvod> nizProizvoda = new ArrayList<>();
	
	public void dodajProizvod(Proizvod proizvod) {
		this.nizProizvoda.add(proizvod);
	}

	public ArrayList<Dodatak> getNizDodataka() {
		return nizDodataka;
	}

	public void setNizDodataka(ArrayList<Dodatak> nizDodataka) {
		this.nizDodataka = nizDodataka;
	}

	public ArrayList<Proizvod> getNizProizvoda() {
		return nizProizvoda;
	}

	public void setNizProizvoda(ArrayList<Proizvod> nizProizvoda) {
		this.nizProizvoda = nizProizvoda;
	}

	public Kasa() {
		super();
		Dodatak d1 = new Dodatak("piletina", 150);
		Dodatak d2 = new Dodatak("junetina", 200);
		Dodatak d3 = new Dodatak("prsuta", 120);
		Dodatak d4 = new Dodatak("sunka", 100);
		Dodatak d5 = new Dodatak("jaje", 10);
		Dodatak d6 = new Dodatak("luk", 10);
		Dodatak d7 = new Dodatak("kackavalj", 70);
		Dodatak d8 = new Dodatak("pecurke", 50);
		Dodatak d9 = new Dodatak("cokolada", 80);
		Dodatak d10 = new Dodatak("jagoda", 150);
		Dodatak d11 = new Dodatak("karamela", 75);
		Dodatak d12 = new Dodatak("keks", 30);
		Dodatak d13 = new Dodatak("lesnik", 110);
		Dodatak d14 = new Dodatak("slag", 20);
		Dodatak d15 = new Dodatak("kikiriki", 70);
		this.nizDodataka.add(d1);
		this.nizDodataka.add(d2);
		this.nizDodataka.add(d3);
		this.nizDodataka.add(d4);
		this.nizDodataka.add(d5);
		this.nizDodataka.add(d6);
		this.nizDodataka.add(d7);
		this.nizDodataka.add(d8);
		this.nizDodataka.add(d9);
		this.nizDodataka.add(d10);
		this.nizDodataka.add(d11);
		this.nizDodataka.add(d12);
		this.nizDodataka.add(d13);
		this.nizDodataka.add(d14);
		this.nizDodataka.add(d15);
	}
	
	public Dodatak traziDodatak(String ime) {
		for (int i = 0; i < this.nizDodataka.size(); i++) {
			if(this.nizDodataka.get(i).getNaziv().equals(ime)) {
				return this.nizDodataka.get(i);
			}
		}
		System.out.println("Dodatak sa imenom " + ime + " nije pronađen.");
	    return null;  // Vrati null ako dodatak nije pronađen
	}
	
	public double sracunajCenuPorudzbine() {
		double suma = 0;
		for (int i = 0; i < this.nizProizvoda.size(); i++) {
			suma += this.nizProizvoda.get(i).racunajUkupnuCenu();
		}
		return suma;
	}
	
	public void setampajRacun() {
		for (int i = 0; i < this.nizProizvoda.size(); i++) {
			this.nizProizvoda.get(i).stampaj();
		}
		System.out.println("RACUN: " + this.sracunajCenuPorudzbine());
	}
	
	
}
