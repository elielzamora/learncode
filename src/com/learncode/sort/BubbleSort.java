package com.learncode.sort;

import java.util.ArrayList;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = RandomArray.rndIntArrayGen(10);
		System.out.println("before sort");
		PrintIntArray.print(array);
		bubbleSort(array);
		System.out.println("after sort");
		PrintIntArray.print(array);
	}
	public static <T> void BubbleSort(ArrayList<T> array, Comparable<T> compare){
		
	}
	public static void bubbleSort(int[] array){
		int size = array.length;
		for (int i = 0; i < size-1; i++){
			for(int j = 0; j < size-1; j++){
				if(array[j+1] < array[j]){
					//swap
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp; 
				}
			}
		}
	}
}
