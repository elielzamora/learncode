package com.elielzamora.learncode.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = RandomArray.rndIntArrayGen(10);
		System.out.println("before sort");
		PrintIntArray.print(array);
		array = mergeSort(array);
		System.out.println("after sort");
		PrintIntArray.print(array);
	}
	private static int[] mergeSort(int[] array) {
		return mergeSort(array, 0, array.length);
	}
	private static int[] mergeSort(int[] array, int l, int r) {
		if (array.length == 1){
			return array;
		}else{
			int half = (r-l)/2;
			return merge(mergeSort(array, l, half),
					mergeSort(array, half+1, r));
		}
	}
	private static int[] merge(int[] a1, int[] a2){
		int size = a1.length + a2.length;
		int[] array = new int[size];
		int i = 0;
		int j = 0;
		int s1 = a1.length;
		int s2 = a2.length;
		for(int x =0; x < size; x++){
			if(i < s1 && j < s2){
				if(a1[i]<a2[j]){
					array[x] = a1[i];
					i++;
				}else{
					//array[x] 
				}
			}
		}
		return array;
	}
}
