package d23_08_2022_zadatak1;

public class ZeleniKarton {
	public ZeleniKarton(String punoImeStudenta, int brIndexa, String nazivPredmeta, String imeProfesora, int ocena) {
		super();
		this.punoImeStudenta = punoImeStudenta;
		this.brIndexa = brIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}

	private String punoImeStudenta;
	private int brIndexa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;
	public String getPunoImeStudenta() {
		return punoImeStudenta;
	}
	public void setPunoImeStudenta(String punoImeStudenta) {
		this.punoImeStudenta = punoImeStudenta;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getImeProfesora() {
		return imeProfesora;
	}
	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	public boolean polozen() {
		return this.ocena > 5 ? true : false;
	}
	
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.punoImeStudenta + ", " + this.brIndexa);
		System.out.println("Profesor: " + this.imeProfesora);
	}
	
	
}
