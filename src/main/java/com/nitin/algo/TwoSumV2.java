/*
 Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

For example,

add(1); 
add(3); 
add(5);
find(4) -> true
find(7) -> false

----------------------------------------------------------------------------------------------------------------------------------------------
 * BIG O Details: time O(n) -- space O(n) to create a map
 */

package com.nitin.algo;

import java.util.HashMap;
import java.util.Map;

public class TwoSumV2 {

	private static Map<Integer, Integer> map = new HashMap<>();
	

	private static void add(int num) {
		
		if(map.containsKey(num))
			map.put(num,  map.get(num) + 1);
		else
			map.put(num,  1);
		
	}

	private static boolean find(int sum) {

		// handle error conditions and corner case
		if(map.isEmpty())
			return false;
		
		for(Integer i : map.keySet()) {
			if(map.containsKey(sum - i))
				return true;
		}
		return false;
		
	}

	// test harness
	public static void main(String[] args) {

		add(1);
		add(3);
		add(5);
		System.out.print(find(4));
		System.out.println();
		System.out.print(find(7));
		
	}
}
