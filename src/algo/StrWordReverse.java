/*
 * Given an input string, reverse the string word by word.
 * Given s = "the sky is blue", return "blue is sky the"
 */

package algo;

import java.util.Arrays;

public class StrWordReverse {
	public static void main(String[] args) {
		String input = "the sky is blue";
		
		String output = strReverse(input);
		System.out.println("String after reversal is --->> " + output);
	}

	private static String strReverse(String input) {
		if(input == null || input.isEmpty())
			return input;
		String temp = input.trim();
		if(!temp.contains(" "))
			return input;
		
		char[] arr = temp.toCharArray();
		int len = arr.length;
		return null;
	}

}
