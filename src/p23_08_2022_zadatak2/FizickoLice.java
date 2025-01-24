package p23_08_2022_zadatak2;

public class FizickoLice {

	public FizickoLice(String punoIme, int brLicneKarte, String jmbg, boolean vecKupovao) {
		super();
		this.punoIme = punoIme;
		this.brLicneKarte = brLicneKarte;
		this.jmbg = jmbg;
		this.vecKupovao = vecKupovao;
	}

	private String punoIme;
	private int brLicneKarte;
	private String jmbg;
	
	private boolean vecKupovao;

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public int getBrLicneKarte() {
		return brLicneKarte;
	}

	public void setBrLicneKarte(int brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
	}

	public boolean isVecKupovao() {
		return vecKupovao;
	}

	public void setVecKupovao(boolean vecKupovao) {
		this.vecKupovao = vecKupovao;
	}

	public String getJmbg() {
		return jmbg;
	}
	
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.brLicneKarte);
	}

	
}
