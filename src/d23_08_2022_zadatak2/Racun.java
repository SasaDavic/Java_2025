package d23_08_2022_zadatak2;

public class Racun {
	
	public Racun(String broj, String punoImeVlasnika, double stanje) {
		super();
		this.broj = broj;
		this.punoImeVlasnika = punoImeVlasnika;
		this.stanje = stanje;
	}
	
	private String broj;
	private String punoImeVlasnika;
	private double stanje;
	
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public String getPunoImeVlasnika() {
		return punoImeVlasnika;
	}
	public void setPunoImeVlasnika(String punoImeVlasnika) {
		this.punoImeVlasnika = punoImeVlasnika;
	}
	public double getStanje() {
		return stanje;
	}
	
	public void promenaStanja(double uplata) { //ako je isplata onda -uplata, tj uplata je negativan broj
		if (this.stanje + uplata < 0) {
			System.out.println("Nemate dovoljno sredstva na racunu!");			
		} else {
			this.stanje += uplata;
		}
	}
	public void stampajPodatke() {
		System.out.println(this.punoImeVlasnika + " - " + this.broj);
		System.out.println("stanje na racunu je " + this.stanje + " rsd.");
	}
	
	
	
}
