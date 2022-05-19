package com.bridgelabz.userregistration;

public class InvalidFirstNameException extends Exception{
	InvalidFirstNameException(String message){
		System.out.println("Your Entered First Name is Invalid");
	}
}
