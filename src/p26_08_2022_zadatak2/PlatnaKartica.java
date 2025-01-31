package p26_08_2022_zadatak2;

public class PlatnaKartica {
	
	public PlatnaKartica(double novacDolari, String broj, int godinaIsteka, int mesecIsteka) {
		super();
		this.novacDolari = novacDolari;
		this.broj = broj;
		this.godinaIsteka = godinaIsteka;
		this.mesecIsteka = mesecIsteka;
	}
	protected double novacDolari;
	protected String broj;
	protected int godinaIsteka;
	protected int mesecIsteka;
	
	public double getNovacDolari() {
		return novacDolari;
	}
	public String getBroj() {
		return broj;
	}
	public int getGodinaIsteka() {
		return godinaIsteka;
	}
	public int getMesecIsteka() {
		return mesecIsteka;
	}
	
	public void dodajSredstva(double uplata) {
		this.novacDolari += uplata;
	}
	
	public void izvrsiTransakciju(double isplata) {
		this.novacDolari -= isplata;
	}
	
	public void stampaj() {
		System.out.println(this.broj + ", " + this.mesecIsteka + "/" + this.godinaIsteka + ", $" + this.novacDolari);
	}
	
	
	
	
	
	
	
}
