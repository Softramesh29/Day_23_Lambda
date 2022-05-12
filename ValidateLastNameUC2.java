package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLastNameUC2 {
	public static void main(String[] args) {
	String lastName = "Kumar";
	Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
	Matcher m = p.matcher(lastName);
	if(m.find())
		System.out.println(lastName+ " Entered Last Name is valid");
	else
		System.out.println(lastName+ " Entered Last Name is Invalid");
	}
}
