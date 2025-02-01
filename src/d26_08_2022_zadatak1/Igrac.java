package d26_08_2022_zadatak1;

public class Igrac extends Osoba {
	
public Igrac(String punoIme, String jmbg, int godRodjenja) {
		super(punoIme, jmbg, godRodjenja);
	}
public Igrac(String punoIme, String jmbg, int godRodjenja, int brojDresa, String pozicija, boolean jeKapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}
	
	private int brojDresa;
	private String pozicija;
	private boolean jeKapiten;
	
	public int getBrojDresa() {
		return brojDresa;
	}
	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
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
	
	@Override
	public void stampaj() {
		super.stampaj();
		if (this.jeKapiten) {
			System.out.println("Igrac je kapiten!");
		}
		System.out.println("Igra na poziciji: " + this.pozicija);
		System.out.println("Broj: " + this.brojDresa);
	}
	
	
}
