package drugi_Java_test;

public abstract class InstagramAddOn {
	
	protected int id;
	protected int xKoordinata;
	protected int yKoordinata;
	protected int sirinaAddOn;
	protected int visinaAddOn;
	
	public int getId() {
		return id;
	}
	public int getxKoordinata() {
		return xKoordinata;
	}
	public int getyKoordinata() {
		return yKoordinata;
	}
	public int getSirinaAddOn() {
		return sirinaAddOn;
	}
	public int getVisinaAddOn() {
		return visinaAddOn;
	}
	
	public InstagramAddOn(int id, int xKoordinata, int yKoordinata, int sirinaAddOn, int visinaAddOn) {
		super();
		if (sirinaAddOn < 0) {
			throw new IllegalArgumentException("Sirina ne moze biti negativna vrednost!");
		}
		if (visinaAddOn < 0) {
			throw new IllegalArgumentException("Visina ne moze biti negativna vrednost!");
		}
		this.id = id;
		this.xKoordinata = xKoordinata;
		this.yKoordinata = yKoordinata;
		this.sirinaAddOn = sirinaAddOn;
		this.visinaAddOn = visinaAddOn;
	}
	
	public abstract int minSirinaDodatka();
	public abstract int minVisinaDodatka();
	public abstract void stampaj();
	
	public void povecajDimenzije(int povecajVisinuZa, int povecajSirinuZa) {
		this.visinaAddOn += povecajVisinuZa;
		this.sirinaAddOn += povecajSirinuZa;
	}
	
	public void smanjiDimenzije(int smanjiVisinuZa, int smanjiSirinuZa) {
		if (this.visinaAddOn - smanjiVisinuZa < minVisinaDodatka() || this.sirinaAddOn - smanjiSirinuZa < minSirinaDodatka()) {
			System.out.println("Duzina i visina ne mogu da spadnu ispod minimalnih vrednosti dodatka");
		} else {
			this.visinaAddOn -= smanjiVisinuZa;
			this.sirinaAddOn -= smanjiSirinuZa;
		}
	}

}
