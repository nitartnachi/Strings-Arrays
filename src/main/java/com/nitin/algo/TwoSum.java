/*
 Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 

For example:

Input: numbers={8,7,2,5,3,1}, target=10
Output: (0,2) and (1,4)
----------------------------------------------------------------------------------------------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(arr.length) to create a map
 */
package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	private static List<Integer> twoSum(int[] arr, int sum) {

		// handle error conditions and corner case
		if(arr == null || arr.length < 2) {
			System.out.println("Server response: Input validation failed, input is null");
			return Collections.emptyList();
		}
		
		List<Integer> arrList = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int  i = 0; i < arr.length; ++i) {
			if(map.containsKey(arr[i])) {
				arrList.add(map.get(arr[i]));
				arrList.add(i);
			}
			else {
				map.put(sum - arr[i], i);
			}
		}
		return arrList;
		
	}

	// test harness
	public static void main(String[] args) {

		int[] arr = {8,7,2,5,3,1};
		//int[] arr = {8}; // invalid input
		//int[] arr = {8,7,2,2,3,1}; //duplicates
		int sum = 10;
		List<Integer> arrList = twoSum(arr, sum);
		
		if(arrList.isEmpty()) {
			System.out.println("Server said input not valid");
			return;
		}
		
		System.out.println("Elements at the following indices adds upto the sum");
		for(int i = 0; i < arrList.size() -1; i = i + 2) {
			System.out.println("[" + arrList.get(i) + ", " + arrList.get(i + 1) + "]" );
		}
	}

}
