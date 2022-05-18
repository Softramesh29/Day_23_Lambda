package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCaseMethodUC10 {
	public String FirstName(String name) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher m = p.matcher(name);
		if(m.find())
			return "Valid";
		else
			return "Invalid";
	}
	public String LastName(String name) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher m = p.matcher(name);
		if(m.find())
			return "Valid";
		else
			return "Invalid";
	}
	public String EmailId(String email) {
		Pattern p = Pattern.compile("^([a-z0-9]+)(\\.[a-z]+)?@([a-z0-9]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
		Matcher m = p.matcher(email);
		if(m.find())
			return "Valid";
		else
			return "Invalid";
		
	}
	public String MobileNumber(String number) {
		Pattern p = Pattern.compile("(91)\\s[6-9][0-9]{9}");
		Matcher m = p.matcher(number);
		if(m.find())
			return "Valid";
		else
			return "Invalid";
	}
	public String Password(String passWord) {
		Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}");
		Matcher m = p.matcher(passWord);
		if(m.find())
			return "Valid";
		else
			return "Invalid";
	}
}
