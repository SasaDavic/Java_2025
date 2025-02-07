package p06_09_2022_zadatak1;

public class Kuca extends Objekat {
	
	private int brojClanova;

	public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
		super(adresa, povrsina, zona);
		this.brojClanova = brojClanova;
	}

	public int getBrojClanova() {
		return brojClanova;
	}

	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}

	@Override
	public double porez() {
		return this.koeficijent() * this.povrsina;
	}

	@Override
	public void stampaj() {
		System.out.println("Kuca: ");		
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Broj clanova: " + this.brojClanova);
		
	}
	

}
