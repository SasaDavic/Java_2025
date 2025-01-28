package p25_08_2022_zadatak4;

import java.util.ArrayList;

public class InstagramPost {
	
	public InstagramPost(String opisPosta) {
		this.opisPosta = opisPosta;
	}

	private ArrayList<InstagramImage> slike = new ArrayList<InstagramImage>();
	private String opisPosta;
	
	public ArrayList<InstagramImage> getSlike() {
		return slike;
	}

	public void setSlike(ArrayList<InstagramImage> slike) {
		this.slike = slike;
	}

	public String getOpisPosta() {
		return opisPosta;
	}

	public void setOpisPosta(String opisPosta) {
		this.opisPosta = opisPosta;
	}

	public void dodajSliku(InstagramImage slika) {
		this.slike.add(slika);
	}
	
	
}
