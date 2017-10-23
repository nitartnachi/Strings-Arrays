/*
 Given two binary strings, return their sum (also a binary string).
 For example, a = "11", b = "1", the return is "100".
 */

package com.nitin.algo;

public class BinaryAddition {
	
	private static String binarySum(String s1, String s2) {

		// handle error conditions and corner case
		if(s1 == null || s1.isEmpty()) {
			if(s2 == null)
				return null;
			else {
				if(s2.isEmpty())
					return null;
				else
					return s2;
			}
		}
		
		if(s2 == null || s2.isEmpty()) {
			if(s1.isEmpty())
				return null;
			else
				return s1;
		}
		return null;
	}

	// test harness
	public static void main(String[] args) {
		
		String s1 = "11";
		String s2 = "1";
		
		System.out.println("The binary sum of the given numberts is : " + binarySum(s1, s2));
	}

}
