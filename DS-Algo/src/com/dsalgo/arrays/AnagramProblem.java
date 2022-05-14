package com.dsalgo.arrays;

import java.util.Arrays;

public class AnagramProblem {
	/*
	 * Your task is to construct an algorithm to check whether two words (or
	 * phrases) are anagrams or not!
	 * 
	 * "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,"
	 * + " typically using all the original letters exactly once"
	 * 
	 * For example: restful and fluster are anagrams.
	 * 
	 * Good luck!
	 */

	public static void main(String[] args) {

		System.out.println(anagramTester("restful", "fluster"));
		System.out.println(anagramTester("restful", "fluster12"));

	}

	public static Boolean anagramTester(String first, String second) {
		char[] arr1 = first.toCharArray();
		char[] arr2 = second.toCharArray();

		// Case 1 if lengths do not match then return false
		if (arr1.length != arr2.length)
			return false;
		// O(NlogN)
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// O(N)
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		
		// total =  O(NlogN) + O(N) = O(NlogN)

		return true;
	}
}
