package p25_08_2022_zadatak1;

import java.util.ArrayList;

public class Pasta {
	
	public Pasta() {
		super();
	}

	private ArrayList<Sastojak> nizSastojaka = new ArrayList<Sastojak>();
	
	public void dodajSastojak(Sastojak ime) {
		nizSastojaka.add(ime);
	}
	private double cenaPaste() {
		double cena = 0;
		for (int i = 0; i < nizSastojaka.size(); i++) {
			cena += nizSastojaka.get(i).getCena();
		}
		return cena;
	}
	public void stampaj() {
		System.out.println("Pasta je sa sastojcima: ");
		for (int i = 0; i < nizSastojaka.size(); i++) {
			System.out.print(i + 1 + ". ");
			nizSastojaka.get(i).print();
		}
		System.out.println("--------------------------");
		System.out.println("Cena paste je " + cenaPaste() + " din.");
	}
	
	public void brisiSastojak(String ime) {
		for (int i = 0; i < nizSastojaka.size(); i++) {
			if (nizSastojaka.get(i).getNaziv().equals(ime)) {
				nizSastojaka.remove(i);
			}
		}
	}
	
}
