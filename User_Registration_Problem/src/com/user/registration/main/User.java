package com.user.registration.main;

public class User {
	public boolean validateFirstName(String name) {
		String expression = "^[A-Z][a-z]{2,}$";

		if (name.matches(expression))
			return true;
		else
			return false;

	}
}
