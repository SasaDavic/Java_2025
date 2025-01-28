package p25_08_2022_zadatak4;

import java.util.ArrayList;

public class InstagramImage {
	
	public InstagramImage(String dimenzijaSlike, String putanjaDoSlike) {
		this.dimenzijaSlike = dimenzijaSlike;
		this.putanjaDoSlike = putanjaDoSlike;
	}

	private ArrayList<InstagramTag> tagovaniUseri = new ArrayList<InstagramTag>();
	private String dimenzijaSlike;
	private String putanjaDoSlike;
	
	public void dodajTag(InstagramTag tag) {
		this.tagovaniUseri.add(tag);
	}

	public ArrayList<InstagramTag> getTagovaniUseri() {
		return tagovaniUseri;
	}

	public void setTagovaniUseri(ArrayList<InstagramTag> tagovaniUseri) {
		this.tagovaniUseri = tagovaniUseri;
	}

	public String getDimenzijaSlike() {
		return dimenzijaSlike;
	}

	public void setDimenzijaSlike(String dimenzijaSlike) {
		this.dimenzijaSlike = dimenzijaSlike;
	}

	public String getPutanjaDoSlike() {
		return putanjaDoSlike;
	}

	public void setPutanjaDoSlike(String putanjaDoSlike) {
		this.putanjaDoSlike = putanjaDoSlike;
	}
	
	
	
}
