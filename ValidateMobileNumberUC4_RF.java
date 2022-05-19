package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumberUC4_RF {
	public static void main(String[] args) throws InvalidMobileNumberException {
	String mobileNumber = "919629789619";
	Pattern p = Pattern.compile("(91)\\s[6-9][0-9]{9}");
	Matcher m = p.matcher(mobileNumber);
	try {
		if(m.find())
			System.out.println(mobileNumber+ " Entered Mobile Number is valid");
		else
			throw new InvalidMobileNumberException("Invalid Mobile Number");
		}
		catch (Exception e) {
		}
	}
}
