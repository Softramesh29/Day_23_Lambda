package com.bridgelabz.day_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ValidateFirstName{
	String ValidateFirstName(String message);
}
public class ValidateFirstNameUC13_Lambda {
	public static void main(String[] args) {
		ValidateFirstName result = (message) -> {
			Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
			Matcher m = p.matcher(message);
			
			if(m.find())
				return "Valid";
			else
				return "Invalid";
		};
		System.out.println("Entered first name is "+result.ValidateFirstName("Ramesh"));
	}
}
