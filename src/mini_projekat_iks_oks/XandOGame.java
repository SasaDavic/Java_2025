package mini_projekat_iks_oks;

import java.util.ArrayList;

public class XandOGame {
	
	public XandOGame(Player playerX, Player playerO) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
	}
	
	public XandOGame() {
		super();
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
	}
	
	private ArrayList<String> table = new ArrayList<String>(); //stanje igre x,o,o,x,o,x,x
	private boolean nextPlayer; //false = x, true = o
	private Player playerX;
	private Player playerO;
	
	
	
	public boolean isNextPlayer() {
		return nextPlayer;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	
	public void print() {
		for (int i = 0; i < table.size(); i++) {
			System.out.print(" " + table.get(i) + " | ");
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}
	
	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, " ");
			this.nextPlayer = false;
		}
	}
	
	public boolean isGameOver() {
		int brojac = 0;
		for (int i = 0; i < table.size(); i++) {
			if (!table.get(i).equals(" ")) {
				brojac++;
			}
		}
		return brojac == 9 ? true : false;
	}
	
	public boolean isFieldFree(int brPolja) {
		if (!table.get(brPolja - 1).equals("x") && !table.get(brPolja - 1).equals("o ")) {
			return true;
		}
		return false;
	}
	
	public void playNext() {
		if (this.nextPlayer == true) {
			this.nextPlayer = false;
		} else {
			this.nextPlayer = true;
		}
	}
	
	public void makeAMove(int pozicija) {
		if (this.nextPlayer == false) {
			table.set(pozicija - 1, "x");
		} else {
			table.set(pozicija - 1, "o");
		}
	}
	
	public boolean isWinnerX() {
		if ((table.get(0).equals("x") && table.get(1).equals("x") && table.get(2).equals("x")) ||
				(table.get(3).equals("x") && table.get(4).equals("x") && table.get(5).equals("x")) ||
				(table.get(6).equals("x") && table.get(7).equals("x") && table.get(8).equals("x")) ||
				(table.get(0).equals("x") && table.get(3).equals("x") && table.get(6).equals("x")) ||
				(table.get(1).equals("x") && table.get(4).equals("x") && table.get(7).equals("x")) ||
				(table.get(2).equals("x") && table.get(5).equals("x") && table.get(8).equals("x")) ||
				(table.get(0).equals("x") && table.get(4).equals("x") && table.get(8).equals("x")) ||
				(table.get(2).equals("x") && table.get(4).equals("x") && table.get(6).equals("x"))) {
			return true;
		}
		return false;
	}
	
	public boolean isWinnerO() {
		if ((table.get(0).equals("o") && table.get(1).equals("o") && table.get(2).equals("o")) ||
				(table.get(3).equals("o") && table.get(4).equals("o") && table.get(5).equals("o")) ||
				(table.get(6).equals("o") && table.get(7).equals("o") && table.get(8).equals("o")) ||
				(table.get(0).equals("o") && table.get(3).equals("o") && table.get(6).equals("o")) ||
				(table.get(1).equals("o") && table.get(4).equals("o") && table.get(7).equals("o")) ||
				(table.get(2).equals("o") && table.get(5).equals("o") && table.get(8).equals("o")) ||
				(table.get(0).equals("o") && table.get(4).equals("o") && table.get(8).equals("o")) ||
				(table.get(2).equals("o") && table.get(4).equals("o") && table.get(6).equals("o"))) {
			return true;
		}
		return false;
	}
	
	public boolean isValidMove(int pozicija) {
		if (pozicija > 0 && pozicija < 10) {
			return true;
		}
		return false;
	}
	
	public int gameScore() {
		if (isWinnerX()) {
			return 1;
		} else if (isWinnerO()) {
			return 2;
		}
		return 0;
	}

}
