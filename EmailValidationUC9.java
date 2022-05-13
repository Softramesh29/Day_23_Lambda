package com.bridgelabz.userregistration;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationUC9 {
	public static void main(String[] args) {
	ArrayList<String> emails = new ArrayList<String>();
	emails.add("abc@yahoo.com");
	emails.add("abc-100@yahoo.com");
	emails.add("abc.100@yahoo.com");
	emails.add("abc111@abc.com");
	emails.add("abc-100@abc.net");
	emails.add("abc100.@abc.com.au");
	emails.add("abc@1.com");
	emails.add("abc@gmail.com");
	emails.add("abc+100@gmail.com");
	String regex = "^([a-z0-9]+)(\\.)?(\\-)?(\\+)?([a-z0-9]+)?@([a-z0-9]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
	Pattern pattern = Pattern.compile(regex);
	
	for(String email : emails) {
		Matcher matcher = pattern.matcher(email);
		System.out.println(email+ " : " + matcher.matches()+"\n");
	}

	}
}
