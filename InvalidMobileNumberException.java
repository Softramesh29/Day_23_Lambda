package com.bridgelabz.userregistration;

public class InvalidMobileNumberException extends Exception{
	InvalidMobileNumberException(String message){
		System.out.println("Your Entered Mobile Number is Invalid");
	}
}
