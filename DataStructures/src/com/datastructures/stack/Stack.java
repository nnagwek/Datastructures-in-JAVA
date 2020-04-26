package com.datastructures.stack;

public interface Stack<E> {
	
	public void push(E e);
	public E pop();
	public Boolean contains(E elementToSearch);
	public int size();
	public E access(E e);
	void ensureCapacity();
	

}
