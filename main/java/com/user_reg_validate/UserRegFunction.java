package com.user_reg_validate;

@FunctionalInterface
public interface UserRegFunction {
	
	boolean compare(String input) throws UserDetailsInvalidException;
}