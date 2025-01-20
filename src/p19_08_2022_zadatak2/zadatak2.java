package p19_08_2022_zadatak2;

public class zadatak2 {

	public static void main(String[] args) {
	/*
Zad Kreirati klasu Radnik koja ima:
jmbg radnika
ime i prezime
broj dece (1,2,3,... ili 0 ako nema dece)
stepen strucne spreme (od 1 do 8)
godine radnog staza
konstuktor koji postavlja samo jmbg
konstuktor koji postavlja sve atribute
getere i setere
metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
metodu koja vraca koeficijent slozenosti:
Racuna se tako sto se pomnozi stepen strucne spreme i broj dece.
metodu koja racuna platu radnika, plata se racuna po formuli:
25000 + (koeficijent slozenosti + minuli rad) * 10000
metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)

Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
- do 10 godina 0.05
- od 10-20 godina 0.075
- preko 20 godina 0.1

Koeficijent slozenosti
- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

	 */
		
		Radnik r1 = new Radnik("123456789");
		r1.setBrDece(0);
		r1.setGodRadnogStaza(15);
		r1.setPunoIme("Nikola Nikolic");
		r1.setStepenSS(4);
		r1.stampaj();
		System.out.println();
		
		Radnik r2 = new Radnik("789789789", "Mina Lazarevic", 2, 7, 5);
		r2.stampaj();
		
	}

}
