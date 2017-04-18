package com.spoloborota.ocp.collections;

import java.util.Arrays;

public class SearchingAndSorting {

	public static void main(String[] args) {
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers); // [1,6,8,9]
		System.out.println(Arrays.binarySearch(numbers, 6)); // 1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		
		Shippable s = new ShippableImpl<>();
	}

}
