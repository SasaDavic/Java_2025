package p23_08_2022_zadatak1;

public class ZoomCall {
	
	public ZoomCall(String link, String password, Korisnik host, Korisnik guest) {
		super();
		this.link = link;
		this.password = password;
		this.host = host;
		this.guest = guest;
	}
	private String link;
	private String password;
	private Korisnik host;
	private Korisnik guest;
	
	public Korisnik getGuest() {
		return guest;
	}
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLink() {
		return link;
	}
	public String getPassword() {
		return password;
	}
	public Korisnik getHost() {
		return host;
	}
	public void pokreniPoziv() {
		System.out.println("Zoom Call: " + this.link);
		System.out.println("Password: " + this.password);
		System.out.print("Host: ");
		this.host.print();
		System.out.print("Guest: ");
		this.guest.print();
		System.out.println("Maksimalno trajanje poziva je " + host.maxDuzinaPoziva() + " min.");
		
	}
	
	
	
}
