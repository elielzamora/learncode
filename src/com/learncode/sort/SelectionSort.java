package com.learncode.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = RandomArray.rndIntArrayGen(10);
		System.out.println("before sort");
		PrintIntArray.print(array);
		selectionSort(array);
		System.out.println("after sort");
		PrintIntArray.print(array);
	}
	public static void selectionSort(int[] array){
		int size = array.length;
		int[] sorted = new int[size];
		for(int i = 0; i < size; i++){
			int index = findMin(array, i, size);
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		array = sorted;
	}
	public static int findMin(int[] array, int l, int r){
		int smallest = 1000000;// sentiel value to be very large + infinty
		int index = l;
		for(int i = l; i < r; i++){
			if(array[i] < smallest){
				smallest = array[i];
				index = i;
			}
		}
		return index;
	}
}
