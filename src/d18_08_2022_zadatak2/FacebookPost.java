package d18_08_2022_zadatak2;

public class FacebookPost {

	private String imeKorisnika;
	private String imeKorisnikaGdeJePost;
	private String textPosta;
	private int brLike;
	private int brShare;
	
	public FacebookPost() {
	}
	public FacebookPost(String imeKorisnika, String imeKorisnikaGdeJePost, String textPosta) {
		this.imeKorisnika = imeKorisnika;
		this.imeKorisnikaGdeJePost = imeKorisnikaGdeJePost;
		this.textPosta = textPosta;
	}
	
	public void like() {
		this.brLike++;
	}
	public void dislike() {
		this.brLike--;
		if (this.brLike < 0) {
			this.brLike = 0;
		}
	}	
	public void share() {
		this.brShare++;		
	}
	
	
	public void print() {
		System.out.println(this.imeKorisnika + " >>> " + this.imeKorisnikaGdeJePost);
		System.out.println(this.textPosta);
		System.out.println("Likes " + this.brLike + " | Shares " + this.brShare);
	}
	
}
