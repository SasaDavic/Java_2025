package p06_09_2022_zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
Zadatak 3 
Krerati klasu ValidationResult koja ima:
hasErrors- koji moze da bude true ili false 
Errors - niz strigova
Gettere za atribute
Metodu addError koja postavlja hasErrors na true i dodaje gresku u niz.
Metodu print koja stampa u formatu:
Ako greske postoje, svaku gresku stampamo u novom redu
Ukoliko ne postoje, stampamo �No validation errors�

Kreirati apstraktnu klasu Validator koja ima:
Apstraktnu metodu validate koja vraca ValidationResult. Metoda ne prima parametre.

Kreirati klasu EmailValidator koja nasledjuje klasu Validator i koja ima:
Atribut email
Geter i seter za email
Email je validan ukoliko ispunjava sledec uslove:
Email mora da sadrzi @
Email mora da se zavrsava na .com ili .net
Ukoliko email ne ispunjava uslove vratiti rezultat sa greskom �Email is invalid�

Kreirati klasu PasswordValidator koja nasledjuje klasu Validator i koja ima:
 Atribut password
Geter i seter za password
Password je validan ukoliko:
Sadrzi jedan od sledecih karaktera @ # / *
Ima minimum 8 karaktera
Sadrzi bar jedno veliko slovo (izguglajte kako ovo da proverite)
Koristan link
Sadrzi bar jedno malo slovo
Sadrzi bar jedan cifru. Koristan link, idite na kraj stranice to je najslicnije resenje onom iznad 
	Ukoliko se npr za password unese vrednost botcamp
	Metoda vraca rezultat sa greskama:
Password must contain at least one uppercase letter
Password must contain at least one special character @, # or *
Password must be minimum 8 characters
Password must contain at least one digit

Kreirati klasu PhoneValidator koja nasledjuje klasu Validator i koja ima:
 Atribut za broj telefona
Geter i seter za broj telefona
Broj telefona je validan ukoliko:
Broj krece sa znakom +
Ukoliko nema razmaka
Sadrzi samo cifre
Ukoliko se npr za broj telefona unese vrednost 5a5 555 55
	Metoda vraca rezultat sa greskama:
Phone number must start with +
Phone number cannot contain spaces
Phone number can only contain numbers

U glavnom programu kreirati objekte i testirati sve funkionalnosti


		 */
		EmailValidator email = new EmailValidator();
		email.setEmail("sasa@gmail.com");
		PhoneValidator phone = new PhoneValidator();
		phone.setNumber("+555666");
		PasswordValidator password = new PasswordValidator();
		password.setPassword("a1A@7412");
		
		ValidationResult emailResult = email.validate();
		emailResult.print();
		ValidationResult phoneResult = phone.validate();
		phoneResult.print();
		/* 
		ValidationResult passwordResult = password.validate();
		passwordResult.print(); 
		*/
		
		//ili
		password.validate().print();
	}

}
