package p22_08_2022_zadatak4;

public class Video {
	
	public Video(String id, String naziv, int duzinaUSekundama) {
		this.id = id;
		this.naziv = naziv;
		this.duzinaUSekundama = duzinaUSekundama;
	}

	private String id;
	private String naziv;
	private int duzinaUSekundama;
	private int brojLikova;
	private int brojDisLikova;
	private int brojPregleda;
	
	
	
	
	public String getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getDuzinaUSekundama() {
		return duzinaUSekundama;
	}
	public int getBrojLikova() {
		return brojLikova;
	}
	public int getBrojDisLikova() {
		return brojDisLikova;
	}
	public int getBrojPregleda() {
		return brojPregleda;
	}
	
	
	public void like() {
		this.brojLikova++;
	}
	public void dislike() {
		this.brojDisLikova++;
	}
	public void view() {
		this.brojPregleda++;
	}
	
	public void stampaj() {
		System.out.println(this.naziv);
		System.out.println("Likes " + this.brojLikova + " | Dislikes " + this.brojDisLikova);
		System.out.println(this.brojPregleda + " Pregleda");
	}
	
	
}
