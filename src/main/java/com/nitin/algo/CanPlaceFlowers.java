/*
 * Suppose you have a long arr in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a arr (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: arr = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: arr = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
 */

package com.nitin.algo;

public class CanPlaceFlowers {
	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,0,0};
		int n = 2;
		System.out.println("Can place flower: " + canPlace(arr, n) );
	}

	private static boolean canPlace(int[] arr, int n) {
		if(arr == null || arr.length <= n) // handle invalid input 
			return false;
		int i = 0;
		while(i < arr.length) {
			if ( 	(arr[i] == 0) // check for empty space
					&& (i == 0 || arr[i - 1] == 0) // handles first element 
					&& (i == arr.length - 1 || arr[i + 1] == 0) ) { // handles last element 
                arr[i++] = 1;
                n--;
            }
            if(n == 0)
                return true;
            i++;
		}
		return false;
	}

}
