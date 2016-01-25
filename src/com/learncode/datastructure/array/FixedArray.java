package com.learncode.datastructure.array;

public class FixedArray <Item> {
	private Object[] array;
	public FixedArray(int p){
		this.array = new Object[p];
	}
	public FixedArray(Item[] items){
		this.array = items;
	}
	public int size (){
		return this.array.length;
	}
	@SuppressWarnings("unchecked")
	public Item get(int i) /*throws FixedArray<Item>.OutOfBoundsException*/{
		if(i >= size()) return null;//throw new OutOfBoundsException(null, null, false, false);
		else return (Item) this.array[i];
	}
	public void put(int i, Item item){
		if(i >= size()){
			//error do nothing
			// throw new
		}else if(i < 0){
			// error do nothing
			// throw new out of bounds Exception
		}else{
			this.array[i] = item;
		}
	}
	/*
	private class OutOfBoundsException extends Exception{
		public OutOfBoundsException(String message,
		         Throwable cause,
		         boolean enableSuppression,
		         boolean writableStackTrace){
			
		}
	}
	*/
	/**
	 * unit test
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
