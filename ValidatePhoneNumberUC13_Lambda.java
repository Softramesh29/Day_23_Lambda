package com.bridgelabz.day_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ValidatePhoneNumber{
	String ValidatePhoneNumber(String message);
}
public class ValidatePhoneNumberUC13_Lambda {
	public static void main(String[] args) {
		ValidatePhoneNumber result = (message) -> {
			Pattern p = Pattern.compile("(91)\\s[6-9][0-9]{9}");
			Matcher m = p.matcher(message);
			
			if(m.find())
				return "Valid";
			else
				return "Invalid";
		};
		System.out.println("Entered Phone Number is " +result.ValidatePhoneNumber("91 9629789619"));
	}
}
