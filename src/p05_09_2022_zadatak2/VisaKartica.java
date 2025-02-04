package p05_09_2022_zadatak2;

public class VisaKartica extends PlatnaKartica {
	
	public VisaKartica(double sumaDolari, String broj, int godIsteka, int mesecIsteka, String ovlascenoLice) {
			super(sumaDolari, broj, godIsteka, mesecIsteka);
			this.ovlascenoLice = ovlascenoLice;
		}

	/*
 
  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. 
  Najmanja provizija moze biti $4.
  implementira metodu koja stampa podatke o kartici u formatu:
	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
 */
	private String ovlascenoLice;

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	
	private double racunajProviziju(double suma) {
		if (suma * 0.018 < 4) {
			return 4;
		} else {
			return suma * 0.018;
		}
	}
	
	
	@Override
	public void izvrsiTransakciju(double suma) {
		this.sumaDolari -= (suma + this.racunajProviziju(suma));
		
	}

	@Override
	public void stampaj() {
		System.out.println("Visa Card: " + this.broj + ", " + this.mesecIsteka + "/" + this.godIsteka 
				+ ", $" + this.sumaDolari);
	}
	
	
	
	
	
	
	
	
}
