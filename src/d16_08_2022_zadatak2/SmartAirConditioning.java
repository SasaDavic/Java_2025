package d16_08_2022_zadatak2;

public class SmartAirConditioning {
	
	public String marka;
	public int temperatura;
	public String mod; //greje, hladi
	
	public void stampaj() {
		System.out.println("Klima uredjaj marke " + this.marka + ", " + this.mod + ", na temperaturi od " + this.temperatura + " stepeni!");
	}
	
	public boolean jeNapoljuToplije(int spoljnaTemp) {
		if (spoljnaTemp >= this.temperatura) {
			return true;
		}
		return false;
	}

}
