package p16_08_2022_zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
Krairti klasu SlackMessage koja ima:
tekst poruke
ime i prezime osobe koja je stavila poruku
datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
[ime i prezime osobe] - [kad je poslata]
[Tekst poruke]

Dopuna:
Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu koji je naveden iznad i u 
mainu pozovite metode nad objektima koje ste kreirali.

		 */
		
		SlackMessage poruka1 = new SlackMessage();
		poruka1.text = "Zdravo svima, klip je super! Nadam se da ce nastavak uskoro! :)";
		poruka1.ime = "Julija Mocic";
		poruka1.vreme = "18.01.2025 15:16";
		
		SlackMessage poruka2 = new SlackMessage();
		poruka2.text = "Hocu letoooooooo!!! B)";
		poruka2.ime = "Igor Jonic";
		poruka2.vreme = "17.01.2025 14:20";
		
		poruka1.printMessage();
		poruka2.printMessage();
				

	}

}
