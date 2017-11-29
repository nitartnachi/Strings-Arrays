/*
 * Given a  number n return its factorial
 * fact(5) = 5 * 4 * 3 * 2 * 1;
 * fact(3) = 3 * 2 * 1
 * fact(0) = 1;
 * 
 */

package com.nitin.algo;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 100;
		System.out.println("The factorial of " + n + " is: " + factIterative(n));
		System.out.println("The factorial of " + n + " is: " + factRecursive(n));
	}

	// O(2 to the power n)
	private static double factRecursive(int n) {
		if(n <= 1)
			return 1;
		else
			return n * factRecursive(n-1);
	}

	// O(n)
	private static double factIterative(int n) {
		if(n <= 1)
			return 1;
		
		double result = 1;
		while(n > 1) {
			result = result * n;
			n--;
		}
		return result;
	}

}
