package p06_09_2022_zadatak1;

public class Lokal extends Objekat {

	public Lokal(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
	}
	
	@Override
	public double porez() {
		return this.koeficijent() * this.povrsina * 1.3;
	}

	@Override
	public void stampaj() {
		System.out.println("Lokal: ");		
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);		
	}

	
}
