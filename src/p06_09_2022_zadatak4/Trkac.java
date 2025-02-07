package p06_09_2022_zadatak4;

public class Trkac extends Atleticar {
	
	public Trkac(String punoIme, double rezultat) {
		super(punoIme, rezultat);
	}

	@Override
	public boolean boljiRezultatOd(Atleticar atleticar) {
		return this.rezultat < atleticar.getRezultat();
	}
	
	
}
