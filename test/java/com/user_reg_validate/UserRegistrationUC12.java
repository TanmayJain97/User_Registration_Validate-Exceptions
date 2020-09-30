package com.user_reg_validate;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC12 {

	private UserRegValidate validator;

	@Before
	public void init() {
		validator = new UserRegValidate();
	}

	//Run Test for FirstName - 1 Happy and 1 Sad
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validateFName("Tanmay"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validateFName("Bh"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for LastName - 1 Happy and 1 Sad
	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validateLName("Jain"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validateLName("Jain0"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for Email - 1 Happy and 1 Sad
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validateEmail("mail.tanmay@gmai.com"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenEmail_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validateEmail("mail@.com"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for Mobile Phone Number - 1 Happy and 1 Sad
	@Test
	public void givenPhoneNum_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validatePhone("874 9855201458"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenPhoneNum_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validatePhone("54681"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	//Run Test for Password - 1 Happy and 1 Sad
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		try {
			assertTrue(validator.validatePassword("loPs1&jdlsaf"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenPassword_WhenInValid_ShouldThrowException() {
		try {
			assertFalse(validator.validatePassword("Tanmay0101"));
		} catch (UserDetailsInvalidException exception) {
			exception.printStackTrace();
		}
	}
}