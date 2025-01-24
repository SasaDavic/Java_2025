package p23_08_2022_zadatak4;

public class ViberReakcija {
	public ViberReakcija(String emoji, ViberKorisnik reagovao) {
		super();
		this.emoji = emoji;
		this.reagovao = reagovao;
	}
		
		private String emoji; //sunglases, heart, smile, like ili sad
		private ViberKorisnik reagovao;
		public String getEmoji() {
			return emoji;
		}
		public void setEmoji(String emoji) {
			this.emoji = emoji;
		}
		public ViberKorisnik getReagovao() {
			return reagovao;
		}
		public void setReagovao(ViberKorisnik reagovao) {
			this.reagovao = reagovao;
		}
		
		
}
