package p25_08_2022_zadatak3;

import java.util.ArrayList;

public class History {
	
	private ArrayList<HistoryPage> niz = new ArrayList<HistoryPage>();
	
	public void otvoriStranicu(HistoryPage h) {
		niz.add(h);
	}
	
	public void obrisiStranicu(String linkStranice) {
		for (int i = 0; i < niz.size(); i++) {
			if (this.niz.get(i).getLink().equals(linkStranice)) {
				this.niz.remove(i);
			}
		}
	}
	
	public void obrisiKolacice(String linkStranice) {
		for (int i = 0; i < niz.size(); i++) {
			if (this.niz.get(i).getLink().equals(linkStranice)) {
				this.niz.get(i).obrisiKolacice();
			}
		}
	}
	
	public void obrisiIstoriju() {
		niz.clear();
	}
	
	public void sacuvacKredencijale(String nazivStranice, String user, String pass) {
		for (int i = 0; i < niz.size(); i++) {
			if(this.niz.get(i).getNazivStranice().equals(nazivStranice)) {
				this.niz.get(i).sacuvacKredencijale(user, pass);
			}
		}
	}
	
	public void pogledajIstoriju() {
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(i + 1 + ". ");
			niz.get(i).stampaj();
		}
	}
	
	public void obrisiKolacice() {
		for (int i = 0; i < niz.size(); i++) {
			niz.get(i).obrisiKolacice();
		}
	}
	
	public void obrisiSveKolaciceZaSadnjihSatVremena(int sat, int minut) { //trenutno vreme
		for (int i = 0; i < niz.size(); i++) {
			if((niz.get(i).getSatOtvaranjaStranice() == sat && niz.get(i).getMinOtvaranjaStranice() <= minut) 
					|| (niz.get(i).getSatOtvaranjaStranice() == sat - 1 && niz.get(i).getMinOtvaranjaStranice() <= minut))					
					{
						niz.remove(i);
					}
		}
	}
	
	
	
	
}
