package com.dsalgo.arrays;

public class PalindromeProblem {

	/*
	 * "A palindrome is a string that reads the same forward and backward"
	 * 
	 * For example: radar or madam
	 * 
	 * Your task is to design an optimal algorithm for checking whether a given
	 * string is palindrome or not!
	 * 
	 * Good luck!
	 */

	public static void main(String[] args) {
		System.out.println(palindromeTester("radadar"));
	}

	public static Boolean palindromeTester(String str) {
		char[] strArray =  str.toCharArray();
		int frontIndex = 0;
		int lastIndex = strArray.length -1;
		
		while(frontIndex < lastIndex) {
			if(strArray[frontIndex] != strArray[lastIndex]) {
				return false;
			}
			frontIndex ++;
			lastIndex --;
		}
		return true ;
	}

}
