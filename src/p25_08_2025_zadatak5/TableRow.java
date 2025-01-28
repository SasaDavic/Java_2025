package p25_08_2025_zadatak5;

import java.util.ArrayList;

public class TableRow {
	
	private ArrayList<String> cellsBody = new ArrayList<String>();
	
	public void addRowCell(String c) {
		this.cellsBody.add(c);
	}
	
	public void print() {
		for (int i = 0; i < this.cellsBody.size(); i++) {
			System.out.print(this.cellsBody.get(i) + "\t\t\t");
		}
		System.out.println();
	}
	
	public void printHTML() {
		System.out.print("<tr>");
		for (int i = 0; i < this.cellsBody.size(); i++) {
			System.out.print("<td>" + this.cellsBody.get(i) + "</td>");
		}
		System.out.println("</tr>");
	}

	public boolean sameCellExist(String cellText) {
		for (int i = 0; i < cellsBody.size(); i++) {
			if(cellsBody.get(i).equals(cellText)) {
				return true;
			}
		}
		return false;
	}
}
