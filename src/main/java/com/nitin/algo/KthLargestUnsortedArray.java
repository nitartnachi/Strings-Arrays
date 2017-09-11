/*
 * Find the kth largest element in an unsorted array.
 * For example, given [3,2,1,5,6,4] and k = 2, return 5.
 */

package com.nitin.algo;

import java.util.PriorityQueue;

public class KthLargestUnsortedArray {
	
	// time O(arr.length*logk) -- space O(k)
	
	public static void main(String[] args) {
		int[] arr = null;//new int[] {3,2,1,5,6,4};
		int k = 2;
		int kthlarge = kthLargest(arr, k);
		System.out.println("The " + k + "th largest number in the array is " + kthlarge);
	}

	private static int kthLargest(int[] arr, int k) {
		//handle error conditions start 
		if(arr == null || arr.length == 0)
			return -1;
		//handle error conditions end 
		
		//create a min heap of size k
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		
		// process rest of the elements in the array
		for(int i = k; i < arr.length; i++) {
			if(arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
