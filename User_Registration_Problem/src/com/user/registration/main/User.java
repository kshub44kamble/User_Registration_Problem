package com.user.registration.main;

import java.util.regex.Pattern;

public class User {
	public boolean validateFirstName(String name) {
		String expression = "^[A-Z][a-z]{2,}$";

		if (name.matches(expression))
			return true;
		else
			return false;
	}

	public boolean validateLastName(String name) {
		String expression = "^[A-Z][a-z]{2,}$";

		if (name.matches(expression))
			return true;
		else
			return false;
	}

	public boolean validateEmailAdress(String email) {
		String expression = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(email).matches();
	}
}
