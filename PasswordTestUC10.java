package com.bridgelabz.userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTestUC10 {

	@Test
	public void test() {
		TestCaseMethodUC10 obj1 = new TestCaseMethodUC10();
		String result = obj1.Password("Softramesh29#");
		assertEquals("Valid",result);
	}

}
