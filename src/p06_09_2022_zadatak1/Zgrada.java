package p06_09_2022_zadatak1;

public class Zgrada extends Objekat {

	private int brStanova;

	public Zgrada(String adresa, double povrsina, int zona, int brStanova) {
		super(adresa, povrsina, zona);
		this.brStanova = brStanova;
	}

	public int getBrStanova() {
		return brStanova;
	}

	public void setBrStanova(int brStanova) {
		this.brStanova = brStanova;
	}

	@Override
	public double porez() {
		return this.koeficijent() * this.povrsina * this.brStanova;
	}

	@Override
	public void stampaj() {
		System.out.println("Zgrada: ");
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Broj stanova: " + this.brStanova);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
	}
	
}
