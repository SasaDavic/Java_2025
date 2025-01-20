package p19_08_2022_zadatak2;

public class Radnik {
	
	private String jmbg;
	private String punoIme;
	private int brDece;
	private int stepenSS;
	private double godRadnogStaza;
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Radnik(String jmbg, String punoIme, int brDece, int stepenSS, double godRadnogStaza) {
		this.jmbg = jmbg;
		this.punoIme = punoIme;
		this.brDece = brDece;
		this.stepenSS = stepenSS;
		this.godRadnogStaza = godRadnogStaza;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public String getJmbg() {
		return this.jmbg;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public int getBrDece() {
		return brDece;
	}

	public void setBrDece(int brDece) {
		this.brDece = brDece;
	}

	public int getStepenSS() {
		return stepenSS;
	}

	public void setStepenSS(int stepenSS) {
		this.stepenSS = stepenSS;
	}

	public double getGodRadnogStaza() {
		return godRadnogStaza;
	}

	public void setGodRadnogStaza(double godRadnogStaza) {
		this.godRadnogStaza = godRadnogStaza;
	}
	
	public double minuliRad() {
			if(this.godRadnogStaza < 10) {
				return 0.05;
			} else if (this.godRadnogStaza < 20) {
				return 0.075;
			} else {
				return 0.1;
			}
		}
	
	public double koeficijentSlozenosti() {
		if (this.stepenSS == 1) {
			return 1.03;
		} else if (this.stepenSS == 2) {
			return 1.65;
		} else if (this.stepenSS == 3) {
			return 2;
		} else if (this.stepenSS == 4) {
			return 2.27;
		} else if (this.stepenSS == 5) {
			return 2.88;
		} else if (this.stepenSS == 6) {
			return 3.09;
		} else if (this.stepenSS == 7) {
			return 3.40;
		} else if (this.stepenSS == 8) {
			return 4.12;
		}
		return 0;
	}
	
	public double plata() {
		double p = 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
		return p;
	}

	public boolean kreditnoSposoban() {
		if (plata() > 50000) {
			return true;
		}
		return false;
	}
	
	public void stampaj() {
		System.out.println("Radnik: " + this.punoIme);
		System.out.println("JMBG: " + this.jmbg);
		System.out.println("Broj dece: " + this.brDece);
		System.out.println("Stepen strucne spreme: " + this.stepenSS);
		System.out.println("Godine radnog staza: " + this.godRadnogStaza);
		System.out.println("Plata: " + plata());
		if (kreditnoSposoban() == true) {
			System.out.println("Kreditno je sposoban!");
		} else {
			System.out.println("Nije kreditno sposoban!");
		}
	}
		
	
}
