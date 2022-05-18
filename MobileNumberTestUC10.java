package com.bridgelabz.userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class MobileNumberTestUC10 {

	@Test
	public void test() {
		TestCaseMethodUC10 obj1 = new TestCaseMethodUC10();
		String result = obj1.MobileNumber("91 9629789619");
		assertEquals("Valid",result);
	}

}
