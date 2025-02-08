package d06_09_2022_zadatak1;

public class Tetrapak extends Ambalaza {
	
	private boolean reciklaza;
	private double osnovnaCena;
	
	public boolean isReciklaza() {
		return reciklaza;
	}
	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	public Tetrapak(String barkod, String nazivArtikla, double netoTezinu, double brutoTezinu, boolean reciklaza,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezinu, brutoTezinu);
		// Validacija za negativne vrednosti
	    if (netoTezinu < 0) {
	        throw new IllegalArgumentException("Neto težina ne može biti negativna.");
	    }
	    if (brutoTezinu < 0) {
	        throw new IllegalArgumentException("Bruto težina ne može biti negativna.");
	    }
	    if (osnovnaCena < 0) {
	        throw new IllegalArgumentException("Osnovna cena ne može biti negativna.");
	    }
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}
	
	@Override
	public double cenaArtikla() {
		if (this.reciklaza) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		}
		return this.osnovnaCena;
	}
	
	@Override
	public void stampaj() {
		System.out.println(this.nazivArtikla);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Bruto tezina: " + this.brutoTezinu);
		System.out.println("Neto tezina: " + this.netoTezinu);
		
		System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
		if (this.reciklaza) {
			System.out.println("Ambalaza se moze reciklirati!");
		} else {
			System.out.println("Ambalaza se ne moze reciklirati!");
		}
		System.out.println("Cena: " + this.cenaArtikla());
	}
	
}
