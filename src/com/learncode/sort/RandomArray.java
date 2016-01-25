package com.learncode.sort;

public class RandomArray {
	private static int span = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] rndIntArrayGen(int size){
		int[] array = new int[size];
		for(int i = 0; i < size; i++){
			array[i] = (int)(Math.random() * (span));
		}
		return array;
	}
}
