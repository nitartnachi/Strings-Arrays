/*
 * Find the kth largest element in an unsorted array.
 * For example, given [3,2,1,5,6,4] and k = 2, return 5.
 */

package algo;

import java.util.PriorityQueue;

public class KthLargestUnsortedArray {
	public static void main(String[] args) {
		int[] arr = null;//new int[] {3,2,1,5,6,4};
		int k = 2;
		int kthlarge = kthLargest(arr, k);
		System.out.println("The " + k + "th largest number in the array is " + kthlarge);
	}

	private static int kthLargest(int[] arr, int k) {
		if(arr == null || arr.length == 0)
			return -1;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for(int i = k; i < arr.length; i++) {
			if(arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
