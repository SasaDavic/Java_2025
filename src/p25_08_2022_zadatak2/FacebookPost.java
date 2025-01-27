package p25_08_2022_zadatak2;

import java.util.ArrayList;

public class FacebookPost {
	
	public FacebookPost(String korisnikObjavioPost, String text) {
		super();
		this.korisnikObjavioPost = korisnikObjavioPost;
		this.text = text;
	}
	private String korisnikObjavioPost;
	private String text;
	private ArrayList<Reakcija> niz = new ArrayList<Reakcija>();
	
	public void reaguj(Reakcija r) {
		for (int i = 0; i < niz.size(); i++) {
			if (this.niz.get(i).getKorisnikReagovao().equals(r.getKorisnikReagovao())) {
				this.niz.remove(i);
			}
		}
		this.niz.add(r);
	}
	private int brReakcija(String tipReakcije) {
		int brojac = 0;
		for (int i = 0; i < this.niz.size(); i++) {
			if (this.niz.get(i).getTip().equals(tipReakcije)) {
				brojac++;
			}
		}
		return brojac;
	}
	public void stampaj() {
		System.out.println(this.korisnikObjavioPost);
		System.out.println(this.text);
		System.out.println("Smajli " + brReakcija("smajli") + " | Like " + brReakcija("like") + " | Srce " + brReakcija("srce"));
	}
	
	
	
}
