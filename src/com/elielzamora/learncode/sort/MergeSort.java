/**
 * https://en.wikipedia.org/wiki/Merge_sort
 * www.algorithmist.com/index.php/Merge_sort
 */
package com.elielzamora.learncode.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = RandomArray.rndIntArrayGen(8);
		System.out.println("before sort");
		PrintIntArray.print(array);
		System.out.println("after sort");
		array = mergeSort(array);
		PrintIntArray.print(array);
	}
//	public static boolean unitTest(){
//		
//		return result;
//	}
	private static int[] mergeSort(int[] array) {
		return mergeSort(array, 0, array.length-1);
	}
	private static int[] mergeSort(int[] array, int l, int r) {
		if ((r-l) == 1){
			int[] a = new int[1];
			a[0] = array[l];
			return a;
		}else{
			int half = (int) Math.floor((r-l)/2) + l;
			System.out.println("l: "+ l+ " r: "+ r + " half: " + half);
			return merge(mergeSort(array, l, half),
					mergeSort(array, half+1, r));
		}
	}
	private static int[] merge(int[] a1, int[] a2){
		int size = a1.length + a2.length;
		System.out.println(size);
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
				}else if (a1[i] >= a2[j]){
					array[x] = a2[j];
					j++;
				}
			}else if(i < s1 && j >= s2){
				array[x] = a1[i];
			}else if (i >= s1 && j < s2){
				array[x] = a2[j];
			}else{
				// no cases apply there must be an error
				System.out.println("error");
			}
		}
		for(int x = 0; x < size; x++){
			System.out.print(array[x] + " ");
		}
		System.out.print("\n");
		return array;
	}
}
