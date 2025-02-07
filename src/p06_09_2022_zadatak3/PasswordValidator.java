package p06_09_2022_zadatak3;

public class PasswordValidator extends Validator {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private boolean containsUpperCaseChar(String word) {
		for (int i = 0; i < word.length(); i++) {			
			if (Character.isUpperCase(word.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean containsLowerCaseChar(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean containsNumber(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public ValidationResult validate() {
		ValidationResult resultPass = new ValidationResult();
		
		if (!((this.password.contains("@") || this.password.contains("#") || this.password.contains("/") || this.password.contains("*")))) {
			resultPass.addError("Password must contain at least one special character @, #, / or *");
		}
		if (this.password.length() < 8) {
			resultPass.addError("Password must be minimum 8 characters");
		}
		if (!containsUpperCaseChar(this.password)) {
			resultPass.addError("Password must contain at least one uppercase letter");
		}
		if (!containsLowerCaseChar(this.password)) {
			resultPass.addError("Password must contain at least one lowercase letter");
		}
		if (!containsNumber(this.password)) {
			resultPass.addError("Password must contain at least one digit");
		}
		return resultPass;
	}
	
	
	
}
