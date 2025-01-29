package d25_08_2022_zadatak2;

import java.util.ArrayList;

public class Kombinacija {
	
	public Kombinacija(String id, int br1, int br2, int br3, int br4, int br5, int br6, int br7) {
		this.id = id;
		
		this.niz7broja.add(br1);
		this.niz7broja.add(br2);
		this.niz7broja.add(br3);
		this.niz7broja.add(br4);
		this.niz7broja.add(br5);
		this.niz7broja.add(br6);
		this.niz7broja.add(br7);		
	}
	
	private String id;
	private ArrayList<Integer> niz7broja = new ArrayList<Integer>();
	
	public String getId() {
		return id;
	}
	public int getBr1() {
		return niz7broja.get(0);
	}
	public int getBr2() {
		return niz7broja.get(1);
	}
	public int getBr3() {
		return niz7broja.get(2);
	}
	public int getBr4() {
		return niz7broja.get(3);
	}
	public int getBr5() {
		return niz7broja.get(4);
	}
	public int getBr6() {
		return niz7broja.get(5);
	}
	public int getBr7() {
		return niz7broja.get(6);
	}
	
	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		if ( this.getBr1() == k.getBr1() && this.getBr2() == k.getBr2() && this.getBr3() == k.getBr3() &&
				this.getBr4() == k.getBr4() && this.getBr5() == k.getBr5() && this.getBr6() == k.getBr6() &&
				this.getBr7() == k.getBr7()) {
			return true;
		}
		return false;
	}
	
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.print("Brojevi: ");
		for (int i = 0; i < this.niz7broja.size(); i++) {
			System.out.print(this.niz7broja.get(i) + ", ");
		}
		System.out.println();
	}
	
}
