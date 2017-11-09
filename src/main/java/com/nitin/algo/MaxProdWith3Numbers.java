/*
 Given an array of integers, which can contain both +ve and -ve numbers.  maximize the product of any 3 elements of the array. The elements can be non-contiguous.

Some examples:

int[] arr = {-5, -7, 4, 2, 1, 9};  // Max Product of 3 numbers = -5 * -7 * 9
int[] arr2 = {4, 5, -19, 3};       // Max Product of 3 numbers = 4 * 5 * 3
* --------------------------------------------------------------------------------------------------------
* BIG O Details: time O(arr.length) -- space O(1) the key is in place with just one pass of the array, 
* 
 */

package com.nitin.algo;

public class MaxProdWith3Numbers {
	
	private static long maxProd3Num(int[] arr) {
		
		//error handling and corner cases
		if(arr == null || arr.length < 3)
			throw new RuntimeException("Invalid input");
		
		int great = Integer.MIN_VALUE, greater = Integer.MIN_VALUE, greatest = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE, smaller = Integer.MAX_VALUE, smallest = Integer.MAX_VALUE;
		
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			//handle max
			if(arr[i] > greatest) {
				great = greater;
				greater = greatest;
				greatest = arr[i];
			}
			else if(arr[i] > greater) {
				great = greater;
				greater = arr[i];
			}
			else if(arr[i] > great) {
				great = arr[i];
			}
			
			//handle min
			if(arr[i] < smallest) {
				small = smaller;
				smaller = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < smaller) {
				small = smaller;
				smaller = arr[i];
			}
			else if(arr[i] < small) {
				small = arr[i];
			}
		}
		long prod1 = great * greater * greatest;
		long prod2 = smallest * smaller * greatest;
		
		return (prod1 > prod2) ? prod1 : prod2;
	}
	
	// test harness
	public static void main(String[] args) {
		int[] arr = {-5,-7,4,2,1,9};
		//int[] arr = {4,5,-19, 3};
		
		System.out.print("Max product of 3 numbersw is: " + maxProd3Num(arr));
	}

}
