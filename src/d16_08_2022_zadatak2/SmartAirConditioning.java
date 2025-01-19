package d16_08_2022_zadatak2;

public class SmartAirConditioning {
	
	public String marka;
	public int temperatura;
	public String mod; //greje, hladi
	
	public int potrosnjaEEHladi;
	public int potrosnjaEEGreje;
	
	
	public void stampaj() {
		System.out.println("Klima uredjaj marke " + this.marka + ", " + this.mod + ", na temperaturi od " + this.temperatura + " stepeni!");
	}
	
	public boolean jeNapoljuToplije(int spoljnaTemp) {
		if (spoljnaTemp >= this.temperatura) {
			return true;
		}
		return false;
	}
	
	public double mesecnaPotrosnjaKw() {
		if (this.mod.equals("greje")) {
			return 30 * 15 * this.potrosnjaEEGreje;
		} else if (this.mod.equals("hladi")) {
			return 30 * 15 * this.potrosnjaEEHladi;
		}
		return 0;
	}
	
	public double mesecnaPotrosnjaDin() {
		if (mesecnaPotrosnjaKw() <= 350) {
			return mesecnaPotrosnjaKw() * 6;
		} else {
			double x = 350 * 6;
			double y = (mesecnaPotrosnjaKw() - 350) * 9;
			return x + y;
		}
	}
	public void stamajPotrosnju() {
		System.out.println("Klima " + this.mod);
		System.out.println("Trosi mesecno " + this.mesecnaPotrosnjaKw() + " kW");
		System.out.println("To je " + this.mesecnaPotrosnjaDin() + " din.");
	}

}
