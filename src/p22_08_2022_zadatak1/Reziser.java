package p22_08_2022_zadatak1;

public class Reziser {
	


	private String ime;
	private int starost;
	
	public Reziser(String ime, int starost) {
		this.ime = ime;
		this.starost = starost;
	}

	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public int getStarost() {
		return starost;
	}


	public void setStarost(int starost) {
		this.starost = starost;
	}


	
	
	public void print() {
		System.out.println(this.ime + ", " + this.starost + "god.");
	}
	
}
