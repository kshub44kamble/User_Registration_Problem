package com.user.registration.main;

import java.util.regex.Pattern;

public class User {

	// method validate first name
	public boolean validateFirstName(String name) {
		String expression = "^[A-Z][a-z]{2,}$";

		if (name.matches(expression))
			return true;
		else
			return false;
	}

	// method validate last name
	public boolean validateLastName(String name) {
		String expression = "^[A-Z][a-z]{2,}$";

		if (name.matches(expression))
			return true;
		else
			return false;
	}

	// method validate email address
	public boolean validateEmailAdress(String email) {
		String expression = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(email).matches();
	}

	// method validate phone number
	public boolean validatePhoneNumber(String number) {
		String expression = "^([\\+]?91)[6-9]{1}[0-9]{9}$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(number).matches();
	}

	// method validate password Rule 1 minimum 8 character
	public boolean validatePasswordMinEightChar(String password) {
		String expression = "[a-zA-Z]{8,}$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(password).matches();
	}

	// method validate password Rule 2 At least one upper case
	public boolean validatePasswordAtleastOneUpperCase(String password) {
		String expression = "^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(password).matches();
	}

	// method validate password Rule 3 Should have at least 1 numeric number in the
	// password
	public boolean validatePasswordAtleastOneNumericNumber(String password) {
		String expression = "^([A-Za-z0-9]*[0-9]+[A-Za-z0-9]*[A-Z])|([A-Za-z0-9]*[A-Z]+[A-Za-z0-9]*[0-9])$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(password).matches();
	}

	// method validate password Rule 4 Has exactly 1 special character
	public boolean validatePasswordHasExactlyOneSpecialCharacter(String password) {
		String expression = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[0-9a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(password).matches();
	}
}
