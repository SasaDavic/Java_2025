package p23_08_2022_zadatak4;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Kreirati klasu ViberKorisnik koja ima:
ime i prezime
broj telefona
da li je trenutno aktivan (boolean)
gettere, settere, konstuktore

Kreirati klasu ViberPoruka koja ima:
tekst poruke
vreme kad je poslata poruka
korisnika koji je poslao poruku
korisnika kome je poslata poruka
gettere i setere i konstuktore
rekaciju na poruku
metodu prikazi koja stampa podatke o poruci u formatu:
From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
To: [Ime i prezime korisnika kome je poslata]
[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]

POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
if (this.reakcija != null)

Kreirati klasu ViberReakcija koja ima:
emoji (moze da bude sunglases, heart, smile, like ili sad)
korisnika koji je reagovao
U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.


	 */
		
		ViberKorisnik ana = new ViberKorisnik("Ana Stankovic", "062852369", true);
		ViberKorisnik neda = new ViberKorisnik("Neda Mihajlovic", "061785241", false);
		ViberPoruka sms1 = new ViberPoruka("Cao. Sta ima novo?", "22:01 24.01.25.", ana, neda);
		
		ViberReakcija r1 = new ViberReakcija("<3", neda);
		sms1.setReakcija(r1);
		
		ViberPoruka sms2 = new ViberPoruka("Nista posebno..", "22:32 24.01.25.", neda, ana);
		ViberReakcija r2 = new ViberReakcija(":D", ana);
		sms2.setReakcija(r2);
		
		sms1.stampaj();
		sms2.stampaj();

	}

}
