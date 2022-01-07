package com.saurabh.string;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx {

	public static void main(String[] args) {

		/*
		 * binarySearch method searching for index of specified element but array should be sorted if not sorted results are undefined 
		 * fill copy elements into specified array update the values in the array if have any
		 * copyOf returns array filled with specified array upto given index.
		 * copyOfRange returns array filled with specified array for given range.
		 * parallelSort method sorts array elements in parallel and merge them after sort.
		 * 
		 */
		int[] a = new int[] {10,1,12,15,14,11,11};
		int[] b = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("Binary search "+Arrays.binarySearch(a, 11));
		System.out.println(Arrays.binarySearch(b, 5, 7, 5));
		int[] c=Arrays.copyOf(a, 5);
		for(int p:c)System.out.println(p);
		Arrays.parallelSort(a);
	}

}
