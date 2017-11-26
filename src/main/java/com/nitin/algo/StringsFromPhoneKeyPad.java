/*
 Given a digit string, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

package com.nitin.algo;

import java.util.Collections;
import java.util.List;

public class StringsFromPhoneKeyPad {
	
	public static void main(String[] args) {
		String input = "23";
		List<String> list = wordsFromPhoneKeyPad(input);
		System.out.println("The string for count and say is: " + list.toString());
	}

	private static List<String> wordsFromPhoneKeyPad(String input) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}