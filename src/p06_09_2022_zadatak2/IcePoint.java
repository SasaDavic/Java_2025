package p06_09_2022_zadatak2;

public class IcePoint extends Proizvod {

	private String tip;
	private boolean maliIcePoint;
		
	public IcePoint(String tip, boolean maliIcePoint) {
		super();
		this.tip = tip;
		this.maliIcePoint = maliIcePoint;
	}
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public boolean isMaliIcePoint() {
		return maliIcePoint;
	}

	public void setMaliIcePoint(boolean maliIcePoint) {
		this.maliIcePoint = maliIcePoint;
	}

	@Override
	public double racunajUkupnuCenu() {
		double kornet;
		if (this.maliIcePoint) {
			kornet = 100;
		} else {
			kornet = 130;
		}
		return this.cenaSvihDodatakaProizvoda() + kornet;
	}
	@Override
	public void stampaj() {
		System.out.println(">> Ice point <<");
		System.out.println("Tip: " + this.tip);
		if (this.maliIcePoint) {
			System.out.println("Mali Ice Point!");
		} else {
			System.out.println("Veliki Ice Point!");
		}
		System.out.println("- Dodaci: ");
		for (int i = 0; i < this.dodaci.size(); i++) {
			System.out.print(i + 1 + ". ");
			this.dodaci.get(i).stampaj();
		}
		System.out.println("----------------------------");
		System.out.println("Ukupno: " + this.racunajUkupnuCenu());
	}
	
	
	
	
	
	
	
}
