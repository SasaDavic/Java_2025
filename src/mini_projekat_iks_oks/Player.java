package mini_projekat_iks_oks;

public class Player {

	public Player(String punoIme) {
		super();
		this.punoIme = punoIme;
	}
	private String punoIme;
	
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void print() {
		System.out.println("Igrac: " + this.punoIme);
	}
	
}
