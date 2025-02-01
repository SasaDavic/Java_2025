package d26_08_2022_zadatak1;

public class Osoba {

	public Osoba(String punoIme, String jmbg, int godRodjenja) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}
	public Osoba() {
		super();
	}
	
	protected String punoIme;
	protected String jmbg;
	protected int godRodjenja;
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodRodjenja() {
		return godRodjenja;
	}
	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godRodjenja);
	}
	
}
