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
	
	public static void main(String[] args) {

		add(2);
		add(1);
		add(5);
		System.out.print(find(4));
		System.out.println();
		System.out.print(find(7));
		
	}

	private static boolean find(int sum) {
		if(map.isEmpty())
			return false;
		
		int target;
		for(Integer i : map.keySet()) {
			target = sum - i;
			if(map.containsKey(target)) {
				if( i == target && map.get(target) < 2 ) // this condition captures input where you have add(2), add(1), find(4), without this it will return true which is not correct
					continue;
				return true;
			}
		}
		return false;
	}

	private static void add(int num) {
		if(map.containsKey(num))
			map.put(num,  map.get(num) + 1);
		else
			map.put(num,  1);
		
	}

}
