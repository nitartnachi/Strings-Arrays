/*
 * Given two strings s and t, determine if they are isomorphic.
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 * ----------------------------------------------------------------------------------------
 * BIG O Details: time O(string1.length() + string2.length()) -- space O(string1.length())
 */

package com.nitin.algo;

import java.util.HashMap;

public class IsomorphicString {

	private static boolean isIsomorphic(String str1, String str2) {
		
		// handle error conditions and corner case
		if( (str1 == null && str2 == null) || str1.equals(str2))
			return true;
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		
		// process the two strings
		char c1, c2;
		HashMap<Character, Character> map = new HashMap<>();
		
		for(int i= 0; i < str1.length(); ++i) {
			c1 = str1.charAt(i);
			c2 = str2.charAt(i);
			if(!map.containsKey(c1))
				map.put(c1,  c2);
			else {
				
				// each character in string 1 should be mapped to the same character in string 2, else return false
				if(map.get(c1) != c2)
					return false;
			}
		}
		
		return true;
	}
	
	// test harness
	public static void main(String[] args) {
		
		String str1 = "abcdabcdabc";//"foo";//null;//"egg";
		String str2 = "wxyzwxyzwxy";//"bar";//null;//"add";
		boolean result = isIsomorphic(str1, str2);
		
		String resultStr = (result == true) ? "isomorphcic" : "not isomorphic";
		System.out.println(str1 + " and " + str2 + " are " + resultStr);
	}

}
