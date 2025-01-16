package p05_08_2022;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		/*
(ZA VEZBANJE) Napisati program koji iscrtava timeline na youtube videu. Korisnik unosi duzinu videa u 
sekundama i trenutno vreme u videu, a program iscrtava timeline tako sto deo koji je pogledan iscrtava 
zvezdicama a ostatak sa crticama. Timeline je kontrola koja ima tacno 100 karaktera.
Primer izvrsenja:
Unesite duzinu videa (s): 203
Unesite trenutno vreme videa (s): 20
(Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa 
(zaokruzicemo to na 9zvezdice ostatak do 100 su crtice)
*********-------------------------------------------------------------------------------------------

MOGUCA SU DVA RESENJA:
Jedno je sa jednom petljom koja u sebi ima if i else
Drugo je sa 2 petlje, jedna stampa zvezdice a druga stampa crtice

	(DOPUNA TAKODJE ZA VEZBANJE)
Pretvorite vremena u minute i sekune i stavite ih ispod prikaza:
Primer izvrsenja:
Unesite duzinu videa (s): 203
Unesite trenutno vreme videa (s): 20
(Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa 
(zaokruzicemo to na 9zvezdice ostatak do 100 su crtice)
*********-------------------------------------------------------------------------------------------
 0:20 / 3:23


		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite duzinu videa (s): ");
		int duzinaVideaS = s.nextInt();
		System.out.println("Unesite trenutno vreme videa (s): ");
		int trenutnoVremeVideaS = s.nextInt();
		
		double zvezda = trenutnoVremeVideaS * 1.00 / duzinaVideaS * 100;
		int z = (int) zvezda;
		
		for (int i = 1; i <= 100; i++) {
			if (i <= z) {
				System.out.print("*");
			} else {
				System.out.print("-");
			}
		}
		System.out.println();
		int secDuzina = duzinaVideaS % 60;
		int minDuzina = (duzinaVideaS - secDuzina) / 60;
		int secTrenutno = trenutnoVremeVideaS % 60;
		int minTrenutno = (trenutnoVremeVideaS - secTrenutno) / 60;
		System.out.println(minTrenutno + ":" + secTrenutno + " / " + minDuzina + ":" + secDuzina);
		
		
	}

}
