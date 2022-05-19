package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLastNameUC2_RF {
	public static void main(String[] args)throws InvalidLastNameException {
	String lastName = "Kr";
	Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
	Matcher m = p.matcher(lastName);
	try {
		if(m.find())
			System.out.println(lastName+ " Entered Last Name is valid");
		else
			throw new InvalidLastNameException("Invalid Last Name");
		}
		catch (Exception e) {
		}
	}
}
