package p26_08_2022_zadatak1;

public class Student extends Osoba {
	
	public Student(String punoIme, String jmbg, int brIndexa, int dugSkolarina) {
		super(punoIme, jmbg);
		this.brIndexa = brIndexa;
		this.dugSkolarina = dugSkolarina;
	}
	private int brIndexa;
	private int dugSkolarina;
	
	public void uplatiSkolarinu(int uplata) {
		this.dugSkolarina -= uplata;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj indexa: " + this.brIndexa);
		System.out.println("Dug za skolarinu: " + this.dugSkolarina);
	}

}
