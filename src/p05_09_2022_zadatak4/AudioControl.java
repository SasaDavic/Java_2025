package p05_09_2022_zadatak4;

public class AudioControl extends Control {
	
	public AudioControl(boolean pojacaj) {
		super();
		this.pojacaj = pojacaj;
	}

	private boolean pojacaj;

	public boolean getPojacaj() {
		return pojacaj;
	}

	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		if (this.pojacaj) {
			if (video.getJacinaZvuka() + 1 <= 100) {
				video.setJacinaZvuka(video.getJacinaZvuka() + 1);
			} else {
				video.setJacinaZvuka(100);
			}			
		} else {
			if (video.getJacinaZvuka() - 1 < 0) {
				video.setJacinaZvuka(0);
			} else {
				video.setJacinaZvuka(video.getJacinaZvuka() - 1);
			}
		}
		
	}
	
}
