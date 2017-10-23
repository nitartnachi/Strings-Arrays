/*
 Check if two strings are anagrams, ignore spaces
 William Shakespeare and I am Weakish speller are anagrams
 Reactive and Creative are anagrams
 * ---------------------------------------------------------------------
 * BIG O Details: time O(str1.length() + str2.length()) -- space O(1)
 */

package com.nitin.algo;

public class Anagrams {
	
	//assumes the string will only have alphabets
	private static boolean areTheyAnagrams(String str1, String str2) {

		// handle error conditions and corner case
		if(str1 == null && str2 == null) 
			return true;
		if( (str1 == null && str2 != null) || (str1 != null && str2 == null) )
			return false;
		if( (str1.isEmpty() && !str2.isEmpty()) || (!str1.isEmpty() && str2.isEmpty()) )
			return false;
		
		int[] arr = new int[26];
		char c;
		
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		//process first str and add/update frequency of each element
		for(int i = 0; i < len1; ++i) {
			c = s1.charAt(i);
			if(c == ' ')
				continue;
			arr[c - 'a']++;
		}
		
		//process second str and delete/update frequency of each element
		for(int i = 0; i < len2; ++i) {
			c = s2.charAt(i);
			if(c == ' ')
				continue;
			arr[c - 'a']--;
		}
		
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != 0)
				return false;
		}
			
		return true;
	}

	// test harness
	public static void main(String[] args) {
		
		String str1 = "William Shakespeare";
		String str2 = "I am a weakish speller";
		
		System.out.println(str1 + " and " +  str2 + " are anagrams: " + areTheyAnagrams(str1, str2));
	}

}
