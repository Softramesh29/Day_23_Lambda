package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumberUC4 {
	public static void main(String[] args) {
	String mobileNumber = "919629789619";
	Pattern p = Pattern.compile("(91)\\s[6-9][0-9]{9}");
	Matcher m = p.matcher(mobileNumber);
	if(m.find())
		System.out.println(mobileNumber+ " Entered Mobile Number is valid");
	else
		System.out.println(mobileNumber+ " Entered Mobile Number is Invalid");
	}
}
