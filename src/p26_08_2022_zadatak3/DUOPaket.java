package p26_08_2022_zadatak3;

public class DUOPaket extends Paket {

	public DUOPaket(String imeKorisnika, double cena, int ugovornaObaveza, String uredjaj) {
		super("EON FULL DUO", imeKorisnika, cena, ugovornaObaveza, 250, 100);
		this.uredjajUzPaket = uredjaj;
	}
	
	private String uredjajUzPaket; //fiksni/mobilni/tablet/laptop
	
	@Override
	public int brMeseci1Dinar() {
		return 6;
	}
	
	public void povecazBrzinuDownload(int uvecanje) {
		super.downloadSpeed += uvecanje;
	}
	
	public void stampaj() {
		super.stampaj();
		System.out.println(brMeseci1Dinar() + " meseca po 1 din.");
		System.out.println("Besplatan uredjaj: " + this.uredjajUzPaket);
	}

	
	
	
	
	
}
