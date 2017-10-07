/*
 * Find the kth largest element in an unsorted array.
 * For example, given [3,2,1,5,6,4] and k = 2, return 5.
 * ------------------------------------------------------
 * BIG O Details: time O(arr.length * logk) -- space O(k)
 */

package com.nitin.algo;

import java.util.PriorityQueue;

public class KthLargestUnsortedArray {

	private static int kthLargest(int[] arr, int k) {

		int len = arr.length;
		
		// handle error conditions and corner case
		if(arr == null || len < k) {
			System.out.println("Server response: Input validation failed, check your input and try again");
			return -	1;
		}
		
		//create a min heap of k elements, min heap has the smallest element on top
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; ++i)
			pq.add(arr[i]);
		
		//process the rest of the array
		for(int i = k; i < len; ++i) {
			if(arr[i] > pq.peek()) {// if the array element is less than the top just ignore it.
				pq.poll();
				pq.add(arr[i]);
			}
		}
			
		return pq.peek();
		
	}
	
	// test harness
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,2,1,5,6,4};
		int k = 6;
		int kthlarge = kthLargest(arr, k);
		
		System.out.println("The " + k + "th largest number in the array is " + kthlarge);
	}

}
