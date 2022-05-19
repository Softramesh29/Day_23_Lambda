package com.bridgelabz.userregistration;

public class InvalidEmailException extends Exception{
	InvalidEmailException(String message){
		System.out.println("Your Entered Email is Invalid");
	}
}
