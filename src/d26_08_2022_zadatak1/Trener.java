package d26_08_2022_zadatak1;

public class Trener extends Osoba{

	public Trener(String punoIme, String jmbg, int godRodjenja) {
		super(punoIme, jmbg, godRodjenja);
	}

	public Trener(String punoIme, String jmbg, int godRodjenja, int godIskustva, String tip) {
		super(punoIme, jmbg, godRodjenja);
		this.godIskustva = godIskustva;
		this.tip = tip;
	}

	private int godIskustva;
	private String tip; //kondicioni, za igru, pomocni, personalni
	
	
	public int getGodIskustva() {
		return godIskustva;
	}

	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Tip trenera: " + this.tip);
		System.out.println("Godine iskustva: " + this.godIskustva);
	}
}
