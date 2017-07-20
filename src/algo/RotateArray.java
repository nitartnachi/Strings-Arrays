/*
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 */

package algo;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(arr, k);
		System.out.println("Array after rotation is " + Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int k) {
		if(arr == null || arr.length == 0)
			return;
		if(k > arr.length)
			k = k % arr.length;
		reverse(0,k-1, arr);
		reverse(k,arr.length-1, arr);
		reverse(0, arr.length-1,arr);
	}

	private static void reverse(int start, int end, int[] arr) {
		int temp;
		while(end >= start) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		
	}

}
