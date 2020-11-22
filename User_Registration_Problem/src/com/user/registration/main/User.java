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
}
