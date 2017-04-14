package com.spoloborota.ocp.exceptions;

public class AssertTest {

	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0 : "XXX";
		System.out.println(numGuests);
	}
	
	int addPlusOne (int a, int b) {
//		boolean assert = false;
		assert a++ > 0;
		assert b > 0;
		return a + b;
	}

}
