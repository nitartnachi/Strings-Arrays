package com.nitin.algo;

import java.util.Arrays;

public class SpiralMatrix {

	private static void printSpiral(int[][] matrix) {
		
		// handle error conditions and corner case
		if(matrix == null || matrix.length == 0)
			return;
		
		 int row = matrix.length;
		 int col = matrix[0].length;
		 
		 int top = 0, bottom = row -1;
		 int left = 0, right = col -1;
		 
		 while(true) {
			 while(left <= right) {
				 System.out.print(matrix[top][left] + ", ");
				 left++;
			 }
			 
			 top++;
			 while(top <= bottom) {
				 System.out.print(matrix[top][right] + ", ");
				 top++;
			 }
			 
			 break;
		 }
	}
	

	// test harness
	public static void main(String[] args) {

		int[][] matrix = {
							{1,  2,  3,  4, 5},
							{16, 17, 18, 19, 6},
							{15, 24, 25, 20, 7},
							{14, 23, 22, 21, 8},
							{13, 12, 11, 10, 9}
						};
		for (int i = 0; i < matrix.length; ++i)
			System.out.println(Arrays.toString(matrix[i]));
		
		printSpiral(matrix);
	}

}
