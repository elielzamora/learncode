package com.elielzamora.learncode.datastructure;
/**
 * verison 1 of implementing a dynamic array
 * @version 1.0
 * @author elielzamora
 *
 */
public class DynamicArray <Item> {
	/**
	 * Stores generic type Item in an array of Object
	 * This array's size is dynamically increase/reduced as needed
	 */
	private Object[] item;
	/**
	 * 
	 */
	private int size;
	/**
	 * 
	 */
	private int next;
	public DynamicArray(int i){
		//Item[] item = (Item[]) new Object[i];
		this.item = item;
		
	}
	public DynamicArray(Item[] item){
		this.item = item;
	}
	public void add(Item item){
		this.ensureSpace(size+1);
		this.item[size] = item
		//if
	}
	public Item get(int i){
		if(inArray(i)){
			return (Item) this.item[i];
		}else{
			//throw new ExceedsBoundsException();
			return null;
		}
	}
	private void halveSize(){
		
	}
	private void doubleSize(){
		
	}
	private boolean inArray(int i){
		int size = this.getSize();
		if (i < size) return true;
		else return false;
	}
	private int getSize(){
		return this.item.length;
	}
}
/**
		 *  alternate way found to create array list
		 *  java.lang.reflect.Array.newInstance()
			public MyArrayList(Class<E> elementType, int size){
				elements = (E[]) Array.newInstance(elementType, size);
			}
		 */