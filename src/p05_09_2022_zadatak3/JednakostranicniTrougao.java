package p05_09_2022_zadatak3;

public class JednakostranicniTrougao extends Figura {
	
public JednakostranicniTrougao(double a) {
		super();
		this.a = a;
	}

	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	@Override
	public double povrsina() {
		return (a * a) * 1.73205 / 4;
	}
	
	@Override
	public double obim() {
		return 3 * a;
	}
}
