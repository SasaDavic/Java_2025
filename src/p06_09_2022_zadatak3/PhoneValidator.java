package p06_09_2022_zadatak3;

public class PhoneValidator extends Validator {
	
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	private boolean containsNumbers(String num) {
		for (int i = 1; i < num.length(); i++) {
			if (Character.isDigit(num.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}
	
	private boolean noSpaces(String word) {
		if (word.contains(" ")) {
			return false;
		}
		return true;	
		//return !word.contains(" "); jednostavnije
	}
	
	
	
	@Override
	public ValidationResult validate() {
		ValidationResult resultPhone = new ValidationResult();
		
		if (!this.number.startsWith("+")) {
			resultPhone.addError("Phone number must start with +");
		}
		if (!containsNumbers(this.number)) {
			resultPhone.addError("Phone number can only contain numbers");
		}
		if (!noSpaces(this.number)) {
			resultPhone.addError("Phone number cannot contain spaces");
		}
		return resultPhone;
	}
	

}
