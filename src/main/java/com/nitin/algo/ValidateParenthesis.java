/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

package com.nitin.algo;

import java.util.Stack;

public class ValidateParenthesis {

	public static void main(String[] args) {
		String input1 = "(){}[]";
		String input2 = "(]{}[]";
		String input3 = "([])";
		String input4 = "([)]";

		System.out.println("The string " + input4 + " is valid: " + isValid(input4));
	}

	private static boolean isValid(String input) {
		if(input == null || input.length() == 0)
			return true;

		int len = input.length();
		if(len < 2)
			return false;

		Stack<Character> stk = new Stack<>();
		char[] arr = input.toCharArray();
		for(char c : arr) {
			switch(c) {
				case')':
					if(stk.isEmpty() || stk.pop() != '(' )
						return false;
					break;
				case'}':
					if(stk.isEmpty() || stk.pop() != '{' ) 
						return false;
					break;
				case']':
					if(stk.isEmpty() || stk.pop() != '[' ) 
						return false;
					break;
				default:
					stk.push(c);
					break;
				}

			}
			return (stk.isEmpty()) ? true : false;
		}
}
