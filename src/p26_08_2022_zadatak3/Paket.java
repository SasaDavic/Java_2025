package p26_08_2022_zadatak3;

public class Paket {
	
	public Paket(String naziv, String imeKorisnika, double cena, int ugovornaObaveza, int downloadSpeed,
			int uploadSpeed) {
		super();
		this.naziv = naziv;
		this.imeKorisnika = imeKorisnika;
		this.cena = cena;
		this.ugovornaObaveza = ugovornaObaveza;
		this.downloadSpeed = downloadSpeed;
		this.uploadSpeed = uploadSpeed;
	}
	
	protected String naziv;
	protected String imeKorisnika;
	protected double cena;
	protected int ugovornaObaveza;
	protected int downloadSpeed;
	protected int uploadSpeed;
	
	public String getImeKorisnika() {
		return imeKorisnika;
	}
	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public int getUgovornaObaveza() {
		return ugovornaObaveza;
	}
	public void setUgovornaObaveza(int ugovornaObaveza) {
		this.ugovornaObaveza = ugovornaObaveza;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getDownloadSpeed() {
		return downloadSpeed;
	}
	public int getUploadSpeed() {
		return uploadSpeed;
	}
	
	public void produziUgovor() {
		this.ugovornaObaveza += 12;
	}
	
	public int brMeseci1Dinar() {
		return 0;
	}
	
	public void stampaj() {
		System.out.println(this.imeKorisnika);
		System.out.println(this.naziv + " - " + this.downloadSpeed + " download/ " + this.uploadSpeed + " upload - " + this.ugovornaObaveza + " meseci!");
		System.out.println("Cena: " + this.cena);
	}

	
}
