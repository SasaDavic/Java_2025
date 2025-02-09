package drugi_Java_test;

public class InstagramMentionAddOn extends InstagramAddOn {

	private InstagramUser tagovan;

	public InstagramMentionAddOn(int id, int xKoordinata, int yKoordinata, int sirinaAddOn, int visinaAddOn,
			InstagramUser tagovan) {
		super(id, xKoordinata, yKoordinata, sirinaAddOn, visinaAddOn);
		if (sirinaAddOn < minSirinaDodatka()) {
			throw new IllegalArgumentException("Minimalna sirina dodatka je " + minSirinaDodatka());
		}
		if (visinaAddOn < minVisinaDodatka()) {
			throw new IllegalArgumentException("Minimalna visina dodatka je " + minVisinaDodatka());
		}
		this.tagovan = tagovan;
	}

	public InstagramUser getTagovan() {
		return tagovan;
	}

	public void setTagovan(InstagramUser tagovan) {
		this.tagovan = tagovan;
	}

	@Override
	public int minSirinaDodatka() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public int minVisinaDodatka() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void stampaj() {
		System.out.println("[" + this.xKoordinata + ", " + this.yKoordinata + "] (" + this.visinaAddOn + ", " 
				+ this.sirinaAddOn + ") " + this.tagovan.getUsername() + "/" + this.tagovan.profilLink());
	}
	

	
}
