package p23_08_2022_zadatak1;

public class Korisnik {

	public Korisnik(String punoIme) {
		this.punoIme = punoIme;
		this.tipLicence = "basic";
	}
	
	private String punoIme;
	private String tipLicence; //(basic/pro/premium)
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getTipLicence() {
		return tipLicence;
	}
	public void pretplatiSe(double uplata) {
		if (uplata == 100) {
			this.tipLicence = "pro";
		} else if (uplata == 150) {
			this.tipLicence = "premium";
		} else {
			System.out.println("Mozete da uplatite samo 100$ ili 150$!");
		}
	}
	
	public void ponistiPretplatu() {
		this.tipLicence = "basic";
	}
	public int maxDuzinaPoziva() {
		if (this.tipLicence.equals("basic")) {
			return 40;
		} else if (this.tipLicence.equals("pro")) {
			return 240;
		} else if (this.tipLicence.equals("premium")) {
			return 1440;
		}
		return 0;
	}
	public void print() {
		System.out.println(this.punoIme);
	}
	
	
	
	
	
	
}
