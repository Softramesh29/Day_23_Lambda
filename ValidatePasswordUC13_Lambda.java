package com.bridgelabz.day_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ValidatePassword{
	String ValidatePassword(String message);
}
public class ValidatePasswordUC13_Lambda {
	public static void main(String[] args) {
		ValidatePassword result = (message) -> {
			Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}");
			Matcher m = p.matcher(message);
			
			if(m.find())
				return "Valid";
			else
				return "Invalid";
		};
		System.out.println(" Entered Password is "+result.ValidatePassword("jkbAbkbkj@6565"));
	}
}
