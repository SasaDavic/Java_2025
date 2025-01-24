package p23_08_2022_zadatak4;

public class ViberKorisnik {
	
		public ViberKorisnik() {
		super();
	}
		public ViberKorisnik(String punoIme, String brojTelefona, boolean aktivan) {
		super();
		this.punoIme = punoIme;
		this.brojTelefona = brojTelefona;
		this.aktivan = aktivan;
	}
		private String punoIme;
		private String brojTelefona;
		private boolean aktivan;
		public String getPunoIme() {
			return punoIme;
		}
		public void setPunoIme(String punoIme) {
			this.punoIme = punoIme;
		}
		public String getBrojTelefona() {
			return brojTelefona;
		}
		public void setBrojTelefona(String brojTelefona) {
			this.brojTelefona = brojTelefona;
		}
		public boolean isAktivan() {
			return aktivan;
		}
		public void setAktivan(boolean aktivan) {
			this.aktivan = aktivan;
		}
		
}
