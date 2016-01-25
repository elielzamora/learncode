package com.learncode.datastructure.array;

import java.lang.Integer;
import java.util.Iterator;
/**
 * verison 1 of implementing a dynamic array
 * @version 1.0
 * @author elielzamora
 *
 */
public class DynamicArray <Item> implements Iterable<Item>{
	/**
	 * Stores generic type Item in an array of Object
	 * This array's size is dynamically increase/reduced as needed
	 */
	private Object[] item;
	/**
	 * points to the last item in array
	 * item.length is irrelavent it is only the allocated size
	 */
	private int pointer = 0;
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public DynamicArray(int i){
		Item[] item = (Item[]) new Object[i];
		this.item = item;
	}
	public DynamicArray(Item[] item){
		this.pointer = item.length -1;
		this.item = item;
	}
	public void add(Item item){
		this.ensureSpace(this.size()+1);
		this.pointer++; // last item is shifted one up
		this.item[this.pointer] = item;
		//if
	}
	public void put(int i, Item item){
		this.ensureSpace(i+1);
		if(i > this.pointer) this.pointer = i;
		this.item[this.pointer] = item;
	}
	private void ensureSpace(int i) {
		try{
			if(i < this.sizeAllocated()){
				//
			}else{
				this.copyArray(this.sizeAllocated()* 2);
			}
		}catch(Exception e){// array could not be enlarged
			
		}
	}
	private void copyArray(int p){
		Object[] temp = new Object[p];
		//assert p > pointer
		for(int i = 0; i < this.pointer; i++){
			temp[i] = this.item[i];
		}
		System.out.println("array size changed to: " + p);
		this.item = temp;
	}
	public Item get(int i){
		if(inBounds(i)){
			return (Item) this.item[i];
		}else{
			//throw new ExceedsBoundsException();
			System.out.println("not in bounds, "+ this.pointer);
			return null;
		}
	}
	private boolean inBounds(int i){
		int bound = this.size();
		if (i < bound) return true;
		else return false;
	}
	private int size(){
		return this.pointer + 1;
	}
	private int sizeAllocated(){
		return this.item.length;
	}
	public DynamicArray<Item>.DynamicArrayIterator getIterator(){
		return new DynamicArrayIterator();
	}
	@Override
	public Iterator<Item> iterator() {
		return this.getIterator();
	}
	private class DynamicArrayIterator implements Iterator<Item>{
		private int position = 0;
		public DynamicArrayIterator(){
			
		}
		public Item next(){
			return get(position++); // postfix ++ operator
		}
		public boolean hasNext() {
			if(position <= pointer) return true;
			else return false;
		}
		public void reset(){
			this.position = 0;
		}
	}
	/**
	 * unit test
	 * @param args
	 */
	public static void main(String... args){
		// create a new dynamic array
		DynamicArray<Integer> da = new DynamicArray<Integer>(30);
		for(int i = 0; i < 100; i++){
			da.add(new Integer(i));
		}
		System.out.println(da.size());
		DynamicArray<Integer>.DynamicArrayIterator dai = da.getIterator();
		while(dai.hasNext()){
			Integer integer = dai.next();
			if(integer != null){
				System.out.println(integer.intValue());
			}
		}
//		for(Integer integer : da){
//			System.out.println(integer.intValue());
//		}
		
	}
}
/**		//Item[] item = (Item[]) new Object[i];
		 *  alternate way found to create array list
		 *  java.lang.reflect.Array.newInstance()
			public MyArrayList(Class<E> elementType, int size){
				elements = (E[]) Array.newInstance(elementType, size);
			}
		 */