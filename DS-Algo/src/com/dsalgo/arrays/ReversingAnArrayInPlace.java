package com.dsalgo.arrays;

import java.util.Arrays;

public class ReversingAnArrayInPlace {

	/*
	 * The problem is that we want to reverse a T[] array in O(N) linear time
	 * complexity and we want the algorithm to be in-place as well - so the
	 * algorithm can not use additional memory!
	 * 
	 * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
	 * 
	 * Good luck!
	 */

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int[] reversed = reverseArrayInPlace(nums);
		System.out.println(Arrays.toString(reversed)); // O/P : [9, 8, 7, 6, 5, 4, 3, 2, 1]

	}
	
	// O(N/2)  = O(N) complexity
	
	public static int[] reverseArrayInPlace(int[] arr) {
		int lowIndex = 0;
		int highIndex = arr.length-1;
		while(lowIndex <= highIndex) {
			int temp = arr[lowIndex];
			arr[lowIndex] = arr[highIndex];
			arr[highIndex] = temp;
			lowIndex++;
			highIndex--;
		}
		return arr;
	}

}
