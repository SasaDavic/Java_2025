package p16_08_2022_zadatak2;

public class SlackMessage {

	public String text;
	public String ime;
	public String vreme;
	
	public void printMessage() {
		System.out.println(this.ime + " - " + this.vreme);
		System.out.println(this.text);
		System.out.println();
	}
	
	
}
