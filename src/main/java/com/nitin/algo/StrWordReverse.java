/*
 * Given an input string, reverse the string word by word.
 * Given s = "the sky is blue", return "blue is sky the"
 * -----------------------------------------------------------
 * BIG O Details: time O(input.length()) -- space O(1)
 */

package com.nitin.algo;

public class StrWordReverse {

	private static String strReverse(String input) {
		
		//handle error conditions start 
		if(input == null || input.isEmpty())
			return input;
		String temp = input.trim();
		if(!temp.contains(" ")) //only word
			return input;
		//handle error conditions start 
		
		char[] arr = input.toCharArray();
		int len = arr.length;
		int j = 0;
		
		//process the string, reverse each word
		for (int i = 0; i < len; ++i) {
			if(arr[i] == ' ') {
				Utils.reverseChar(arr, j, i-1);
				j = i+1;
			}
		}
		//reverse the last word
		Utils.reverseChar(arr, j, len-1);
		
		//reverse the entire char array again
		Utils.reverseChar(arr, 0, len-1);
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String input = "the sky is blue"; //"test ";
		
		String output = strReverse(input);
		System.out.println("String after reversal is --->> " + output);
	}

}
