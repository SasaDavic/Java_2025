package p05_09_2022_zadatak3;

public class Pravougaonik extends Figura {
	
public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	@Override
	public double povrsina() {
		return a * b;
	}
	@Override
	public double obim() {
		return 2 * (a + b);
	}
}
