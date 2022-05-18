package com.bridgelabz.userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameTestUC10 {

	@Test
	public void test() {
		TestCaseMethodUC10 obj1 = new TestCaseMethodUC10();
		String result = obj1.FirstName("Ramesh");
		assertEquals("Valid",result);
	}
	
}
