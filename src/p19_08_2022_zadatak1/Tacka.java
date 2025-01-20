package p19_08_2022_zadatak1;

public class Tacka {
	
	
	private int xKoordinata;
	private int yKoordinata;
	
	public Tacka() {
	}
	public Tacka(int x, int y) {
		this.xKoordinata = x;
		this.yKoordinata = y;
	}
	
	public void setyKoordinata(int yKoordinata) {
		this.yKoordinata = yKoordinata;
	}
	public int getyKoordinata() {
		return this.getyKoordinata();
	}
	
	public int getxKoordinata() {
		return this.xKoordinata;
	}
	public void setxKoordinata(int xKoordinata) {
		this.xKoordinata = xKoordinata;
	}
	public void stampaj() {
		System.out.println("x: " + this.xKoordinata);
		System.out.println("y: " + this.yKoordinata);
		System.out.println("( " + this.xKoordinata + ", " + this.yKoordinata + ")");
		
	}

}
