package com.user_reg_validate;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	private UserRegValidation validator;

	@Before
	public void init() {
		validator = new UserRegValidation();
	}

	//Run Test for FirstName - 1 Happy and 1 Sad
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validateFName.compare("Tanmay"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validateFName.compare("Bh"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for LastName - 1 Happy and 1 Sad
	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validateLName.compare("Jain"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validateLName.compare("Jain0"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for Email - 1 Happy and 1 Sad
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validateEmail.compare("mail.tanmay@gmai.com"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenEmail_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validateEmail.compare("mail@.com"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for Mobile Phone Number - 1 Happy and 1 Sad
	@Test
	public void givenPhoneNum_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validatePhone.compare("874 9855201458"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenPhoneNum_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validatePhone.compare("54681"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for Password - 1 Happy and 1 Sad
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validatePassword.compare("loPs1&jdlsaf"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenPassword_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validatePassword.compare("Tanmay0101"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}
}
