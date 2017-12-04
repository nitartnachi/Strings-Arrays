/*
 Given a digit string, return all valid words that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
possible words: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Dict: ["be", cd"]
Output: {"be", "cd"}
 */


package com.nitin.algo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ValidWordsFromPhoneKeyPad {

	public static void main(String[] args) {
		Set<String> dict = new HashSet<>();
		dict.add("ago");dict.add("bin");dict.add("bio");
		String input = "246";
		List<String> validWords = numberToWords(input, dict);
		System.out.println("The valid words as per dictionary from given digits are: "+ validWords.toString());
	}

	private static List<String> numberToWords(String digits, Set<String> dict) {
		if(digits == null || dict == null || digits.isEmpty() || dict.isEmpty())
			return Collections.emptyList();

		List<String> result = new ArrayList<>();
		String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

		LinkedList<String> list = new LinkedList<>();
		list.add("");

		for (int i = 0; i < digits.length(); i++) {

			int index = digits.charAt(i) - '2';
			if(index < 0 || index > letters.length)
				continue;
			int size = list.size();

			for (int k = 0; k < size; k++) {
				String tmp = list.remove();
				for (int j = 0; j < letters[index].length(); j++)
					list.add(tmp + letters[index].charAt(j));
			}

		}
		for(String s : list) {
			if(dict.contains(s))
				result.add(s);
		}
		return result;
	}

}
