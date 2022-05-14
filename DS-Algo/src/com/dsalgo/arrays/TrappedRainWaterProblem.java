package com.dsalgo.arrays;

public class TrappedRainWaterProblem {

	/*
	 * Trapping rain water problem overview Given n non-negative integers
	 * representing an elevation map where the width of each bar is 1. Compute how
	 * much water it can trap after raining!
	 * 
	 * 
	 * Here the elevation map (the input for the algorithm) is [4,1,3,1,5] and the
	 * output is the total units of trapped rain water - which is 7.
	 * 
	 * Good luck!
	 */

	public static void main(String[] args) {
		int[] rains = { 4, 1, 3, 1, 5 };
		System.out.println(solveTrappingProblem(rains));
	}

	// dynamic programing approcah - memoizations
	public static int solveTrappingProblem(int[] heights) {
		if (heights.length < 3) {
			return 0;
		}

		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];

		leftMax[0] = 0;

		for (int i = 1; i < leftMax.length; i++) {
			leftMax[i] = Math.max(heights[i - 1], leftMax[i - 1]);
		}

		rightMax[heights.length - 1] = 0;
		for (int i = heights.length - 2; i >= 0; i--) {
			rightMax[i] = Math.max(heights[i + 1], rightMax[i + 1]);
		}
		int trappedWater = 0;

		for (int i = 0; i < heights.length; i++) {
			if (Math.min(rightMax[i], leftMax[i]) > heights[i]) {
				trappedWater += Math.min(rightMax[i], leftMax[i]) - heights[i];
			}
		}

		return trappedWater;
	}

}
