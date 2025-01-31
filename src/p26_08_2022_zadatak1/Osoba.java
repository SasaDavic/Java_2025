package p26_08_2022_zadatak1;

public class Osoba {

		public Osoba(String punoIme, String jmbg) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
	}
		
		protected String punoIme;
		protected String jmbg;
				
		public String getPunoIme() {
			return punoIme;
		}

		public String getJmbg() {
			return jmbg;
		}

		public void stampaj() {
			System.out.println(this.punoIme + ", " + this.jmbg);
		}
	
	
}
