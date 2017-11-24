/*
 Given an array of numbers, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
  --------------------------------------------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(1)
 */

package com.nitin.algo;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = new int[] {1,0,1,1,2,0,3,12};
		//int[] arr = new int[] {};
		moveZeroes(arr);
		System.out.println("Arrqy after processing is: " +  Arrays.toString(arr) );
	}

	private static void moveZeroes(int[] arr) {
		if(arr == null || arr.length < 2)
			return;
		
		int firstZero = 0;
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != 0) {
				Utils.swap(arr, i, firstZero);
				firstZero++;
			}
		}
	}

}
