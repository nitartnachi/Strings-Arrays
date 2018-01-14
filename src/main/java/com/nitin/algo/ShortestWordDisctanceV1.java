/*
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 */
package com.nitin.algo;

public class ShortestWordDisctanceV1 {
	
	public static void main(String[] args) {
		String[] arr = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "makes";
		String word2 = "coding";
		System.out.println("The distance between " + word1 + " and " + word2 + " is: " + shortestDistance(arr, word1, word2));
	}

	private static int shortestDistance(String[] words, String word1, String word2) {
		if(words == null || words.length == 0)
			return 0;
		int minDistance = Integer.MAX_VALUE;
		int index1 = -1, index2 = -1;
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word1)) {
				index1 = i;
				if(index2 != -1)
					minDistance = Math.min(minDistance, index1 - index2);
			}
			else if(words[i].equals(word2)) {
				index2 = i;
				if(index1 != -1)
					minDistance = Math.min(minDistance, index2 - index1);
			}
		}
		return minDistance;
	}

}
