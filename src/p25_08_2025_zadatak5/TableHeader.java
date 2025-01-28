package p25_08_2025_zadatak5;

import java.util.ArrayList;

public class TableHeader {
	
	private ArrayList<String> cellsHeader = new ArrayList<String>();
	
	public void addHeaderCell(String c) {
		this.cellsHeader.add(c);
	}
	
	public void print() {
		for (int i = 0; i < this.cellsHeader.size(); i++) {
			System.out.print(this.cellsHeader.get(i) + "\t|\t");
		}
		System.out.println();
	}
	
	public void printHTML() {
		System.out.print("<tr>");
		for (int i = 0; i < this.cellsHeader.size(); i++) {
			System.out.print("<th>" + this.cellsHeader.get(i) + "</th>");
		}
		System.out.println("</tr>");
	}
	

}
