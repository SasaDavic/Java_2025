package drugi_Java_test;

public class InstagramLocationAddOn extends InstagramAddOn {
	
	private String nazivLokacija;

	public InstagramLocationAddOn(int id, int xKoordinata, int yKoordinata, int sirinaAddOn, int visinaAddOn,
			String nazivLokacija) {
		super(id, xKoordinata, yKoordinata, sirinaAddOn, visinaAddOn);
		if (sirinaAddOn < minSirinaDodatka()) {
			throw new IllegalArgumentException("Minimalna sirina dodatka je " + minSirinaDodatka());
		}
		if (visinaAddOn < minVisinaDodatka()) {
			throw new IllegalArgumentException("Minimalna visina dodatka je " + minVisinaDodatka());
		}
		this.nazivLokacija = nazivLokacija;
	}

	public String getNazivLokacija() {
		return nazivLokacija;
	}

	public void setNazivLokacija(String nazivLokacija) {
		this.nazivLokacija = nazivLokacija;
	}

	@Override
	public int minSirinaDodatka() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int minVisinaDodatka() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void stampaj() {
		System.out.println("[" + this.xKoordinata + ", " + this.yKoordinata + "] (" + this.visinaAddOn + ", " 
				+ this.sirinaAddOn + ") L " + this.nazivLokacija);
	}
	

}
