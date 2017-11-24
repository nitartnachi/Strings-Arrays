/*
 Check if two strings are anagrams, ignore spaces (so can't check for string length equals)
 William Shakespeare and I am Weakish speller are anagrams
 Reactive and Creative are anagrams
 banana and BANANA are anagrams
 * ---------------------------------------------------------------------
 * BIG O Details: time O(str1.length() + str2.length()) -- space O(1)
 */

package com.nitin.algo;

public class Anagrams {
	
	public static void main(String[] args) {
		String first = "William Shakespeare";
		String second = "I am a Weakish speller";
		
		boolean anagrams = areWeAnagrams(first, second);
		if(anagrams)
			System.out.print("Anagrams");
		else
			System.out.print("NOT Anagrams"); 
	}

	private static boolean areWeAnagrams(String first, String second) {
		if( (first == null && second == null) || (first.length() == 0 && second.length() == 0) ) 
			return true;
		
		int[] arr = new int[1 << 8];
		char[] firstArray = first.toLowerCase().toCharArray();
		char[] secondArray = second.toLowerCase().toCharArray();
		
		for(char c : firstArray) {
			if(c == ' ')
				continue;
			arr[c]++;
		}
		for(char c : secondArray) {
			if(c == ' ')
				continue;
			arr[c]--;
		}
		
		for(int i : arr)
			if(i != 0)
				return false;
		return true;
	}

}
