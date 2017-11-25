/*
 Sort the binary array in O(n) and constant space
 Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
 Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
 */


package com.nitin.algo;

import java.util.Arrays;

public class SortBinaryArray {
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		sortArray(arr);
		System.out.println("Array after sorting: " + Arrays.toString(arr));
	}

	private static void sortArray(int[] arr) {
	
		if(arr == null || arr.length < 2)
			return;
		int len = arr.length, firstOne = 0, i = 0;
		while(i++ < len) {
			if(arr[i] == 1) {
				firstOne = i;
				break;
			}
		}
		
		for(;i < len; i++) {
			if(arr[i] == 0)
				Utils.swap(arr, firstOne++, i);
		}
	}

}