package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordRule4UC8_RF {
	public static void main(String[] args) throws InvalidPasswordException {
	String passWord = "AJH$oJK";
	Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}");
	Matcher m = p.matcher(passWord);
	try {
		if(m.find())
			System.out.println(passWord+ " Entered Password is valid");
		else
			throw new InvalidPasswordException("Invalid Password");
		}
		catch (Exception e) {
		}
	}
}
