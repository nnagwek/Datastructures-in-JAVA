package com.dsalgo.arrays;

public class IntegerReversion {

	public static void main(String[] args) {
		System.out.println(integerReversion(1234));
	}

	public static int integerReversion(int num) {

		int result = 0;
		int remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			result = result * 10 + remainder;
		}

		return result;
	}
}
