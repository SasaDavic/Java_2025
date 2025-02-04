package p05_09_2022_zadatak1;

public abstract class Student {
	
	public Student(String punoIme, int brIndexa, int godStudija) {
		super();
		this.punoIme = punoIme;
		this.brIndexa = brIndexa;
		this.godStudija = godStudija;
	}
	protected String punoIme;
	protected int brIndexa;
	protected int godStudija;
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	
	public abstract double cenaSkolarine();
	
	public abstract boolean naBudzetu();
	
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.brIndexa + ", " + this.godStudija);
		System.out.print("Finansiranje: ");
		if (naBudzetu() == true) {
			System.out.println("budzet");
		} else {
			System.out.println("samofinansirajuci");
		}
		System.out.println("Cena skolarine: " + cenaSkolarine());
	}
	

}
