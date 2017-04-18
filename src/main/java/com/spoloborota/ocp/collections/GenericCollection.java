package com.spoloborota.ocp.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

import javax.net.ssl.ExtendedSSLSession;

public class GenericCollection {

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		List<?> list2 = new ArrayList<Integer>();
		List<? extends Number> list3 = new ArrayList<Integer>();
		list3.add(null);
		List<? super Integer> list4 = new ArrayList<Number>();
		list4.add(new Integer(10));
		ArrayDeque<? extends Number> q = new ArrayDeque<>();
		LinkedList<? extends Number> q2 = new LinkedList<>();
		
		TreeSet<String> treeSet = new TreeSet<>();
		
	}

}
