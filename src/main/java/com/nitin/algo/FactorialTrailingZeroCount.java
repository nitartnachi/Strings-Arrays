/*
 * Given a number n, count and return the number of zeroes in the factorial of given number n
 * Example n = 5, trailing zero count is 1, n = 10, trailing zero count is 2, n = 15, trailing zero count is 3
 * Example n = 5, 
 */

package com.nitin.algo;

public class FactorialTrailingZeroCount {
	
	public static void  main(String args[]) {
		int n = 100;
		System.out.println("The factorial of number " + n + " has " + countTrailingZeroes(n) + " zeroes.");
	}

	private static int countTrailingZeroes(int n) {
		if(n < 5)
			return 0;
		
		int count = 0;
		for(int i = 5; i <= n; i = i* 5) {
			count = count + n/i;
		}
		return count;
	}

}
