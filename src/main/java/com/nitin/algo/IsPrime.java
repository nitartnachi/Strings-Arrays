/*
 * Given a positive integer, return true if it is prime, false otherwise
 */

package com.nitin.algo;

public class IsPrime {
	
	public static void main(String[] args) {
		int n = 143;
		System.out.println("The given number is prime: " + isPrime(n));
	}

	private static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		for(int i = 3; i <= Math.sqrt(n); i = i + 2){
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
