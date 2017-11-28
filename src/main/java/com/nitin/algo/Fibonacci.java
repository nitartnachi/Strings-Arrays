/*
 * Given a  number n return the nth numbers in fibonacvi sequence
 * 0,1,1,2,3,5,8,13,21,34,55.....
 * n = 0 return 0
 * n = 1 return 1
 * n = 2 return 2;
 * n = 8 return 21
 * 
 */

package com.nitin.algo;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println("The " + n + "th number in fibonacci sequence is: " + fibIterative(n));
		System.out.println("The " + n + "th number in fibonacci sequence is: " + fibRecursive(n));
	}

	// O(2 to the power n)
	private static int fibRecursive(int n) {
		if(n <= 1)
			return n;
		else
			return fibRecursive(n-1) + fibRecursive(n - 2);
	}

	// O(n)
	private static int fibIterative(int n) {
		if(n <= 1)
			return n;
		
		int lastlast = 0, last = 1, result = 0;
		for(int i = 2; i <= n; i++) {
			result = last + lastlast;
			lastlast = last;
			last = result;
		}
		return result;
	}

}
