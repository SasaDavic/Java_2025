package d26_08_2022_zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
	
	public Igrac(String punoIme, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}
	public Igrac(String punoIme, String jmbg, int godRodjenja) {
		super(punoIme, jmbg, godRodjenja);
	}
	private int broj;
	private String pozicija;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean jeKapiten;
	
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isJeKapiten() {
		return jeKapiten;
	}
	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}
	
	public void dodajKarton(Karton k) {
		this.kartoni.add(k);
	}
	
	public int brZutih() {
		int brojac = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (this.kartoni.get(i).getTip().equals("zuti")) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public int brCrvenih() {
		int brojac = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (this.kartoni.get(i).getTip().equals("crveni")) {
				brojac++;
			}
		}
		return brojac;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Pozicija: " + this.pozicija);
		System.out.println("Broj: " + this.broj);
		if (this.jeKapiten ) {
			System.out.println("Igrac je kapiten!");
		}
		System.out.println("Broz zutih kartona: " + brZutih());
		System.out.println("Broz crvenih kartona: " + brCrvenih());
	}

	
	
	
	
}
