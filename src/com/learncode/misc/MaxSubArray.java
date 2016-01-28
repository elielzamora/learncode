package com.learncode.misc;

import java.util.ArrayList;

public class MaxSubArray {
	public ArrayList<Integer> array;
	public static final int LENGTH = 20;
	public MaxSubArray(){
		//this();
	}
	
	public MaxSubArray(ArrayList<Integer> array){
		this.array = array;
	}
	public void bruteForce(){
		int size = this.array.size();
		int a = 0, b =  0, max = 0, total = 0;		
		for(int i = 0; i < size; i++){
			total = 0;
			for(int j = i; j < size; j++){
				if(total > max){
					max = total;
					a = i;
					b = j;
				}
			}
		}
	}
	
	/**
	 * unit test
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
