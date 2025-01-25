package d23_08_2022_zadatak2;

public class Transakcija {
	
public Transakcija(int id, Racun primalac, Racun uplatilac) {
		super();
		this.id = id;
		this.primalac = primalac;
		this.uplatilac = uplatilac;
	}

	private int id;
	private Racun primalac;
	private Racun uplatilac;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Racun getPrimalac() {
		return primalac;
	}
	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}
	public Racun getUplatilac() {
		return uplatilac;
	}
	public void setUplatilac(Racun uplatilac) {
		this.uplatilac = uplatilac;
	}
	
	private double provizijaTransakcije(double iznos) {
		if (iznos < 4500) {
			return 45;
		} else {
			return iznos * 0.01;
		}
	}
	
	public void izvrsiTransakciju(double iznos) {
		double plati = iznos + provizijaTransakcije(iznos);
		if (this.uplatilac.getStanje() - plati > 0) {
			this.uplatilac.promenaStanja(-1*plati);
			this.primalac.promenaStanja(iznos);
		} else {
			System.out.println(uplatilac.getPunoImeVlasnika() + " nema dovoljno stanja na racunu!");
		}
	}

	public void stampajTransakciju() {
		System.out.println(this.id);
		System.out.print("Racun sa: ");
		this.uplatilac.stampajPodatke();
		System.out.print("Racun na: ");
		this.primalac.stampajPodatke();
	}

	
	
	
}
