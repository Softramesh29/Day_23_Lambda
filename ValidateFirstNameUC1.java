package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFirstNameUC1 {
	public static void main(String[] args) {
	String firstName = "Ramesh";
	Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
	Matcher m = p.matcher(firstName);
	if(m.find())
		System.out.println(firstName+ " Entered First Name is valid");
	else
		System.out.println(firstName+ " Entered First Name is Invalid");
	}
}
