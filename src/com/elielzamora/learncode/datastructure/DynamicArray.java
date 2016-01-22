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
	private int pointer = 0;
	/**
	 * 
	 */
	public DynamicArray(int i){
		this.item = new Object[i];
	}
	public DynamicArray(Item[] item){
		this.item = item;
	}
	public void add(Item item){
		this.ensureSpace(this.size() + 1);
		this.item[pointer + 1] = item;
		//if
	}
	private void ensureSpace(int i) {
		// TODO Auto-generated method stub
		
	}
	public Item get(int i){
		if(inArray(i)){
			return (Item) this.item[i];
		}else{
			//throw new ExceedsBoundsException();
			return null;
		}
	}

	private boolean inArray(int i){
		int size = this.getSize();
		if (i < size) return true;
		else return false;
	}
	private int getSize(){
		return this.item.length;
	}
	public static void main(String... args){
		
	}
}
/**		//Item[] item = (Item[]) new Object[i];
		 *  alternate way found to create array list
		 *  java.lang.reflect.Array.newInstance()
			public MyArrayList(Class<E> elementType, int size){
				elements = (E[]) Array.newInstance(elementType, size);
			}
		 */