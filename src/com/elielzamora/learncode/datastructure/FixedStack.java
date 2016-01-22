/**
 * Ref:
 * http://opensourceforgeeks.blogspot.ca
 * /2013/05/interview-question-10-how-arraylist.html
 * 
 * useful insight, took wrong approach when first creating 
 * dynamic array
 */
package com.elielzamora.learncode.datastructure;

public class FixedStack <Item> {
	private int pointer;
	private int size;
	private Object[] array;
	private static final int DEFAULT_SIZE = 10;
	public FixedStack(){
		this(DEFAULT_SIZE);
	}
	public FixedStack(int i){
		this.size = i;
		this.array = new Object[i];
	}
	public FixedStack(Item[] item){
		this.size = item.length;
		this.array = item;
	}
	public static void main(String args[]){
		
	}
}
