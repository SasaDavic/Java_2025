package p06_09_2022_zadatak4;

import java.util.ArrayList;

public class Disciplina {
	
	private String ime;
	private String tip; //(Trkacka ili Skakacka)
	private ArrayList<Atleticar> nizAtleticara = new ArrayList<>();
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Disciplina(String ime, String tip) {
		super();
		this.ime = ime;
		this.tip = tip;
	}
	
	public void dodajAtleticaraUDisciplinu(Atleticar atleticar) {
		this.nizAtleticara.add(atleticar);
	}
	
	public void diskvalifikujAtleticara(String punoIme) {
		for (int i = 0; i < this.nizAtleticara.size(); i++) {
			if (this.nizAtleticara.get(i).getPunoIme().equals(punoIme)) {
				this.nizAtleticara.remove(i);
			}
		}
	}
	private Atleticar najboljiRezultat() {
		Atleticar x = this.nizAtleticara.get(0);
		for (int i = 0; i < this.nizAtleticara.size(); i++) {
			if (this.nizAtleticara.get(i).boljiRezultatOd(x)) {
					x = this.nizAtleticara.get(i);
			}
		}
		return x;
	}
	public void printPobednik() {
		this.najboljiRezultat().printAtleticar();
	}

}
