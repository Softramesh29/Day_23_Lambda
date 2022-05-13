package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordRule1UC5 {
	public static void main(String[] args) {
	String passWord = "91962975";
	Pattern p = Pattern.compile("[a-z0-9]{8,}");
	Matcher m = p.matcher(passWord);
	if(m.find())
		System.out.println(passWord+ " Entered Password is valid");
	else
		System.out.println(passWord+ " Entered Mobile Password is Invalid");
	}
}
