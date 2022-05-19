package com.bridgelabz.userregistration;

public class InvalidPasswordException extends Exception{
	InvalidPasswordException(String message){
		System.out.println("Your Entered Password is Invalid");
	}
}
