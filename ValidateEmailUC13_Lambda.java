package com.bridgelabz.day_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ValidateEmail{
	String ValidateEmail(String message);
}
public class ValidateEmailUC13_Lambda {
	public static void main(String[] args) {
		ValidateEmail result = (message) -> {
			Pattern p = Pattern.compile("^([a-z0-9]+)(\\.[a-z]+)?@([a-z0-9]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
			Matcher m = p.matcher(message);
			
			if(m.find())
				return "Valid";
			else
				return "Invalid";
		};
		System.out.println(" Entered Email is "+result.ValidateEmail("softramesh29@gmail.com"));
	}
}
