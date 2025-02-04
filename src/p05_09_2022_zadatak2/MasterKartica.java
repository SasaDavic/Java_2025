package p05_09_2022_zadatak2;

public class MasterKartica extends PlatnaKartica{

	public MasterKartica(double sumaDolari, String broj, int godIsteka, int mesecIsteka) {
		super(sumaDolari, broj, godIsteka, mesecIsteka);
	}

	@Override
	public void izvrsiTransakciju(double suma) {
		this.sumaDolari -= (suma * 1.015);		
	}

	@Override
	public void stampaj() {
		System.out.println("Master Card: " + this.mesecIsteka + "/" + this.godIsteka + ", " + this.broj
				+ ", $" + this.sumaDolari);
	}
	
	public void naplatiOdrzavanje() {
		this.sumaDolari -= 2;
	}
	
	
}
