/*
 Given a collection of intervals, merge all overlapping intervals.
For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {
	
	static class Interval{
		int start;
		int end;
		Interval(int s, int e) {
			start = s;
			end = e;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[").append(String.valueOf(start)).append(", ").append(String.valueOf(end)).append("]");
			return sb.toString();
			
		}
	}
	
	public static void main(String[] args) {
		int [][] arr = { {1,3}, {2,6}, {8, 10}, {15, 18}};
		List<Interval> list = new ArrayList<Interval>();
		for(int i = 0; i < arr.length; i++) {
				list.add(new Interval(arr[i][0], arr[i][1]));
		}
		
		//sort intervals by start value if not sorted
		Collections.sort(list, new Comparator<Interval>() {
			public int compare(Interval a, Interval b){
	            return (Integer.valueOf(a.start)).compareTo(Integer.valueOf(b.start));
	        }
		});

		System.out.print("The intervals after sorting: " + list.toString().toString());
		
		List<Interval> mergedList = mergeIntervals(list);
		System.out.print("\n\nThe intervals after merging: " + mergedList.toString());
	}

	private static List<Interval> mergeIntervals(List<Interval> list) {
		if(list == null || list.isEmpty())
			return Collections.emptyList();
		
		Stack<Interval> stk = new Stack<>();
		for(Interval i : list) {
			if(stk.isEmpty())
				stk.push(i);
			else {
				Interval temp = stk.peek();
				if(temp.end > i.start) {
					stk.pop();
					stk.push(new Interval(temp.start, i.end));
				}else {
					stk.push(i);
				}
			}
		}
		
		List<Interval> mergedList = new ArrayList<>();
		while(!stk.isEmpty()){
			mergedList.add(stk.pop());
		}
			
		Collections.reverse(mergedList);
		return mergedList;
	}

}