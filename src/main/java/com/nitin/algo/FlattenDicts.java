/*
 * Write a function to flatten array of dicts example_input:
 * example_input= [{a:{b:{c:{d:'e'}}}}, {a:{b:{c:{d:{e:'f'}}}}}]
 * example_output: [{a_b_c_d:'e'}, {a_b_c_d_e:'f'}]
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.List;

public class FlattenDicts {
	
	static class Dict{
		List<Pair> pairs;
	}
	
	static class Pair{
		public Pair(String key, Dict value) {
			this.key = key;
			this.value = value;
		}
		String key;
		Dict value;
	}
	
	Dict flatten(Dict dict) {
	    Dict newDict = new Dict();
	    for (Pair pair : dict.pairs) {
	        if (pair.value == null)
	            newDict.pairs.add(pair);
	        else
	            newDict.pairs.addAll(combine(pair.key, flatten(pair.value)));
	    }
	    
	    return newDict;
	}

	List<Pair> combine(String key, Dict value) { //here value is a flattened dict
	    List<Pair> pairs = new ArrayList<Pair>();
	    for (Pair pair : value.pairs) {
	        pairs.add(new Pair(key + "_" + pair.key, pair.value));
	    }
	    return pairs;
	}
	
	public static void main(String[] args) {
		
	}

}
