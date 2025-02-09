package drugi_Java_test;

import java.util.ArrayList;

public class InstagramStory {
	
	private InstagramUser autorStorija;
	private String linkZaSwipeUp;
	private String linkSlike;
	private ArrayList<InstagramAddOn> nizDodataka = new ArrayList<>();
	private ArrayList<InstagramUser> nizPogledaliStori = new ArrayList<InstagramUser>();
	
	public InstagramUser getAutorStorija() {
		return autorStorija;
	}
	public String getLinkZaSwipeUp() {
		return linkZaSwipeUp;
	}
	public String getLinkSlike() {
		return linkSlike;
	}
	public ArrayList<InstagramAddOn> getNizDodataka() {
		return nizDodataka;
	}
	public ArrayList<InstagramUser> getNizPogledaliStori() {
		return nizPogledaliStori;
	}
	public void setLinkZaSwipeUp(String linkZaSwipeUp) {
		this.linkZaSwipeUp = linkZaSwipeUp;
	}
	public InstagramStory(InstagramUser autorStorija, String linkSlike) {
		super();
		this.autorStorija = autorStorija;
		this.linkZaSwipeUp = null;
		this.linkSlike = linkSlike;
	}
	
	public void dodajAddOn(InstagramAddOn add) {
		this.nizDodataka.add(add);
	}
	
	public void brisiAddOn(int idDodatka) {
		for (int i = 0; i < this.nizDodataka.size(); i++) {
			if (this.nizDodataka.get(i).getId() == idDodatka) {
				this.nizDodataka.remove(i);
			}
		}
	}
	
	private boolean pogledaoStori(String userName) {
		for (int i = 0; i < this.nizPogledaliStori.size(); i++) {
			if (this.nizPogledaliStori.get(i).getUsername().equals(userName)) {
				return true;
			}
		}
		return false;
	}
	
	public void pogledajStori(InstagramUser user) {
		if (pogledaoStori(user.getUsername()) == false) {
			this.nizPogledaliStori.add(user);
		} else {
			System.out.println("Korisnik je vec pogledao stori!");
		}
	}
	
	public void postaviStori() {
		this.autorStorija.print();
		System.out.println("Story: ");
		System.out.println("Image: " + this.linkSlike);
		for (int i = 0; i < this.nizDodataka.size(); i++) {
			this.nizDodataka.get(i).stampaj();
		}
		if (this.linkZaSwipeUp != null) {
			System.out.println("<<< swipe up >>>");
			System.out.println(this.linkZaSwipeUp);
		}
	}
	
	private int brojPregleda() {
		return this.nizPogledaliStori.size();
	}
	
	public void printPogledaliStori() {
		System.out.println("Viewers " + brojPregleda());
		for (int i = 0; i < this.nizPogledaliStori.size(); i++) {
			this.nizPogledaliStori.get(i).print();
		}
	}

}
