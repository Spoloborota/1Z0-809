package com.spoloborota.ocp.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BounceTest {
	static class Sparrow extends Bird { }
	static class Bird { }

	public static void printList(List<? extends Object> list) {
		for (Object x: list) System.out.println(x);
	}
	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);
		
		List<? extends Bird> birds = new ArrayList<Bird>() {{
			add(new Bird()); add(new Sparrow()); 
		}};
		System.out.println(birds);
		
		
		class A {}
		class B extends A { }
		class C extends B { }
		
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		List<? extends B> list4 = new ArrayList<B>();
		
		
		
		List<? super B> list5 = new ArrayList<A>();
		list5.add(new B());
		list5.add(new C());
//		list5.add(new A());
		
		
		
		List<?> list6 = new ArrayList<A>();
		list6.add(null);
		
	}

}
