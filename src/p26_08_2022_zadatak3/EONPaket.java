package p26_08_2022_zadatak3;

public class EONPaket extends Paket {

	public EONPaket(String imeKorisnika, double cena, int ugovornaObaveza) {
		super("EON LIGHT DUO", imeKorisnika, cena, ugovornaObaveza, 150	, 75);
	}

	@Override
	public int brMeseci1Dinar() {
		return 3;
	}
	
	public void stampaj() {
		super.stampaj();
		System.out.println(brMeseci1Dinar() + " meseca po 1 din.");
	}

	
	
	
	
}
