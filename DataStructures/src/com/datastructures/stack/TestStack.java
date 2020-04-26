package com.datastructures.stack;

public class TestStack {

	public static void main(String[] args) {
		
		StackasArray<Integer> stack = new StackasArray<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		
		System.out.println(stack.size());
		
		System.out.println(stack.access(90));
		
		System.out.println(stack.contains(400));
		while(stack.size() > 0) {
			System.out.println(stack.pop());
		}
		
		
		
		

	}

}
