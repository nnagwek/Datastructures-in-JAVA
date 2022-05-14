package com.dsalgo.arrays;

import java.util.Arrays;

public class DutchNationalFlagProblem {

	/*
	 * Dutch national flag problem overview The problem is that we want to sort a
	 * T[] one-dimensional array of integers in O(N) running time - and without any
	 * extra memory. The array can contain values: 0, 1 and 2 (check out the
	 * theoretical section for further information).
	 * 
	 * Good luck!
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 2, 0, 0, 1, 2, 2, 0 };
		int[] ducthProblem = ducthProblem(arr, 1);

		System.out.println(Arrays.toString(ducthProblem));

	}

	public static int[] ducthProblem(int[] arr, int midValue) {

		int frontIndex = 0;
		int lastIndex = arr.length - 1;
		int currentIndex = 0;
		while (currentIndex <= lastIndex) {
			if (arr[currentIndex] < midValue) {
				int temp = arr[frontIndex];
				arr[frontIndex] = arr[currentIndex];
				arr[currentIndex] = temp;
				frontIndex++;
				currentIndex++;
			} else if (arr[currentIndex] > midValue) {
				int temp = arr[lastIndex];
				arr[lastIndex] = arr[currentIndex];
				arr[currentIndex] = temp;
				lastIndex--;
			}else {
				currentIndex++;
			}
			System.out.println(Arrays.toString(arr));
		}

		return arr;
	}

}
