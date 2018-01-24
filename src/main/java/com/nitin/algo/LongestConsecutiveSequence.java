/*
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.

Your algorithm should run in O(n) complexity.
 */

package com.nitin.algo;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	
	public static void main(String[] args) {
		int[] arr = {100, 4, 200, 1, 3, 2};
		System.out.println("The longest consecutive elements sequence is: " + longestConsecutiveSequence(arr) );
	}

	private static int longestConsecutiveSequence(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(Integer i : arr)
			set.add(i);
		
		 int maxLen = 1;
		
		for(Integer i : arr) {
			int left = i - 1;
			int right = i + 1;
			int count = 1;
			
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
	 
			maxLen = Math.max(count, maxLen);
		}
		return maxLen;
	}

}
