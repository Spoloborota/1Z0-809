package com.spoloborota.ocp.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestStreamMethods {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(5, 7, 2, 9, 10);
		System.out.println(lst.stream().mapToInt(x -> x).max().getAsInt());
		System.out.println(lst.stream().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}));
		
		
	}

}
