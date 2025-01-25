package d23_08_2022_zadatak3;

public class ElektricniSporet {
	
	public ElektricniSporet(String marka, int garancijaGod, int maxUkljucenihRingli, Ringla goreLevo, Ringla goreDesno,
			Ringla doleLevo, Ringla doleDesno) {
		super();
		this.marka = marka;
		this.garancijaGod = garancijaGod;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}
	
	private String marka;
	private int garancijaGod;
	private int maxUkljucenihRingli; //1. 2. 3. 4.
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;
	
	public String getMarka() {
		return marka;
	}
	public int getGarancijaGod() {
		return garancijaGod;
	}
	public int getMaxUkljucenihRingli() {
		return maxUkljucenihRingli;
	}
	public Ringla getGoreLevo() {
		return goreLevo;
	}
	public Ringla getGoreDesno() {
		return goreDesno;
	}
	public Ringla getDoleLevo() {
		return doleLevo;
	}
	public Ringla getDoleDesno() {
		return doleDesno;
	}
	
	public void pojacajRinglu(int pozicija) {
		if (pozicija == 1) {
			this.goreLevo.pojacajRinglu();
		} else if (pozicija == 2) {
			this.goreDesno.pojacajRinglu();
		} else if (pozicija == 3) {
			this.doleLevo.pojacajRinglu();
		} else if (pozicija == 4) {
			this.doleDesno.pojacajRinglu();
		}
		int brojac = 0;
		if (this.goreLevo.jeUkljucen() == true) {
			brojac++;
		}
		if (this.goreDesno.jeUkljucen() == true) {
			brojac++;
		}
		if (this.doleLevo.jeUkljucen() == true) {
			brojac++;
		}
		if (this.doleDesno.jeUkljucen() == true) {
			brojac++;
		}
		if (brojac > this.maxUkljucenihRingli) {
			iskluciRingle(pozicija);
		}
	}
	
	public void iskluciRingle(int iskljuciOsimPozicije) {
		if (iskljuciOsimPozicije == 1) {
			this.goreDesno.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		} else if (iskljuciOsimPozicije == 2) {
			this.goreLevo.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		} else if (iskljuciOsimPozicije == 3) {
			this.goreLevo.iskljuciRinglu();
			this.goreDesno.iskljuciRinglu();
			this.doleDesno.iskljuciRinglu();
		} else if (iskljuciOsimPozicije == 4) {
			this.goreLevo.iskljuciRinglu();
			this.goreDesno.iskljuciRinglu();
			this.doleLevo.iskljuciRinglu();
		}
	}
	
	public double potrosnjaEE(int vreme) {
		double x = 0;
		if (this.goreLevo.jeUkljucen() == true) {
			x += this.goreLevo.potrosnjaEE(vreme);
		}
		if (this.goreDesno.jeUkljucen() == true) {
			x += this.goreDesno.potrosnjaEE(vreme);
		}
		if (this.doleLevo.jeUkljucen() == true) {
			x += this.doleLevo.potrosnjaEE(vreme);
		}
		if (this.doleDesno.jeUkljucen() == true) {
			x += this.doleDesno.potrosnjaEE(vreme);
		}
		return x;
	}
	
	public void stampaj() {
		System.out.println("Sporet marke: " + this.marka + " - " + this.garancijaGod + " godina garancije.");
		System.out.println("Ringle: ");
		System.out.println("Gore levo:");
		this.goreLevo.stampaj();
		System.out.println("Gore desno:");
		this.goreDesno.stampaj();
		System.out.println("Dole levo:");
		this.doleLevo.stampaj();
		System.out.println("Dole desno:");
		this.doleDesno.stampaj();
	}

}
