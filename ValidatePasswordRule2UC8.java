package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordRule2UC8 {
	public static void main(String[] args) {
	String passWord = "AJHSas$o5JK";
	Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}");
	Matcher m = p.matcher(passWord);
	if(m.find())
		System.out.println(passWord+ " Entered Password is valid");
	else
		System.out.println(passWord+ " Entered Password is Invalid");
	}
}
