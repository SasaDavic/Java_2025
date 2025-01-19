package d18_08_2022_zadatak2;

public class FacebookPost {

	public String imeKorisnika;
	public String imeKorisnikaGdeJePost;
	public String textPosta;
	public int brLike;
	public int brShare;
	
	public void like() {
		this.brLike++;
	}
	public void dislike() {
		this.brLike--;
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
