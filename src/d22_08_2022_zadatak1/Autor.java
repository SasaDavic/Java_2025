package d22_08_2022_zadatak1;

public class Autor {
	public Autor() {
		super();
	}
	public Autor(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
		
	private String ime;
	private String prezime;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void print() {
		System.out.println(this.ime + " " + this.prezime);
	}
	
	
	
}
