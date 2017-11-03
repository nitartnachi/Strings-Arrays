/*
 Find all duplicates from an array, example 1,2,2,4,5,5,5,6,7,8 should return 2,5 
 * -----------------------------------------------------------------------------------------------------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(1) the key is in place with just one pass of the array, will not work for negative numbers in the array.
 * will not work for negative numbers in the array. also the numbers in the array should be less than or equal to length i.e. 0 <= x <= len(array) - 1
 * For negative numbers we can use map solution but it will use extra space.
 * For negative numbers we can use map solution but it will use extra space.
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllDuplicates {

	private static List<Integer> allDuplicates(int[] arr) {
		
		// handle error conditions and corner case
		if(arr == null || arr.length < 2)
			return Collections.emptyList();
		
		int len = arr.length;
		List<Integer> dups = new ArrayList<>();
		
		for(int i = 0; i < len; ++i) {
			int cur = Math.abs(arr[i]);
			if(cur >= len)
				continue;
			if(arr[cur] < 0) 
				dups.add(Math.abs(arr[i]));
			arr[cur] = -arr[cur];
		}
		return dups;
	}

	// test harness
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,3,3,3,2,2,2,4,5,5,5,6,7,8};
		//int[] arr = new int[] {};
		
		System.out.println("The duplicates in the input arrar: " + allDuplicates(arr) );
	}
}
