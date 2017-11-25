/*
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.
Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.
For the purpose of this problem, we define empty string as valid palindrome.
 */

package com.nitin.algo;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		String input1 = "Red rum, sir, is murder";
		String input2 = "Programcreek is awesome";

		System.out.println("The string " + input1 + " is valid palindrome: " + isValidPalindrome(input1));
	}

	private static boolean isValidPalindrome(String input) {
		if(input == null || input.isEmpty())
			return true;
		
		int i = 0, j = input.length() - 1;
		char[] arr = input.toLowerCase().toCharArray();
		while(i <= j) {
			if(!Character.isLetter(arr[i]) && !Character.isDigit(arr[i])) {
				i++;
				continue;
			}
			if(!Character.isLetter(arr[j]) && !Character.isDigit(arr[j])) {
				j--;
				continue;
			}
			if(arr[i] != arr[j])
				return false;
			i++;j--;
		}
		return true;
	}

}
