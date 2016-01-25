package com.learncode.datastructure.math;

public class Vector <T>{
	private Object[] vector;
	public Vector(int i){// creates null vector of size i
		this.vector = new Object[i];
	}
	public Vector(T[] t){
		this.vector = t;
	}
	public T get(int i){
		if (inBounds(i)){
			return (T) this.vector[i];
		}else{
			// throw new sdklfjdskl
			return null;
		}
	}
	public void set(int i, T t){
		if (inBounds(i)){
			this.vector[i] = t; 
		}else{
			// throw new fladslfj
		}
	}
	public int size(){
		return this.vector.length;
	}
	private boolean inBounds(int i) {
		if(i < this.size() && i >= 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
