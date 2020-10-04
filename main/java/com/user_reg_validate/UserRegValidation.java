package com.user_reg_validate;

import com.user_reg_validate.UserDetailsInvalidException.ExceptionType;

public class UserRegValidation {

	//Defining pattern as global variables
	private static final String FNAME_MATCH = "[A-Z]{1}[a-zA-Z]{2,}";			//String pattern to be detected
	private static final String LNAME_MATCH = FNAME_MATCH;
	private static final String EMAIL_MATCH = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String PHONE_MATCH = "[0-9]{1,}\\s[1-9]{1}[0-9]{9}";
	private static final String PASS_MATCH = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])).{8,}";

	//Function to check validity of First Name
	UserRegFunction validateFName = (fname) -> {
		if (fname.matches(FNAME_MATCH)) return true;
		throw new UserDetailsInvalidException("First Name Invalid Exception",
				ExceptionType.INVALID_FIRSTNAME);
	};

	//Function to check validity of Last Name
	UserRegFunction validateLName = (lname) -> {
		if (lname.matches(LNAME_MATCH)) return true;
		throw new UserDetailsInvalidException("Last Name Invalid Exception",
				ExceptionType.INVALID_LASTNAME);
	};

	//Function to check validity of Email
	UserRegFunction validateEmail = (email) -> {
		if (email.matches(EMAIL_MATCH)) return true;
		throw new UserDetailsInvalidException("Email Invalid Exception",
				ExceptionType.INVALID_EMAIL);
	};

	//Function to check validity of Mobile Phone number
	UserRegFunction validatePhone = (phone) -> {
		if (phone.matches(PHONE_MATCH)) return true;
		throw new UserDetailsInvalidException("Mobile Phone Number Invalid Exception",
				ExceptionType.INVALID_PHONE);
	};

	//Function to check validity of Password
	UserRegFunction validatePassword = (pass) -> {
		if (pass.matches(PASS_MATCH)) return true;
		throw new UserDetailsInvalidException("Password Invalid Exception",
				ExceptionType.INVALID_PASSWORD);
	};
}
