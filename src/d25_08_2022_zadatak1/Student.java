package d25_08_2022_zadatak1;

import java.util.ArrayList;

public class Student {
	
	public Student(int brIndexa, String punoIme, String tipStudija) {
		this.brIndexa = brIndexa;
		this.punoIme = punoIme;
		this.tipStudija = tipStudija;
	}
	private int brIndexa;
	private String punoIme;
	private String tipStudija; //osnovne, master, doktorske
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	public double prosek() {
		double suma = 0;
		int brojac = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (this.ispiti.get(i).jePolozen() == true) {
				brojac++;
				suma += this.ispiti.get(i).getOcena();
			}
		}
		return suma / brojac;
	}
	
	public void print() {
		System.out.println(this.brIndexa + " - " + this.punoIme + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for (int i = 0; i < this.ispiti.size(); i++) {
			System.out.print(i + 1 + ". ");
			this.ispiti.get(i).printIspit();
		}
		System.out.println("Prosecna ocena: " + prosek());
	}
	
}
