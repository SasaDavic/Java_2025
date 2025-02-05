package p05_09_2022_zadatak5;

public class Pica extends Proizvod {

	
	public double getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(double cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

	public Pica() {
		super();
	}

	public Pica(double cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	private double cenaPodloge;

	@Override
	public void stampaj() {
		System.out.println(">> PIZZA <<");
		System.out.println("Dodaci: ");
		for (int i = 0; i < dodaci.size(); i++) {
			System.out.print(i + 1 + ". ");
			dodaci.get(i).stampaj();
		}
		System.out.println("Cena podloge: " + this.cenaPodloge);
		System.out.println("Ukupno: " + this.racunajUkupnuCenu());
	}

	@Override
	public double racunajUkupnuCenu() {		
		return this.cenaSvihDodataka() + this.cenaPodloge;
	}
	
}
