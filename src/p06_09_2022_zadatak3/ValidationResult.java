package p06_09_2022_zadatak3;

import java.util.ArrayList;

public class ValidationResult {
	
	private boolean hasErrors;
	private ArrayList<String> Errors = new ArrayList<String>();
	
	public ValidationResult() {
		super();
		this.hasErrors = false;
	}
	
	public boolean isHasErrors() {
		return hasErrors;
	}
	public ArrayList<String> getErrors() {
		return Errors;
	}
	
	public void addError(String greska) {
		this.hasErrors = true;
		this.Errors.add(greska);
	}
	
	public void print() {
		if (this.Errors.size() != 0) {
			for (int i = 0; i < this.Errors.size(); i++) {
				System.out.print(i + 1 + ". ");
				System.out.println(this.Errors.get(i));
			}
		} else {
			System.out.println("No validation errors");
		}
	}
	
	
	
	
	
	
}
