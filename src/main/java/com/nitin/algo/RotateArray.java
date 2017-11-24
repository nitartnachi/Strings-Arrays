/*
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 * --------------------------------------------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(1)
 */

package com.nitin.algo;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(arr, k);
		
		System.out.println("Array after rotation is " + Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int k) {
		if(arr == null || arr.length < k) {
			System.out.println("Check input and try again");
			return;
		}
		
		int len = arr.length;
		Utils.reverseInt(arr, 0, len - 1);
		Utils.reverseInt(arr, k, len - 1);
		Utils.reverseInt(arr, 0, k-1);
		
	}

}
