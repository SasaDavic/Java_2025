package p26_08_2022_zadatak1;

public class Profesor extends Osoba {
	
	public Profesor(String punoIme, String jmbg, String nazivPredmeta, double iznosPlate) {
		super(punoIme, jmbg);
		this.nazivPredmeta = nazivPredmeta;
		this.iznosPlate = iznosPlate;
	}
	private String nazivPredmeta;
	private double iznosPlate;
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public double getIznosPlate() {
		return iznosPlate;
	}
	
	public void povecajPlatu(double procenatPovecanja) {
		this.iznosPlate *= (procenatPovecanja / 100) + 1;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Naziv predmeta: " + this.nazivPredmeta);
		System.out.println("Plata: " + this.iznosPlate);
	}

}
