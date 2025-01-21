package Skocko;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SkockoGame {
	private int brojOdigranihPokusaja;
	
	private String trazenaKombinacijaPolje1;
	private String trazenaKombinacijaPolje2;
	private String trazenaKombinacijaPolje3;
	private String trazenaKombinacijaPolje4; //preko konstruktora
	
	private String odigranoPolje1;
	private String odigranoPolje2;
	private String odigranoPolje3;
	private String odigranoPolje4; //kroz metodu
	
	public void novaIgra(String polje1, String polje2, String polje3, String polje4) {
		this.trazenaKombinacijaPolje1 = polje1;
		this.trazenaKombinacijaPolje2 = polje2;
		this.trazenaKombinacijaPolje3 = polje3;
		this.trazenaKombinacijaPolje4 = polje4;
		this.brojOdigranihPokusaja = 0;
		this.odigranoPolje1 = "";
		this.odigranoPolje2 = "";
		this.odigranoPolje3 = "";
		this.odigranoPolje4 = "";
	}
	
	public boolean isGameOver() {
		if (this.brojOdigranihPokusaja == 6) {
			System.out.println("Igra je gotova!");
			return true;
		} else if (isWinner() != true) {
				int x = 6 - this.brojOdigranihPokusaja;
				System.out.println("Imate jos " + x + " pokusaja.");
		}		
		return false;
	}
	
	public boolean isWinner() {
		if (this.trazenaKombinacijaPolje1.equals(odigranoPolje1) && this.trazenaKombinacijaPolje2.equals(odigranoPolje2) && 
				this.trazenaKombinacijaPolje3.equals(odigranoPolje3) && this.trazenaKombinacijaPolje4.equals(odigranoPolje4)) {
			return true;
		}
		return false;
	}
	
	public void odigrajKombinaciju(String p1, String p2, String p3, String p4) {
		this.odigranoPolje1 = p1;
		this.odigranoPolje2 = p2;
		this.odigranoPolje3 = p3;
		this.odigranoPolje4 = p4;
		this.brojOdigranihPokusaja++;
	}
	
	public int brojPogodakaNaMestu() {
		int brojac = 0;
		if (this.trazenaKombinacijaPolje1.equals(odigranoPolje1)) {
			brojac++;
		}
		if (this.trazenaKombinacijaPolje2.equals(odigranoPolje2)) {
			brojac++;
		}
		if (this.trazenaKombinacijaPolje3.equals(odigranoPolje3)) {
			brojac++;
		}
		if (this.trazenaKombinacijaPolje4.equals(odigranoPolje4)) {
			brojac++;
		}
		return brojac;
	}
	
	public int brojPogodakaAliNisuNaMestu() {
		int brojac = 0;
		ArrayList<String> odigrano = new ArrayList<String>();
		ArrayList<String> trazeno = new ArrayList<String>();
		odigrano.add(odigranoPolje1);
		odigrano.add(odigranoPolje2);
		odigrano.add(odigranoPolje3);
		odigrano.add(odigranoPolje4);
		trazeno.add(trazenaKombinacijaPolje1);
		trazeno.add(trazenaKombinacijaPolje2);
		trazeno.add(trazenaKombinacijaPolje3);
		trazeno.add(trazenaKombinacijaPolje4);
		for (int i = 0; i < 4; i++) {
			if (odigrano.get(i).equals(trazeno.get(i))) {
				odigrano.set(i, "");
				trazeno.set(i, " ");
			}
		}
		for (int i = 0; i < trazeno.size(); i++) {
			for (int j = 0; j < odigrano.size(); j++) {
				if (trazeno.get(i).equals(odigrano.get(j))) {
					brojac++;
					trazeno.set(i, " ");
					odigrano.set(j, "");
				}
			}
		}
		return brojac;
	}
	
	public void stampaTrazenuKombinaciju() {
		System.out.println(this.trazenaKombinacijaPolje1 + " | " + this.trazenaKombinacijaPolje2 + " | " 
				+ this.trazenaKombinacijaPolje3 + " | " + this.trazenaKombinacijaPolje4);
	}
	
	public void stampaOdigranuKombinaciju() {
		System.out.println(this.odigranoPolje1 + " | " + this.odigranoPolje2 + " | " 
				+ this.odigranoPolje3 + " | " + this.odigranoPolje4);
	}
	

}
