/*
 Given a number n, write a function that generates and prints all binary numbers with decimal values from 1 to n.
Examples:
Input: n = 2
Output: 1, 10
Input: n = 5
Output: 1, 10, 11, 100, 101
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumbers {
	
	public static void main(String[] args) {
		int n = 15;
		List<String> numbers = generate(n);
		System.out.println("Binary numbers generated are\n" + numbers.toString());
	}

	private static List<String> generate(int n) {
		if(n < 1)
			return Collections.emptyList();
		List<String> numbers = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();
		queue.add("1");
		
		String str;
		
		while(n-- > 0) {
			str = queue.remove();
			numbers.add(str);
			queue.add(str + "0");
			queue.add(str + "1");
		}
		
		return numbers;
	}

}