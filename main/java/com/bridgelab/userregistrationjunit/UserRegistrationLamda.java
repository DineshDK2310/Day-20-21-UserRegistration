package com.bridgelab.userregistrationjunit;

import java.util.regex.Pattern;

public class UserRegistrationLamda {

	final String nameValidate = "^[A-Z][a-z]{2,}$";
	final String mobileValidate = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
	final String emailValidate = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
	final String passwordValidate = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
	
	UserValidaterLamda firstName = (regex) -> (Pattern.compile(nameValidate).matcher(regex).matches());
    UserValidaterLamda lastName = (regex) -> (Pattern.compile(nameValidate).matcher(regex).matches());
    UserValidaterLamda mobile = (regex) -> (Pattern.compile(mobileValidate).matcher(regex).matches());
    UserValidaterLamda email = (regex) -> (Pattern.compile(emailValidate).matcher(regex).matches());
    UserValidaterLamda password = (regex) -> (Pattern.compile(passwordValidate).matcher(regex).matches());

}
