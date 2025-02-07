package p06_09_2022_zadatak4;

public abstract class Atleticar {
	
	private String punoIme;
	protected double rezultat;
	
	
	public Atleticar(String punoIme, double rezultat) {
		super();
		this.punoIme = punoIme;
		this.rezultat = rezultat;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public double getRezultat() {
		return rezultat;
	}

	public abstract boolean boljiRezultatOd(Atleticar atleticar);
	
	public void printAtleticar() {
		System.out.println(this.punoIme + ", " + this.rezultat);
	}

}
