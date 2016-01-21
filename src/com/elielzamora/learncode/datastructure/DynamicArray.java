package com.elielzamora.learncode.datastructure;
/**
 * verison 1 of implementing a dynamic array
 * @author ezamorapardo2586
 *
 */
public class DynamicArray <Item> {
	private Item[] item;
	
	public DynamicArray(int i){
		Item[] item = (Item[]) new Object[i];
		this.item = item;
		/**
		 * 
			public MyArrayList(Class<E> elementType, int size){
				elements = (E[]) Array.newInstance(elementType, size);
			}
		 */
	}
	public DynamicArray(Item[] item){
		this.item = item;
	}
	public void add(Item item){
		//if
	}
	public Item get(int i){
		if(inArray(i)){
			return this.item[i];
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
