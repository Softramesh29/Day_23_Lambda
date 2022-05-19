package com.bridgelabz.userregistration;

public class InvalidLastNameException extends Exception{
	InvalidLastNameException(String message){
		System.out.println("Your Entered Last Name is Invalid");
	}
}
