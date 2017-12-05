/*
 * Reverse an integer, 123456 should return as 654321,-123 should be -321, if it crosses max value of integer than return max
 */

package com.nitin.algo;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int n = -1234567895;
		System.out.println("Number after reversing: " + reverseInt(n));
	}

	private static int reverseInt(int n) {
		if (n == 0)
			return 0;
		
		boolean isNeg = false;
		if( n < 0)
			isNeg = true;
		int num = Math.abs(n);
		long result = 0;
		
		while(num > 0) {
			int mod = num % 10;
			result = result * 10 + mod;
			num = num / 10;
		}
		
		if(isNeg)
			result = -result;
		
		if(result > Integer.MAX_VALUE)
			result = Integer.MAX_VALUE;
		else if(result < Integer.MIN_VALUE)
			result = Integer.MIN_VALUE;
		
		return (int)result;
	}
	

}
