package d06_09_2022_zadatak2;

public class RekreativniPlaninar extends Planinar{
	
	private int tezinaOpremeKg;
	private String okrug;
	private double maxUsponBezOpreme;
	
	public RekreativniPlaninar(int id, String punoIme, int tezinaOpreme, String okrug, double maxUsponBezOpreme) {
		super(id, punoIme);
		if (tezinaOpreme < 0) {
			throw new IllegalArgumentException("Tezina opreme ne moze biti negativna vrednost!");
		}
		if (maxUsponBezOpreme < 0) {
			throw new IllegalArgumentException("Maksimalni uspon bez opreme ne moze biti negativna vrednost!");
		}
		this.tezinaOpremeKg = tezinaOpreme;
		this.okrug = okrug;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}
	
	

	public int getTezinaOpremeKg() {
		return tezinaOpremeKg;
	}



	public void setTezinaOpremeKg(int tezinaOpremeKg) {
		this.tezinaOpremeKg = tezinaOpremeKg;
	}



	public double getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}



	public void setMaxUsponBezOpreme(double maxUsponBezOpreme) {
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}



	public String getOkrug() {
		return okrug;
	}



	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + this.id);
		System.out.println("Ime: " + this.punoIme + ", Okrug: " + this.okrug);
		
	}

	@Override
	public double clanarina() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (this.maxUsponBezOpreme - 50 * this.tezinaOpremeKg > planina.getVisina()) {
			return true;
		}
		return false;
	}

}
