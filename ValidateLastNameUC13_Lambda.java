package com.bridgelabz.day_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ValidateLastName{
	String ValidateLastName(String message);
}
public class ValidateLastNameUC13_Lambda {
	public static void main(String[] args) {
		ValidateLastName result = (message) -> {
			Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
			Matcher m = p.matcher(message);
			
			if(m.find())
				return "Valid";
			else
				return "Invalid";
		};
		System.out.println(" Entered name is "+result.ValidateLastName("Kumar"));
	}
}
