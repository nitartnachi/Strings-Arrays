/*
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 * --------------------------------------------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(1)
 */

package com.nitin.algo;

import java.util.Arrays;

public class RotateArray {

	private static void rotateArray(int[] arr, int k) {

		// handle error conditions and corner case
		if(arr == null) {
			System.out.println("Server response: Input validation failed, input is null");
			return;
		}
		
		int len  = arr.length;
		if(len < k) {
			System.out.println("Server response: Input validation failed, length of array is less than " + k);
			return;
		}
		
		// process the array and rotate it
		Utils.reverseInt(arr, 0, k-1); // reverse the k elements
		Utils.reverseInt(arr, k, len-1); // reverse len-k elements
		Utils.reverseInt(arr, 0, len-1); // reverse entire array
		
	}
	
	// test harness
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int k = 4;
		rotateArray(arr, k);
		
		System.out.println("Array after rotation is " + Arrays.toString(arr));
	}

}
