package p05_09_2022_zadatak2;

public abstract class PlatnaKartica {

	
	public PlatnaKartica(double sumaDolari, String broj, int godIsteka, int mesecIsteka) {
		super();
		this.sumaDolari = sumaDolari;
		this.broj = broj;
		this.godIsteka = godIsteka;
		this.mesecIsteka = mesecIsteka;
	}
	protected double sumaDolari;
	protected String broj;
	protected int godIsteka;
	protected int mesecIsteka;
	
	public double getSumaDolari() {
		return sumaDolari;
	}
	public String getBroj() {
		return broj;
	}
	public int getGodIsteka() {
		return godIsteka;
	}
	public int getMesecIsteka() {
		return mesecIsteka;
	}
	
	public void dodajSredstva(double suma) {
		this.sumaDolari += suma;
	}
	
	public abstract void izvrsiTransakciju(double suma);
	
	public abstract void stampaj();
	
	
	
	
	
	
}
