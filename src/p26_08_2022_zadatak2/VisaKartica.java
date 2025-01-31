package p26_08_2022_zadatak2;

public class VisaKartica extends PlatnaKartica{
	
	public VisaKartica(double novacDolari, String broj, int godinaIsteka, int mesecIsteka, String ovlascenoLice) {
			super(novacDolari, broj, godinaIsteka, mesecIsteka);
			this.ovlascenoLice = ovlascenoLice;
		}

	private String ovlascenoLice;

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}
	
	@Override
	public void izvrsiTransakciju(double isplata) {
		double provizija = isplata * 0.018;
		if (provizija < 4) {
			super.novacDolari -= (4 + isplata);
		} else {
			super.novacDolari -= (provizija + isplata);
		}
	}
	@Override
	public void stampaj() {
		System.out.print("Visa Card: ");
		super.stampaj();
	}
	
	
	
}
