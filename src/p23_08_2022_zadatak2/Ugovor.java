package p23_08_2022_zadatak2;

public class Ugovor {

	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cenaNekretnine, String adresaNekretnine) {
		super();
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cenaNekretnine = cenaNekretnine;
		this.adresaNekretnine = adresaNekretnine;
	}
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cenaNekretnine;
	private String adresaNekretnine;
	
	public double procenatProvizije() {
		if (this.kupac.isVecKupovao() == true) {
			return 0.02;
		} else {
			return 0.03;
		}
	}
	public double zaradaAgencije() {
		double x = 1000 + this.cenaNekretnine * procenatProvizije();
		return x;
	}
	public void stampajUgovor() {
		System.out.println("Dana " + this.datum + "god sklopljen je ugovor izmedju " + this.prodavac.getPunoIme() + " i " +
				this.kupac.getPunoIme() + " o kupovini nekretnine, \n" + this.adresaNekretnine + ", po ceni od " +
				this.cenaNekretnine + ",\npri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "
				+ this.zaradaAgencije());
	}
	
	
}
