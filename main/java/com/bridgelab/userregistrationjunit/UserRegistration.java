package com.bridgelab.userregistrationjunit;

public class UserRegistration {

	public boolean firstName(String name) {
		String pattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(pattern);
		return result;
	}

	public boolean lastName(String name) {
		String pattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(pattern);
		return result;
	}

	public boolean mobileNumberValidate(String number) {
		String pattern = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
		boolean result = number.matches(pattern);
		return result;
	}

	public boolean isValidEmail(String email) {
		String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
		boolean result = email.matches(emailPattern) ;
		return result;
	}
	
	public boolean passwordOneValidate(String password) {
		String pattern = "^[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(pattern);
		return result;
	}
	
	public boolean passwordTwoValidate(String password) {
		String pattern = "(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(pattern);
		return result;
	}
	
	public boolean passwordThreeValidate(String password) {
		String pattern = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(pattern);
		return result;
	}
	
	public boolean passwordFourValidate(String password) {
		String pattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
		boolean result = password.matches(pattern);
		return result;
	}

}
