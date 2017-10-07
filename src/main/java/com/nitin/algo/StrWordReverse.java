/*
 * Given an input string, reverse the string word by word.
 * Given s = "the sky is blue", return "blue is sky the"
 * -----------------------------------------------------------
 * BIG O Details: time O(input.length()) -- space O(1)
 */

package com.nitin.algo;

public class StrWordReverse {

	private static String strReverse(String input) {
		
		// handle error conditions and corner case
		if(input == null || input.isEmpty())
			return input;
		String temp = input.trim();
		if(!temp.contains(" ")) // only word
			return input;
		
		char[] array = temp.toCharArray();
		int len = array.length;
		int j = 0;
		
		// process the array
		for (int i = 0; i < len; ++i) {
			if(array[i] == ' ') { // end of word
				Utils.reverseChar(array,  j,  i-1); // reverse the word
				j = i + 1;
			}
		}
		
		// reverse the last word
		Utils.reverseChar(array, j,  len-1);
		
		// reverse the entire array again
		Utils.reverseChar(array,  0,  len-1);
		
		return new String(array);
			
	}
	
	// test harness
	public static void main(String[] args) {
		
		String input = "the sky is blue"; //"test ";
		
		String output = strReverse(input);
		
		System.out.println("String after reversal is --->> " + output);
	}

}
