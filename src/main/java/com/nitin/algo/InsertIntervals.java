/*
 Given a set of non-overlapping & sorted intervals, insert a new interval into the intervals (merge if necessary).
Example 1:
Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import com.nitin.algo.MergeIntervals.Interval;

public class InsertIntervals {
	
	public static void main(String[] args) {
		int [][] arr = { {1,3}, {6,9}};
		//int [][] arr = { {1,3}, {6,9}, {8, 10}, {15, 18}};
		List<Interval> list = new ArrayList<Interval>();
		for(int i = 0; i < arr.length; i++) {
				list.add(new Interval(arr[i][0], arr[i][1]));
		}
		Interval toInsert = new Interval(2,5);
		List<Interval> mergedList = mergeInsertIntervals(list, toInsert);

		System.out.print("The intervals after mergeInsert: " + mergedList.toString().toString());
	}

	private static List<Interval> mergeInsertIntervals(List<Interval> list, Interval toInsert) {
		if(list == null || list.isEmpty())
			return Collections.emptyList();
		
		List<Interval> mergedList = new ArrayList<>();
		
		for(Interval i : list) {
			if(i.end < toInsert.start)
				mergedList.add(i);
			else if(i.start > toInsert.end) {
				mergedList.add(toInsert);
				toInsert = i;
			}
			else if(i.end >= toInsert.start || i.start <= toInsert.end) {
				toInsert = new Interval(Math.min(i.start, toInsert.start), Math.max(toInsert.end, i.end));
            }
        }
 
        mergedList.add(toInsert); 
 
        return mergedList;
    }

}