package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailIdUC3_RF {
	public static void main(String[] args) throws InvalidEmailException {
	String emailId = "@gmail.co.in";
	Pattern p = Pattern.compile("^([a-z0-9]+)(\\.[a-z]+)?@([a-z0-9]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
	Matcher m = p.matcher(emailId);
	try {
		if(m.find())
			System.out.println(emailId+ " Entered Email is valid");
		else
			throw new InvalidEmailException("Invalid Email");
		}
		catch (Exception e) {
		}
	}
}
