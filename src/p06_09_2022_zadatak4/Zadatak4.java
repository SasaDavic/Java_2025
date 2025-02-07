package p06_09_2022_zadatak4;

public class Zadatak4 {

	public static void main(String[] args) {
		/*
Kreirati apstraktnu klasu Atleticar čiji su tributi: 
ime i prezime privatni
i rezultat ostvaren na takmičenju koji je zasticen
Javne metode klase su: 
apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara 
(metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći. 

Kreirati i klasu Disciplina čiji su privatni atributi: 
ime discipline
tip discipline (Trkacka ili Skakacka)
niz atletičara koji učestvuju u toj disciplini. 
U javnom delu klase definisati: 
konstuktore, gettere i settere
konstruktor koji postavlja ime discipline i tip
metodu dodaj atleticara u disciplinu
metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline. 

U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,  
(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline. 
		 */
		
		Disciplina dis1 = new Disciplina("Skok u dalj", "Skakacka");
		Disciplina dis2 = new Disciplina("110m s preponama", "Trkacka");
		
		Skakac s1 = new Skakac("Majk Pauel", 8.95);
		Skakac s2 = new Skakac("Bob Bimon", 8.90);
		Skakac s3 = new Skakac("Karl Luis", 8.87);
		
		Trkac t1 = new Trkac("Kerstin Knabe", 13.03);
		Trkac t2 = new Trkac("Betine Jan", 12.81);
		Trkac t3 = new Trkac("Ginka Zagorčeva", 12.75);
		
		dis1.dodajAtleticaraUDisciplinu(s1);
		dis1.dodajAtleticaraUDisciplinu(s2);
		dis1.dodajAtleticaraUDisciplinu(s3);
		
		dis2.dodajAtleticaraUDisciplinu(t1);
		dis2.dodajAtleticaraUDisciplinu(t2);
		dis2.dodajAtleticaraUDisciplinu(t3);
		
		dis1.printPobednik();
		System.out.println();
		dis2.printPobednik();
		
		dis1.diskvalifikujAtleticara("Majk Pauel");
		System.out.println();
		dis1.printPobednik();
	}

}
