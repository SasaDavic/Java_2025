package p06_09_2022_zadatak2;

public class Pica extends Proizvod{
	
	private double cenaPodloge;

	public Pica(double cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	public double getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(double cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

	@Override
	public double racunajUkupnuCenu() {
		return this.cenaSvihDodatakaProizvoda() + this.cenaPodloge;
	}

	@Override
	public void stampaj() {
		System.out.println(">> PIZZA <<");
		System.out.println("Podloga: " + this.cenaPodloge);
		System.out.println("- Dodaci: ");
		for (int i = 0; i < this.dodaci.size(); i++) {
			System.out.print(i + 1 + ". ");
			this.dodaci.get(i).stampaj();
		}
		System.out.println("----------------------------");
		System.out.println("Ukupno: " + this.racunajUkupnuCenu());
	}

}
