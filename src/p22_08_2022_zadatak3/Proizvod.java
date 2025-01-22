package p22_08_2022_zadatak3;

public class Proizvod {
	
	private String naziv;
	private Kupac kupac;
	private double cenaIzrade;
	
	public Proizvod() {
	}
	public Proizvod(String naziv, Kupac kupac, double cenaIzrade) {
		this.naziv = naziv;
		this.kupac = kupac;
		this.cenaIzrade = cenaIzrade;
	}
	
	public double cenaProizvoda() {
		double x = this.cenaIzrade * 1.9 * (100 - this.kupac.getKarta().getPopust()) * 0.01;
		return x;
	}
	
	public void stampaj() {
		System.out.println(this.naziv + " - " + cenaProizvoda() + " din.");
		kupac.print();
	}
	
	
}
