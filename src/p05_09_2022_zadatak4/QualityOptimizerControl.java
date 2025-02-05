package p05_09_2022_zadatak4;

public class QualityOptimizerControl extends Control {
	
	public double getBrzinaNeta() {
		return brzinaNeta;
	}

	public void setBrzinaNeta(double brzinaNeta) {
		this.brzinaNeta = brzinaNeta;
	}

	public QualityOptimizerControl(double brzinaNeta) {
		super();
		this.brzinaNeta = brzinaNeta;
	}

	private double brzinaNeta; //10mb/s, 20mb/s, 7.9mb/s

	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		double x = this.brzinaNeta * 10.1;
		if (x <= 144) {
			video.setKvalitetVidea(144);
		} else if (x <= 240) {
			video.setKvalitetVidea(240);
		} else if (x <= 360) {
			video.setKvalitetVidea(360);
		} else if (x <= 480) {
			video.setKvalitetVidea(480);
		} else if (x <= 720) {
			video.setKvalitetVidea(720);
		} else {
			video.setKvalitetVidea(1080);
		}
		
	}
	
	
}
