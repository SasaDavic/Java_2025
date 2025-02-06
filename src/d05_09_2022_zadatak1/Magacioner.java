package d05_09_2022_zadatak1;

public class Magacioner extends Radnik {

	public Magacioner(String punoIme) {
		super(punoIme);
	}

	private double prosecnaPlata() {
		double suma = 0;
		int brojac = 0;
		for (int i = 0; i < this.nizSektora.size(); i++) {
			suma += this.nizSektora.get(i).getPlata();
			brojac++;
		}
		return suma / brojac * 0.5;
	}

	@Override
	public double plata() {
		return prosecnaPlata() * this.nizSektora.size();
	}
}
