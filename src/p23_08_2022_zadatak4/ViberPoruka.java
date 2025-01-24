package p23_08_2022_zadatak4;

public class ViberPoruka {
				
		public ViberPoruka(String text, String vreme, ViberKorisnik poslao, ViberKorisnik primio) {
		super();
		this.text = text;
		this.vreme = vreme;
		this.poslao = poslao;
		this.primio = primio;
	}
		private String text;
		private String vreme;
		private ViberKorisnik poslao;
		private ViberKorisnik primio;
		private ViberReakcija reakcija;
		
		public ViberReakcija getReakcija() {
			return reakcija;
		}
		public void setReakcija(ViberReakcija reakcija) {
			this.reakcija = reakcija;
		}
		public String getText() {
			return text;
		}
		public String getVreme() {
			return vreme;
		}
		public ViberKorisnik getPoslao() {
			return poslao;
		}
		public ViberKorisnik getPrimio() {
			return primio;
		}
		
		
		public void stampaj() {
			if (this.poslao.isAktivan() == true) {
				System.out.println("From: " + this.poslao.getPunoIme() + " * Active Now - at " + this.vreme);
			} else {
				System.out.println("From: " + this.poslao.getPunoIme() + " * Not Active - at " + this.vreme);
			}
			System.out.println("To: " + this.primio.getPunoIme());
			System.out.print(this.text);
			if (this.reakcija != null) {
				System.out.println(" : " + this.reakcija.getEmoji() + " from " + this.reakcija.getReagovao().getPunoIme());
			} else {
				System.out.println();
			}
			
		}
		
		
		
}
