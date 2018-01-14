/*
 * This is a follow up of Shortest Word Distance. The only difference is now you are given the list of words and your method will be called repeatedly many times 
 * with different parameters. How would you optimize it? Design a class which receives a list of words in the constructor, and implements a method that 
 * takes two words word1 and word2 and return the shortest distance between these two words in the list.
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “coding”, word2 = “practice”, return 3.
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestWordDistanceV2 {
	
	private static Map<String, List<Integer>> map;
	
	public ShortestWordDistanceV2(String[] words) {
		map = new HashMap<String, List<Integer>>();
		for (int i = 0; i < words.length; i++) {
			if(map.containsKey(words[i])){
                map.get(words[i]).add(i);
            }else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(words[i], list);
            }
		}
		
	}
	
	public static int shortestDistance(String word1, String word2) {
		ArrayList<Integer> l1 = (ArrayList<Integer>) map.get(word1);
	    ArrayList<Integer> l2 = (ArrayList<Integer>) map.get(word2);
	 
	    int result = Integer.MAX_VALUE;
	    int i = 0; 
	    int j = 0;
	    while(i < l1.size() && j < l2.size()) {
	        result = Math.min(result, Math.abs(l1.get(i) - l2.get(j)));
	        if(l1.get(i) < l2.get(j))
	            i++;
	        else
	            j++;  
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		ShortestWordDistanceV2 obj = new ShortestWordDistanceV2(words);
		
		String word1 = "makes";
		String word2 = "coding";
		System.out.println("The distance between " + word1 + " and " + word2 + " is: " + shortestDistance(word1, word2));
	}

}
