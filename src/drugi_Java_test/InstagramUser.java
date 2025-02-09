package drugi_Java_test;

public class InstagramUser {
	
	private String username;
	private String ime;
	private String prezime;
	
	public InstagramUser(String username) {
		super();
		this.username = username;
	}

	public InstagramUser(String username, String ime, String prezime) {
		super();
		this.username = username;
		this.ime = ime;
		this.prezime = prezime;
	}

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

	public String getUsername() {
		return username;
	}
	
	public void print() {
		System.out.println("@" + this.username + "\t" + this.ime + " " + this.prezime);
	}

	public String profilLink() {
		return "https://www.instagram.com/" + this.username + "/";
	}
	
}
