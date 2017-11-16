/*
 Given two binary strings, return their sum (also a binary string).
 For example, a = "11", b = "1", the return is "100".
 
 * ---------------------------------------------------------------------------------------
 * BIG O Details: time O(s1.length() + s2.length()) -- space O(s1.length() + s2.length() )
 */

package com.nitin.algo;

public class BinaryAddition {

	static int sum = 0, carry = 0;
	static char c1, c2;
	static StringBuilder sb = new StringBuilder();
	
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
		
		//process the string and return result
		int i = s1.length() - 1;
		int j = s2.length() - 1;
		
		while(i >= 0 && j >= 0) {
			carry = eval(s1.charAt(i), s2.charAt(j));
			i--;
			j--;
		}
		
		if(i < 0) {
			while(j >= 0) {
				carry = eval('0', s2.charAt(j));
				j--;
			}
		}
		else if(j < 0) {
			while(i >= 0) {
				carry = eval(s1.charAt(i), '0');
				i--;
			}
		}
		
		if(carry > 0)
			sb.append(String.valueOf(carry));
		return sb.reverse().toString();
	}

	private static int eval(char c1, char c2) {
		sum = (c1 - '0') + (c2 - '0') + carry;
		switch(sum) {
		case 2:
			sb.append("0");
			carry = 1;
			break;
		case 3:
			sb.append("1");
			carry = 1;
			break;
		default:
			sb.append(String.valueOf(sum));
			carry = 0;
			break;
		}
		return carry;
	}

	// test harness
	public static void main(String[] args) {
		
		String s1 = "111";
		String s2 = "1011";
		
		System.out.println("The binary sum of the given numbers is : " + binarySum(s1, s2));
	}

}
