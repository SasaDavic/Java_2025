package p05_09_2022_zadatak4;

public class VideoPlayer {
	
	public VideoPlayer() {
		super();
	}
	public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}
	private int duzinaVidea;
	private int trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea; //(144, 240, 360, 480, 720, 1080)
	
	public int getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}
	public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitetVidea() {
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void stampaj() {
		System.out.println("Duzina videa: " + this.duzinaVidea);
		System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
		System.out.println("Kavlitet videa: " + this.kvalitetVidea);
	}
	
	
	
	
}
