/*
 Given an array of positive integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, 
 and it should return false if every element is distinct. elements min and max are as follows 0 <= x <= len(array) - 1
 * ------------------------------------------------------------------------------------------------------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(1) the key is in place with just one pass of the array, 
 * will not work for negative numbers in the array. also the numbers in the array should be less than or equal to length i.e. 0 <= x <= len(array) - 1
 * For negative numbers we can use map solution but it will use extra space.
 */

package com.nitin.algo;

public class ArrayDuplicatesV1 {
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7, 8,0, 6, 4};
		System.out.println("The input array has duplicates: " + hasDuplicates(arr));
	}

	private static boolean hasDuplicates(int[] arr) {
		
		if(arr == null || arr.length < 2)
			return false;
		
		int len = arr.length;
		int curr = 0;
		
		for(int i : arr) {
			curr = Math.abs(i);
			if (curr >= len)
				throw new RuntimeException("Invalid input");
			if(arr[curr] < 0)
				return true;
			arr[curr] = -arr[curr];
		}
		return false;
	}

}
