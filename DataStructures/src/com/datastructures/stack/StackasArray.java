package com.datastructures.stack;

import java.util.Arrays;

public class StackasArray<E> implements Stack<E> {

	private int stackpointer;
	private E[] data;

	@SuppressWarnings("unchecked")
	public StackasArray() {
		data = (E[]) new Object[1000];
	}

	@Override
	public void push(E elementAdded) {
		if (stackpointer == data.length) {
			ensureCapacity();
		}
		data[stackpointer++] = elementAdded;
	}

	@Override
	public E pop() {
		if (stackpointer == 0) {
			throw new IllegalStateException("Element cannot be removed Stack is already empty.");
		}
		return data[--stackpointer];
	}

	@Override
	public Boolean contains(E elementToSearch) {
		Boolean elementFound = false;
		for( int i=0 ; i<stackpointer; i++) {
			if (data[i].equals(elementToSearch)) {
				elementFound = true;
				break;
			}
		}
		return elementFound;
	}

	@Override
	public int size() {
		return stackpointer;
	}

	@Override
	public E access(E e) {
		while (stackpointer > 0) {
			E item = pop();
			if (item.equals(e)) {
				return item;
			}
		}
		throw new IllegalStateException("Element not in the Stack.");

	}

	@Override
	public void ensureCapacity() {
		int newLength = data.length * 2;
		data = Arrays.copyOf(data, newLength);
	}

}
