/*
 * Given two strings s and t, determine if they are isomorphic.
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 */

package algo;

import java.util.HashMap;

public class IsomorphicString {
	public static void main(String[] args) {
		String str1 = "foo";//null;//"egg";
		String str2 = "bar";//null;//"add";
		boolean result = isIsomorphic(str1, str2);
		String resultStr = (result == true) ? "isomorphcic" : "not isomorphic";
		System.out.println(str1 + " and " + str2 + " are " + resultStr);
	}

	private static boolean isIsomorphic(String str1, String str2) {
		//handle error conditions start 
		if(str1 == null && str2 == null)
			return true;
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		//handle error conditions end 
		
		char c1, c2;
		HashMap<Character, Character> map = new HashMap<>();
		for(int i = 0; i < str1.length(); i++) {
			c1 = str1.charAt(i);
			c2 = str2.charAt(i);
			if(!map.containsKey(c1))
				map.put(c1, c2);
			else {
				if(map.get(c1) != c2)
					return false;
			}
		}
		return true;
	}

}
