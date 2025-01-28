package p25_08_2022_zadatak4;

import java.util.ArrayList;

public class InstagramTag {

	public InstagramTag(int xKoordinata, int yKoordinata, InstagramUser tag) {
		this.xKoordinata = xKoordinata;
		this.yKoordinata = yKoordinata;
		this.tag = tag;
	}
	private int xKoordinata;
	private int yKoordinata;
	private InstagramUser tag;
	
	public int getxKoordinata() {
		return xKoordinata;
	}
	public void setxKoordinata(int xKoordinata) {
		this.xKoordinata = xKoordinata;
	}
	public int getyKoordinata() {
		return yKoordinata;
	}
	public void setyKoordinata(int yKoordinata) {
		this.yKoordinata = yKoordinata;
	}
	public InstagramUser getTag() {
		return tag;
	}
	public void setTag(InstagramUser tag) {
		this.tag = tag;
	}
	
	
	

}
