package com.elielzamora.learncode.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = RandomArray.rndIntArrayGen(10);
		System.out.println("before sort");
		PrintIntArray.print(array);
		insertionSort(array);
		System.out.println("after sort");
		PrintIntArray.print(array);
	}
	public static void insertionSort(int[] array){
		int size = array.length;
		for(int i = 0; i < size; i ++){
			int j = i;
			while((j-1)>=0){
				if (array[j]< array[j-1]){
					//swap
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
				j--;
			}
		}
	}
}
