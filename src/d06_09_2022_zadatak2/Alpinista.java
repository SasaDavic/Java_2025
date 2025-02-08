package d06_09_2022_zadatak2;

public class Alpinista extends Planinar {
	
	private int brPoena;

	public Alpinista(int id, String punoIme, int brPoena) {
		super(id, punoIme);
		if (brPoena < 0) {
			throw new IllegalArgumentException("Broj poena ne moze biti negativna vrednost!");
		}
		this.brPoena = brPoena;
	}

	public int getBrPoena() {
		return brPoena;
	}

	public void setBrPoena(int brPoena) {
		this.brPoena = brPoena;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + this.id);
		System.out.println("Ime: " + this.punoIme + ", Broj poena: " + this.brPoena);
		
	}

	@Override
	public double clanarina() {
		return 1500 - this.brPoena * 50;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		return planina.getVisina() < 4000;
	}
	
}
