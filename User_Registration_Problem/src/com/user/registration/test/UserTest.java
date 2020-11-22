package com.user.registration.test;

import org.junit.Assert;
import org.junit.Test;

import com.user.registration.main.User;

public class UserTest {

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

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		User userValidator = new User();
		boolean result = userValidator.validateFirstName("S@ubh");
		Assert.assertEquals(false, result);
	}

}
