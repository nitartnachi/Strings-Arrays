package com.nitin.algo;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class PYPL01 {
	
	public static void main(String[] args) {
		int[][] arr = {{16,1}, {1,2}, {1,3}, {1,4},{1,5}, {1,6},{1,8},{9,2},{9,3},{9,4},{9,5},{9,6},{14,10},{10,11},{11,12},{10,13},{11,15},{16,9},{16,14}};//, {3,4}, {5,6}, {5,7}, {6,8}, {7,9}};
		int[] start = {1,9,14};
		ancestors(arr, start);
	}

	private static void ancestors(int[][] arr, int[] start) {
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for(int i = 0; i< arr.length; i++) {
			if(map.containsKey(arr[i][0])) {
				List<Integer> list = map.get(arr[i][0]);
				list.add(arr[i][1]);
				map.put(arr[i][0], list);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(arr[i][1]);
				map.put(arr[i][0], list);
			}		
		}

		for (int i=0; i <start.length; i++){
			System.out.println("output for " + start[i] + "="+getChildren(start[i], map));
		}
	}
	private static  List<Integer> getChildren (int elem, Map<Integer, List<Integer>> map){
		List<Integer> output = new ArrayList<>();
		output.add(elem);
		List<Integer> list = map.get(elem);
		if (list == null){
			return output;
		} 
		for (int i = 0 ; i < list.size() ; i++){
				output.addAll(getChildren(list.get(i), map));
		}
		return output;
	}

}