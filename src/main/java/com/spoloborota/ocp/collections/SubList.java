package com.spoloborota.ocp.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SubList {

	public static void main(String[] args) {

		List<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		Function<List<String>, List<String>> f = list->list.subList(2, 4);
		vowels.forEach(System.out::print);
		System.out.println();
		
		List<String> view = f.apply(vowels);//get a view backed by the original list
		view.forEach(System.out::print); //updates visible in original list
		System.out.println();
		
		view.add("x");//modify the view
		view.remove(0);
		view.forEach(System.out::print); //updates visible in original list
		System.out.println();
		
		vowels.forEach(System.out::print); //updates visible in original list

	}

}
