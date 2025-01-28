package p25_08_2022_zadatak2;

public class Reakcija {
	
	public Reakcija(String tip, String korisnikReagovao) {
		this.tip = tip;
		this.korisnikReagovao = korisnikReagovao;
	}
	
	private String tip; //smajli, like, srce
	private String korisnikReagovao;
	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getKorisnikReagovao() {
		return korisnikReagovao;
	}
	public void setKorisnikReagovao(String korisnikReagovao) {
		this.korisnikReagovao = korisnikReagovao;
	}
	
	
}
