package d06_09_2022_zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
	
	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;
	
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezinu, double brutoTezinu, double kaucija,
			boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezinu, brutoTezinu);
		// Validacija za negativne vrednosti
	    if (netoTezinu < 0) {
	        throw new IllegalArgumentException("Neto težina ne može biti negativna.");
	    }
	    if (brutoTezinu < 0) {
	        throw new IllegalArgumentException("Bruto težina ne može biti negativna.");
	    }
	    if (kaucija < 0) {
	        throw new IllegalArgumentException("Kaucija ne može biti negativna.");
	    }
	    if (osnovnaCena < 0) {
	        throw new IllegalArgumentException("Osnovna cena ne može biti negativna.");
	    }
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}
	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
	@Override
	public double cenaArtikla() {
		if (this.daLiSePlacaKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}
		return this.osnovnaCena * 1.2;
	}
	@Override
	public void stampaj() {
		System.out.println(this.nazivArtikla);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Bruto tezina: " + this.brutoTezinu);
		System.out.println("Neto tezina: " + this.netoTezinu);
		System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
		if (this.daLiSePlacaKaucija) {
			System.out.println("Placa se kaucija " + this.kaucija);
		} else {
			System.out.println("Kaucija se ne placa");
		}
		System.out.println("Cena: " + this.cenaArtikla());		
	}
		
}
