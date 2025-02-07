package p06_09_2022_zadatak1;

public abstract class Objekat {
	
	public Objekat() {
		super();
	}
	public Objekat(String adresa, double povrsina, int zona) {
		super();
		this.adresa = adresa;
		this.povrsina = povrsina;
		this.zona = zona;
	}
	protected String adresa;
	protected double povrsina;
	protected int zona;
	
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public double getPovrsina() {
		return povrsina;
	}
	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	
	public double koeficijent() {
		if (this.zona == 1) {
			return 1.4;
		} else if (this.zona == 2) {
			return 1.1;
		} else if (this.zona == 3) {
			return 1.05;
		}
		return 0;
	}
	
	public abstract double porez();
	
	public abstract void stampaj();

}
