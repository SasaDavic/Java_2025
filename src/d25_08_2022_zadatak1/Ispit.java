package d25_08_2022_zadatak1;

public class Ispit {
	
	public Ispit(String naziv, int ocena, String profesor) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.profesor = profesor;
	}
	private String naziv;
	private int ocena;
	private String profesor;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public boolean jePolozen() {
		return this.ocena > 5 ? true : false;
	}
	
	public void printIspit() {
		System.out.println(this.naziv + " - " + this.profesor + " - " + this.ocena);
	}

}
