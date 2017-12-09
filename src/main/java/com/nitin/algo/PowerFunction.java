/*
 * Implement power(x,y)
 * Example 
 * power(2,3) = 8, power(5,2) = 25, power(2, -4) = 1/16
 * 
 */
package com.nitin.algo;

public class PowerFunction {
	
	public static void main(String[] args) {
		int num = 5;
		int pow = -2;
		System.out.println("num raised to pow = " + powerRecursive(num, pow));
		System.out.println("num raised to pow = " + powerIterative(num, pow));
	}

	private static double powerIterative(int num, int pow) {
		if(pow == 0)
			return 1;
		double result = 1;
		boolean isNeg = (pow < 0) ? true : false;
		int absVal = Math.abs(pow);
		while(absVal > 0) {
			result = num * result;
			absVal--;
		}
		return (isNeg) ? 1/result : result;
	}

	private static double powerRecursive(int num, int pow) {
		if(pow == 0)
			return 1;
		double temp = powerRecursive(num, pow/2);
		if(pow % 2 == 0)
			return temp * temp;
		else {
			if(pow > 0)
				return num * temp * temp;
			else
				return (temp * temp)/num;
				
		}
	    
	    }

}
