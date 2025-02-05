package p05_09_2022_zadatak5;

public class IcePoint extends Proizvod {
	
	public IcePoint() {
		super();
	}
	public IcePoint(String tipSladoleda, boolean mali) {
		super();
		this.tipSladoleda = tipSladoleda;
		this.mali = mali;
	}
	
	private String tipSladoleda;
	private boolean mali;
	
	public String getTipSladoleda() {
		return tipSladoleda;
	}
	public void setTipSladoleda(String tipSladoleda) {
		this.tipSladoleda = tipSladoleda;
	}
	public boolean isMali() {
		return mali;
	}
	public void setMali(boolean mali) {
		this.mali = mali;
	}
	
	@Override
	public void stampaj() {
		System.out.println(">> Ice point <<");
		System.out.println("Dodaci: ");
		for (int i = 0; i < dodaci.size(); i++) {
			System.out.print(i + 1 + ". ");
			dodaci.get(i).stampaj();
		}
		if (this.mali) {
			System.out.println("Mali ice point: 100");
		} else {
			System.out.println("Veliki ice point: 130");
		}
		System.out.println("Ukupno: " + this.racunajUkupnuCenu());
		
	}
	@Override
	public double racunajUkupnuCenu() {
		if (this.mali) {
			return this.cenaSvihDodataka() + 100;
		}
		return this.cenaSvihDodataka() + 130;
	}
	
	
	
	
}
