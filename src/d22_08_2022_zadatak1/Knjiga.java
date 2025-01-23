package d22_08_2022_zadatak1;

public class Knjiga {
	
	public Knjiga(String isbn, String naziv, int godIzdanja) {
		super();
		this.isbn = isbn;
		this.naziv = naziv;
		this.godIzdanja = godIzdanja;
	}
	public Knjiga(String isbn, String naziv, int godIzdanja, Autor autor) {
		super();
		this.isbn = isbn;
		this.naziv = naziv;
		this.godIzdanja = godIzdanja;
		this.autor = autor;
	}
	
		private String isbn;
		private String naziv;
		private int godIzdanja;
		private Autor autor;
		public Autor getAutor() {
			return autor;
		}
		public void setAutor(Autor autor) {
			this.autor = autor;
		}
		public String getIsbn() {
			return isbn;
		}
		public String getNaziv() {
			return naziv;
		}
		public int getGodIzdanja() {
			return godIzdanja;
		}
			
		public void print() {
				System.out.println(this.isbn);
				System.out.println(this.naziv + " - " + this.godIzdanja);
				this.autor.print();
			}
		
}
