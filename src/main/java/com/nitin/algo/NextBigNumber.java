/*
 Given an array of positive integers, return the array with next big number
 Ex {1,0,1,2,9} should return {1,0,2,1,9}
 Ex {2,3,9,8,7} should return (2,7,3,8,9}
 * ---------------------------------------------------------------------
 * BIG O Details: time O(n) -- space O(1)
 */

package com.nitin.algo;

import java.util.Arrays;

public class NextBigNumber {
	
	private static void nextBigNumber(int[] arr) {

		// handle error conditions and corner case
		if(arr == null || arr.length < 2)
			return;
		
		// start from right and move till we find a smaller digit on left
		int len = arr.length;
		int currIndx = len - 1;
		
		while(currIndx > 0) {
			if(arr[currIndx-1] < arr[currIndx])
				break;
			currIndx--;
		}
		
		if(currIndx == 0)
			System.out.println("No bigger number possible");
		else {
			int pivot = arr[currIndx- 1], min = currIndx;
			
			//find the minimum on the right side of the pivot
			for (int j = currIndx + 1; j < len; j++) {
                if (arr[j] > pivot && arr[j] < arr[min]) {
                    min = j;
                }
            }
			//swap the pivot with minimum on the right
			Utils.swap(arr, currIndx - 1, min);
			
			//Sort the right side of the pivot
			//Arrays.sort(arr, currIndx, len);
			//actually it can be reversed instead of sorting
			Utils.reverseInt(arr, currIndx, len-1);
		}
	}

	// test harness
	public static void main(String[] args) {
		
		//int[] arr = new int[] {1,0,1,2,9};
		int[] arr = new int[] {2,3,9,8,7};
		//int[] arr = new int[] {};
		nextBigNumber(arr);
		System.out.println("Array with the next big number is : " + Arrays.toString(arr));
	}


}
