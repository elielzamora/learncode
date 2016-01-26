/**
 * Ref:
 * http://opensourceforgeeks.blogspot.ca
 * /2013/05/interview-question-10-how-arraylist.html
 * 
 * useful insight, took wrong approach when first creating 
 * dynamic array
 */
package com.learncode.datastructure.basic;

public class FixedStack <Item> {
	private int pointer = -1; // no items
	private Object[] array;
	private static final int DEFAULT_SIZE = 100;
	public FixedStack(){
		this(DEFAULT_SIZE);
	}
	public FixedStack(int i){
		this.array = new Object[i];
	}
	public FixedStack(Item[] item){
		this.array = item;
		this.pointer = this.size() -1;
	}
	public int size(){
		return this.array.length;
	}
	public void push(Item item){
		if(!this.full()){
			this.pointer++;
			this.array[pointer] = item;
		}else{
			//error do nothing
			//throw new StackOverflowException
		}
	}
	@SuppressWarnings("unchecked")
	public Item pop(){
		if(this.pointer >= 0){
			pointer--;
			return (Item) this.array[pointer+1];
		}else{
			//do nothing
			//throw new empty array 
			return null;
		}
	}
	public boolean full(){
		if (this.pointer == this.size()-1){
			return true;
		}else{
			return false;
		}
	}
	@SuppressWarnings("unchecked")
	public Item peek(){
		return (Item) this.array[pointer];
	}
	public static void main(String args[]){
		//create new fixed stack
		FixedStack<Integer> fs = new FixedStack<Integer>();
		fs.push(new Integer(1));
		fs.push(new Integer(2));
		fs.push(new Integer(3));
		System.out.println(fs.pop());
		System.out.println(fs.peek());
		fs.push(4);
		System.out.println(fs.pop()+" "+fs.pop()+" " +fs.pop());
	}
}
