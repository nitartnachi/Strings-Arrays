/*
 * Given a string with brackets. If the start index of the open bracket is given, find the index of the closing bracket.
	Examples:
	Input : string = [ABC[23]][89]
	        index = 0
	Output : 8
	The opening bracket at index 0 corresponds
	to closing bracket at index 8.

 */

package com.nitin.algo;

import java.util.Stack;

public class ClosingBracketIndex {
	
	public static void main(String[] args) {
		String  input = "[ABC[23]][89]";
		int index = 0;
		System.out.println("The closing bracket is present at index: " + findIndex(input, index));
	}

	private static int findIndex(String input, int index) {
		if(input == null || input.isEmpty() || index < 0)
			return -1;
		
		char[] arr = input.toCharArray();
		if(arr[index] != '[')
			return -1;
		
		Stack<Character> stk = new Stack<>();
		stk.push(arr[index]);
		
		for(int i = index + 1; i < arr.length; i++) {
			if(arr[i] == '[')
				stk.push(arr[i]);
			else if (arr[i] == ']'){
				stk.pop();
				if(stk.isEmpty())
					return i;
			}
		}
		return -1;
	}

}
