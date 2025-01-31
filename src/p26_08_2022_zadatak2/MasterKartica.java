package p26_08_2022_zadatak2;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(double novacDolari, String broj, int godinaIsteka, int mesecIsteka) {
		super(novacDolari, broj, godinaIsteka, mesecIsteka);
	}

	@Override
	public void izvrsiTransakciju(double isplata) {
		double provizija = isplata * 0.015;
		super.izvrsiTransakciju(isplata + provizija);
	}
	
	public void naplatiOdrzavanje() {
		super.novacDolari -= 2;
	}
	
	@Override
	public void stampaj() {
		System.out.print("Master Card: ");
		super.stampaj();
	}
	
}
