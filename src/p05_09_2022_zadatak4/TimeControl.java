package p05_09_2022_zadatak4;

public class TimeControl extends Control {

	public TimeControl(boolean premotajUnapred) {
		super();
		this.premotajUnapred = premotajUnapred;
	}

	private boolean premotajUnapred;

	public boolean isPremotajUnapred() {
		return premotajUnapred;
	}

	public void setPremotajUnapred(boolean premotajUnapred) {
		this.premotajUnapred = premotajUnapred;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		if (this.premotajUnapred) {
			if (video.getTrenutnoVremeVidea() + 15 <= video.getDuzinaVidea()) {
				video.setTrenutnoVremeVidea(video.getTrenutnoVremeVidea() + 15);
			} else {
				video.setTrenutnoVremeVidea(video.getDuzinaVidea());
			}
			
		} else {
			if (video.getTrenutnoVremeVidea() - 15 >= 0) {
				video.setTrenutnoVremeVidea(video.getTrenutnoVremeVidea() - 15);
			} else {
				video.setTrenutnoVremeVidea(0);
			}
			
		}
		
	}
	
	
	
}
