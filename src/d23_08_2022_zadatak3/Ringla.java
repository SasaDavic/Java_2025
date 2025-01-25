package d23_08_2022_zadatak3;

public class Ringla {

	public Ringla(String tipRingle, double jacinaGrejacaKw) {
		super();
		this.tipRingle = tipRingle;
		this.jacinaGrejacaKw = jacinaGrejacaKw;
		this.jacina = 0;
	}
	
	private String tipRingle; //obicna ili ekspres
	private int jacina; //za obicnu ringu jacina je u opsegu od 0 do 3
						//za ekspres ringlu jacina je u opsegu od 0 do 12
	private double jacinaGrejacaKw; //npr: 0.8, 1, 1.5, …
	
	public int getJacina() {
		return jacina;
	}
	
	private int maxBrojPojacavanja() {
		if (this.tipRingle.equals("obicna")) {
			return 3;
		} else if (this.tipRingle.equals("ekspres")) {
			return 12;
		}
		return 0;
	}
	
	public void pojacajRinglu() {
		this.jacina++;
		if (this.jacina > 3 && this.tipRingle.equals("obicna")) {
			this.jacina = 3;
			System.out.println("Ringla je podesena na max jacinu!");
		}
		if (this.jacina > 12 && this.tipRingle.equals("ekspres")) {
			this.jacina = 12;
			System.out.println("Ringla je podesena na max jacinu!");
		}
	}
	
	public void iskljuciRinglu() {
		this.jacina = 0;
	}
	
	public boolean jeUkljucen() {
		if (this.jacina > 0) {
			return true;
		}
		return false;
	}
	
	public double potrosnjaEE(int brSatiUkljucena) {
		return 100 / maxBrojPojacavanja() * this.jacina * this.jacinaGrejacaKw * brSatiUkljucena;
	}
	
	public void stampaj() {
		if (jeUkljucen() == true) {
			System.out.println("Ringla je ukljucena!");
		} else {
			System.out.println("Ringla je iskljucena!");
		}
		System.out.println("Tip ringle: " + this.tipRingle);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejacaKw + " kw");
	}
	
		
}
