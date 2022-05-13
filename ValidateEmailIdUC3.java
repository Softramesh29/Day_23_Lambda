package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailIdUC3 {
	public static void main(String[] args) {
	String emailId = "ramesh.ram@gmail.co.in";
	Pattern p = Pattern.compile("^([a-z0-9]+)(\\.[a-z]+)?@([a-z0-9]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
	Matcher m = p.matcher(emailId);
	if(m.find())
		System.out.println(emailId+ " Entered Email Id is valid");
	else
		System.out.println(emailId+ " Entered Email Id is Invalid");
	}
}
