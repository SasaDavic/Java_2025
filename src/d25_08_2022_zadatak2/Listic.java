package d25_08_2022_zadatak2;

import java.util.ArrayList;

public class Listic {

	
	private ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>(); // max 7
	
	public void dodajKombinaciju(Kombinacija kom) {
		this.kombinacije.add(kom);
	}
	public boolean jeDobitna(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			if (this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija) == true) {
				return true;
			}
		}
		return false;
	}
	public void printListic(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			
			this.kombinacije.get(i).print();
			System.out.println();
		}
		if (this.jeDobitna(dobitnaKombinacija)) {
			System.out.println("Imate dobitnu kombinaciju!");
		} else {
			System.out.println("Zao nam je nemate dobitnu kombinaciju!");
		}
	}
}
