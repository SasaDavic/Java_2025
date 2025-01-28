package p25_08_2022_zadatak3;

public class HistoryPage {
	
	public HistoryPage(String nazivStranice, String link, int satOtvaranjaStranice, int minOtvaranjaStranice) {
		super();
		this.nazivStranice = nazivStranice;
		this.link = link;
		this.satOtvaranjaStranice = satOtvaranjaStranice;
		this.minOtvaranjaStranice = minOtvaranjaStranice;
	}
	
	public HistoryPage(String nazivStranice, String link, int satOtvaranjaStranice, int minOtvaranjaStranice,
			String username, String password) {
		super();
		this.nazivStranice = nazivStranice;
		this.link = link;
		this.satOtvaranjaStranice = satOtvaranjaStranice;
		this.minOtvaranjaStranice = minOtvaranjaStranice;
		this.username = username;
		this.password = password;
	}
		
	private String nazivStranice;
	private String link;
	private int satOtvaranjaStranice;
	private int minOtvaranjaStranice;
	private String username;
	private String password;
	
	public String getNazivStranice() {
		return nazivStranice;
	}
	public void setNazivStranice(String nazivStranice) {
		this.nazivStranice = nazivStranice;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getSatOtvaranjaStranice() {
		return satOtvaranjaStranice;
	}
	public void setSatOtvaranjaStranice(int satOtvaranjaStranice) {
		this.satOtvaranjaStranice = satOtvaranjaStranice;
	}
	public int getMinOtvaranjaStranice() {
		return minOtvaranjaStranice;
	}
	public void setMinOtvaranjaStranice(int minOtvaranjaStranice) {
		this.minOtvaranjaStranice = minOtvaranjaStranice;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public void sacuvacKredencijale(String user, String pass) {
		this.password = pass;
		this.username = user;
	}
	
	public void obrisiKolacice() {
		this.password = null;
		this.username = null;
	}
	
	public void stampaj() {
		System.out.print(this.satOtvaranjaStranice + " : " + this.minOtvaranjaStranice + " - " +
								this.nazivStranice + "..." + this.link);
		if (this.username != null && this.password != null) {
			System.out.println("*");
		} else {
			System.out.println();
		}
	}
	
				
}
