package p22_08_2022_zadatak2;

public class FacebookPost {
	
	private String opis;
	private Korisnik kreiraoPost;

	public FacebookPost(String opis, Korisnik kreiraoPost) {
		this.opis = opis;
		this.kreiraoPost = kreiraoPost;
	}
	
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Korisnik getKreiraoPost() {
		return kreiraoPost;
	}
	public void setKreiraoPost(Korisnik kreiraoPost) {
		this.kreiraoPost = kreiraoPost;
	}
	
	public void printPost() {
		this.kreiraoPost.print();
		System.out.println(this.opis);
	}
	
	
}
