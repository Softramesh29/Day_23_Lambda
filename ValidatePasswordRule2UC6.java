package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordRule2UC6 {
	public static void main(String[] args) {
	String passWord = "AJHSJK";
	Pattern p = Pattern.compile("^(?=.*[A-Z]).{8,}");
	Matcher m = p.matcher(passWord);
	if(m.find())
		System.out.println(passWord+ " Entered Password is valid");
	else
		System.out.println(passWord+ " Entered Password is Invalid");
	}
}
