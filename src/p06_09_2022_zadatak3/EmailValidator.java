package p06_09_2022_zadatak3;

public class EmailValidator extends Validator {
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public ValidationResult validate() {
		ValidationResult resultEmail = new ValidationResult();
		if (this.email.contains("@") && (this.email.endsWith(".net") || this.email.endsWith(".com"))) {
			return resultEmail;
		} 
		resultEmail.addError("Email is invalid");
		return resultEmail;
		}
	}
	
	
