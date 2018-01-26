/*
 * Given two sets represented by two arrays, how to check if the given two sets are disjoint or not? It may be assumed that the given arrays have no duplicates.

Difficulty Level: Rookie

Input: set1[] = {12, 34, 11, 9, 3}
       set2[] = {2, 1, 3, 5}
Output: Not Disjoint
3 is common in two sets.

Input: set1[] = {12, 34, 11, 9, 3}
       set2[] = {7, 2, 1, 5}
Output: Yes, Disjoint
There is no common element in two sets.
 */

package com.nitin.algo;

import java.util.HashSet;
import java.util.Set;

public class DisjointSets {
	
	public static void main(String[] args) {
        int[] set1 = { 12, 34, 11, 9, 3 };
        int[] set2 = { 7, 2, 1, 5 };
 
        boolean result = aredisjoint(set1, set2);
        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

	private static boolean aredisjoint(int[] set1, int[] set2) {
		Set<Integer> set = new HashSet<>();
        for (int i = 0; i< set1.length; i++)
            set.add(set1[i]);
 
        for (int i = 0; i< set2.length; i++)
            if (set.contains(set2[i]))
                return false;
 
        return true;
	}

}
