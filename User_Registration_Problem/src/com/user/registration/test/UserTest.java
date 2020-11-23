package com.user.registration.test;

import org.junit.Assert;
import org.junit.Test;

import com.user.registration.main.User;

public class UserTest {

	// first name test
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validateFirstName("Shubham");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validateFirstName("Sh");
		Assert.assertEquals(false, result);
	}

	// Last name test
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validateFirstName("S@ubh");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validateLastName("Kamble");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validateLastName("Ka");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validateLastName("k@mb");
		Assert.assertEquals(false, result);
	}

	// Email Address test
	@Test
	public void givenEmailName_WhenValid_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validateEmailAdress("shubh@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmailName_WhenNotValid_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validateEmailAdress("Shuh@.gmail.com");
		Assert.assertEquals(false, result);
	}

	// Phone number test
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validatePhoneNumber("+919308678787");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenNotGivenCountryCode_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validatePhoneNumber("012393086");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenSpacesBetweenNumber_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validatePhoneNumber("+9193084 76567");
		Assert.assertEquals(false, result);
	}

	// Password test Rule 1: Minimum 8 character
	@Test
	public void givenPassword_WhenProperEightChar_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordMinEightChar("Password");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotEightChar_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordMinEightChar("Pass");
		Assert.assertEquals(false, result);
	}

	// Password test Rule 2: At least 1 Upper case
	@Test
	public void givenPassword_WhenProperWithOneUpperCase_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordAtleastOneUpperCase("Password");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotWithOneUpperCase_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordAtleastOneUpperCase("pass");
		Assert.assertEquals(false, result);
	}

	// Password test Rule 3: At least 1 numeric number in the password
	@Test
	public void givenPassword_WhenProperWithAtleastOneNumericNumber_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordAtleastOneNumericNumber("Pass4word8");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotrWithAtleastOneNumericNumber_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordAtleastOneNumericNumber("word");
		Assert.assertEquals(false, result);
	}

	// Password test Rule 4: Has exactly one special character
	@Test
	public void givenPassword_WhenProperHasExactlyOneSpecialCharacter_ShouldReturnTrue() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordHasExactlyOneSpecialCharacter("Pass4w@rd8");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotHasExactlyOneSpecialCharacter_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validatePasswordHasExactlyOneSpecialCharacter("word8pass");
		Assert.assertEquals(false, result);
	}
}
