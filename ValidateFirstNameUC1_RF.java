package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFirstNameUC1_RF {
	public static void main(String[] args) throws InvalidFirstNameException {
	String firstName = "Ra";
	Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
	Matcher m = p.matcher(firstName);
	try {
	if(m.find())
		System.out.println(firstName+ " Entered First Name is valid");
	else
		throw new InvalidFirstNameException("Invalid First Name");
	}
	catch (Exception e) {
	}
	}
}
