package p22_08_2022_zadatak3;

public class Kupac {
	
	private String ime;
	private ClanskaKarta karta;
		
	public Kupac(String ime, ClanskaKarta karta) {
		this.ime = ime;
		this.karta = karta;
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public ClanskaKarta getKarta() {
		return karta;
	}
	public void print() {
		System.out.println(this.ime + " - " + this.karta.getBrKartice());
	}
	
	
	
	
}
