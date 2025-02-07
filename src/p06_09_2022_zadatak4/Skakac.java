package p06_09_2022_zadatak4;

public class Skakac extends Atleticar{

	public Skakac(String punoIme, double rezultat) {
		super(punoIme, rezultat);
	}

	@Override
	public boolean boljiRezultatOd(Atleticar atleticar) {
		return this.rezultat > atleticar.getRezultat();
	}

}
