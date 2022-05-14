package com.dsalgo.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++)
			nums[i] = i;

		for (int i : nums) {
//			if(nums[i] == 2)
//				System.out.println(" Element in Array is "+nums[i]);
		}

		List<String> names = new ArrayList<>();

		names.add("Kevin");
		names.add("Rajan");
		names.add("Muthu");
		names.add("Kochin");
		names.add("Pallavi");

		System.out.println(names);

		System.out.println(names.get(1));

		names.remove(1);

		System.out.println(names);
	}

}
