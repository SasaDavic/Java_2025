package p22_08_2022_zadatak4;

public class YoutubePlayer {
	
	public YoutubePlayer() {
		this.jacinaZvuka = 75;
		this.kvalitet = 144;
		this.rezim = "mini player";
	}

	
	private Video video;
	private int kvalitet; //(moze da bude 144, 240, 360, 480, 720, 1080)
	private String rezim; //mini player , bioskopski rezim , preko celog ekrana
	private int jacinaZvuka;
	private int trenutnoVremeReprodukcije;
	
	
	public Video getVideo() {
		return video;
	}
	public int getKvalitet() {
		return kvalitet;
	}
	public String getRezim() {
		return rezim;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public int getTrenutnoVremeReprodukcije() {
		return trenutnoVremeReprodukcije;
	}
	
	public void ucitajVideo(Video v) {
		this.video = v;
		this.video.view();
		this.trenutnoVremeReprodukcije = 0;	
	}
	
	public void pojacaj() {
		this.jacinaZvuka += 10;
		if (this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}
	
	public void smanji() {
		this.jacinaZvuka -= 10;
		if (this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}
	
	public void postaviKvalitet(int brzinaInternetaMb) {
		if (brzinaInternetaMb < 2) {
			this.kvalitet = 144;
		} else if (brzinaInternetaMb < 4) {
			this.kvalitet = 240;
		} else if (brzinaInternetaMb < 6) {
			this.kvalitet = 360;
		} else if (brzinaInternetaMb < 8) {
			this.kvalitet = 720;
		} else {
			this.kvalitet = 1080;
		}
	}
	
	public void aktivirajMiniPlayerMod() {
		this.rezim = "mini player";
	}
	
	public void aktivirajBioskopskiMod() {
		this.rezim = "bioskopski rezim";
	}
	
	public void aktivirajPrekoCelogEkranaMod() {
		this.rezim = "preko celog ekrana";
	}
	
	public void premotajUnapred() {
		this.trenutnoVremeReprodukcije += 10;
		if (this.trenutnoVremeReprodukcije > this.video.getDuzinaUSekundama()) {
			this.trenutnoVremeReprodukcije = this.video.getDuzinaUSekundama();
		}
	}
	
	public void premotajUnazad() {
		this.trenutnoVremeReprodukcije -= 10;
		if (this.trenutnoVremeReprodukcije < 0) {
			this.trenutnoVremeReprodukcije = 0;
		}
	}
	
	public void iscrtajZvuk() {
		int x = this.jacinaZvuka / 10;
		if (this.jacinaZvuka == 0) {
			System.out.print("</");
		} else {
			System.out.print("<: ");
			for (int i = 0; i < x; i++) {
				System.out.print("|");
			}
		}
		System.out.println();
	}
	
	public void iscrtajRezim() {
		if (this.rezim.equals("mini player")) {
			System.out.println("[ ]");
		} else if (this.rezim.equals("bioskopski rezim")) {
			System.out.println("[ ..]");
		} else if (this.rezim.equals("preko celog ekrana")) {
			System.out.println("[||||]");
		}
	}
	
	public void iscrtajTrenutnoVreme() {
		int minutUkupnogVideo = this.video.getDuzinaUSekundama() / 60;
		int sekundUkupnogVidea = this.video.getDuzinaUSekundama() % 60;
		int minut = this.trenutnoVremeReprodukcije / 60;
		int sekund = this.trenutnoVremeReprodukcije % 60;
		System.out.println(minut + ":" + sekund + " / " + minutUkupnogVideo + ":" + sekundUkupnogVidea);
	}
	
	public void iscrtajTimeline() {
		int brZvezdica = this.trenutnoVremeReprodukcije * 100 / this.video.getDuzinaUSekundama();
		for (int i = 0; i < 100; i++) {
			if (i < brZvezdica) {
				System.out.print("*");
			} else {
				System.out.print(".");
			}
		}
		System.out.println();
	}
	
	public void iscitaj() {
		iscrtajTrenutnoVreme();
		System.out.print("Zvuk: ");
		iscrtajZvuk();
		System.out.print("Timeline: ");
		iscrtajTimeline();
		System.out.println("Kvalitet: " + this.kvalitet + "p");
		System.out.print("Rezim: ");
		iscrtajRezim();
		this.video.stampaj();
		System.out.println("Seruj: " + sherujVideo());
	}
	
	public String sherujVideo() {
		return "https://youtu.be/" + this.video.getId();
	}

	
	
	
	
	
}
