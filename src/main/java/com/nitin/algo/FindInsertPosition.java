/*
 Given a sorted array and a target value, return the index if the target is found. 
 If not, return the index where it would be if it were inserted in order. You may assume no duplicates in the array.
Here are few examples.
[1,3,5,6], 5 -> 2
[1,3,5,6], 2 -> 1
[1,3,5,6], 7 -> 4
[1,3,5,6], 0 -> 0
 */

package com.nitin.algo;

public class FindInsertPosition {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int index = findPosition(arr, 0);
		System.out.println("The element is present/will  be inserted at the position: " + index);
	}

	private static int findPosition(int[] arr, int target) {
		if(arr == null || target < arr[0])
			return 0;
		if(target > arr[arr.length -1])
			return arr.length;
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end  - start)/2;
			if(target > arr[mid]) {
				start = mid + 1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else
				return mid;
		}
		return start;
	}
}