/*
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. 
 * Valid operators are +, -, *, /.
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * -----------------------------------------------------------
 * BIG O Details: time O(arr.length) -- space O(arr.length)
 */

package com.nitin.algo;

import java.util.Stack;

public class EvalReversePolish {

	private static int result(String[] arr) {

		// handle error conditions and corner case
		if(arr == null) {
			System.out.println("Server response: Input validation failed, input is null");
			return -1;
		}

		int len  = arr.length;
		if(len < 3) {
			System.out.println("Server response: Input validation failed, length of array is less than the required minimum");
			return -1;
		}

		Stack<String> stk = new Stack<>();
		int op1, op2;

		for(String s : arr) {
			switch(s) {
			case "+":
				if(stk.isEmpty())
					return -1;
				op1 = Integer.valueOf(stk.pop());
				op2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(op1 + op2));
				break;

			case "-":
				if(stk.isEmpty())
					return -1;
				op1 = Integer.valueOf(stk.pop());
				op2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(op2 - op1));
				break;
				
			case "*":
				if(stk.isEmpty())
					return -1;
				op1 = Integer.valueOf(stk.pop());
				op2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(op1 * op2));
				break;
				
			case "/":
				if(stk.isEmpty())
					return -1;
				op1 = Integer.valueOf(stk.pop());
				op2 = Integer.valueOf(stk.pop());
				stk.push(String.valueOf(op2 / op1));
				break;
				
			default:
				stk.push(s);
				break;
					
			}
		}
		if(!stk.isEmpty())
			return Integer.valueOf(stk.pop());
		else
			return -1;

	}

	// test harness
	public static void main(String[] args) {
		//String[] arr = {"2", "1", "+", "3", "*"};
		String[] arr = {"4", "13", "5", "/", "+"};
		System.out.println("The result of the expression is " +  result(arr));
	}
}
