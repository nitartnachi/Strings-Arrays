/*
 * /*
Write a program which helps a word puzzle player, who must attempt to form a valid English word with letters in order to score points.

The program should run like this:

$ ./WordPuzzle
What letters? care
acer -> [acre, care, crea, race]

What letters? silent
[enlist, listen, silent, tinsel]

In order for your program to determine what words are valid English words, you should read from a text file called "/usr/share/dict/words".
This file contains a dictionry of English words of all lengths.
Each word is on its own line in the file.
 */

package com.nitin.algo;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFinder {
	private static final String WORDS_PATH = "/usr/share/dict/words";
	static Map<String, List<String>> map;

	public WordFinder() throws IOException {
		map = new HashMap<>();
		
		String line;
		InputStream fis = new FileInputStream(WORDS_PATH);
		BufferedReader dictReader = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
		
		List<String> val;
		while ((line = dictReader.readLine()) != null){
			char[] arr = line.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);
			
			if(map.containsKey(key)){
				val = map.get(key);
				val.add(line);
				map.put(new String(arr), val );
			}
			else{
				val = new ArrayList<>();
				val.add(line);
				map.put(new String(arr), val);
			}
		}

		// Done with the file
		dictReader.close();
		dictReader = null;
		fis = null;
	}

	public static void main(String[] args) throws IOException {
		new WordFinder();
		String input = "care";
		char[] array = input.toCharArray();
		Arrays.sort(array);
		String key = new String(array);
		System.out.println( map.get(key).toString() );
	}
}
