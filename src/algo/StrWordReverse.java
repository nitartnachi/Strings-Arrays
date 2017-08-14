/*
 * Given an input string, reverse the string word by word.
 * Given s = "the sky is blue", return "blue is sky the"
 */

package algo;

public class StrWordReverse {
	
	// time O(input.length()) -- space O(1)
	
	public static void main(String[] args) {
		String input = "the sky is blue"; //"test ";
		
		String output = strReverse(input);
		System.out.println("String after reversal is --->> " + output);
	}

	private static String strReverse(String input) {
		
		//handle error conditions start 
		if(input == null || input.isEmpty())
			return input;
		String temp = input.trim();
		if(!temp.contains(" ")) //only word
			return input;
		//handle error conditions start 
		
		char[] arr = input.toCharArray();
		int len = arr.length;
		int j = 0;
		
		//process the string, reverse each word
		for (int i = 0; i < len; ++i) {
			if(arr[i] == ' ') {
				reverse (arr, j, i-1);
				j = i+1;
			}
		}
		//reverse the last word
		reverse(arr, j, len-1);
		
		//reverse the entire char array again
		reverse(arr, 0, len-1);
		
		return new String(arr);
	}
	
	private static void reverse(char[] arr, int start, int end) {
		char temp;
		while(end >= start) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}

}
