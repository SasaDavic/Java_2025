package p25_08_2025_zadatak5;

import java.util.ArrayList;

public class Table {
	
	public Table() {
		this.brRedovaPoStrani = 3;
	}

	private TableHeader header;
	private ArrayList<TableRow> rows = new ArrayList<TableRow>();
	private int brRedovaPoStrani;
	
	public void setHeader(TableHeader header) {
		this.header = header;
	}
	
	public void addRow(TableRow red) {
		rows.add(red);
	}
	
	public void printTable(int brStrane) {
		this.header.print();
		int a = this.brRedovaPoStrani * brStrane;
		int b = this.brRedovaPoStrani * brStrane - this.brRedovaPoStrani;
		if (a < rows.size()) {
			for (int i = b; i < a; i++) {
				System.out.print(i + 1 + ". ");
				rows.get(i).print();
			}
		} else {
			for (int i = b; i < rows.size(); i++) {
				System.out.print(i + 1 + ". ");
				rows.get(i).print();
			}
		}
		
	}
	
	public void printTableFilter(String text) {
		this.header.print();
		for (int i = 0; i < rows.size(); i++) {
			if (rows.get(i).sameCellExist(text)) {
				rows.get(i).print();
			}
		}
	}
	
	public void printHTMLTable() {
		this.header.printHTML();
		for (int i = 0; i < rows.size(); i++) {
			rows.get(i).printHTML();
		}
	}
	
	public void printPanigator() {
		int x = this.rows.size() / this.brRedovaPoStrani;
		for (int i = 1; i <= x; i++) {
			System.out.print(" | " + i);
		}
		if (this.rows.size() % this.brRedovaPoStrani != 0) {
			int y = x + 1;
			System.out.print(" | " + y);
		} else {
			System.out.print(" | ");
		}
		System.out.println();
	}
}
	
	
	
	
	
	
	

