package d06_09_2022_zadatak1;

public class SuperKartica {

	private String brKartice;
	private String punoImeVlasnika;
	private double popust;
	
	public SuperKartica() {
		super();
	}
	public SuperKartica(String brKartice, String punoImeVlasnika, double popust) {
		super();
		this.brKartice = brKartice;
		this.punoImeVlasnika = punoImeVlasnika;
		this.popust = popust;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}
	public String getPunoImeVlasnika() {
		return punoImeVlasnika;
	}
	public void setPunoImeVlasnika(String punoImeVlasnika) {
		this.punoImeVlasnika = punoImeVlasnika;
	}
	public double getPopust() {
		return popust;
	}
	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public void stampajKarticu() {
		System.out.println(this.brKartice + ", " + this.punoImeVlasnika);
		System.out.println("Popust " + this.popust);
	}
}
