package d22_08_2022_zadatak2;

public class Vaga {
	
	public Vaga() {
		super();
	}
	private String mernaJedinica; //kg, lb
	private Proizvod proizvod;
	
	
	public String getMernaJedinica() {
		return mernaJedinica;
	}
	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double sracunajCenu(double tezinaProizvoda) {
		if (this.mernaJedinica.equals("kg")) {
			return tezinaProizvoda * this.proizvod.getCenaKg();
		} else if (this.mernaJedinica.equals("lb")) {
			return tezinaProizvoda * this.proizvod.getCenaLb();
		}
		return 0;
	}
	
	public void stampaj(double tezinaProizvoda) {
		this.proizvod.stampaj();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + " din./kg x " + tezinaProizvoda + " kg");
			System.out.println("Ukupno: " + sracunajCenu(tezinaProizvoda));
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(this.proizvod.getCenaLb() + " din./lb x " + tezinaProizvoda + " lb");
			System.out.println("Ukupno: " + sracunajCenu(tezinaProizvoda));
		}
		
	}
	
}
