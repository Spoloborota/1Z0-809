package com.spoloborota.ocp.collections;

import java.util.HashMap;
import java.util.Map;

public class GenericMethods {

	
	public static <T> T ship(T t) {
		System.out.println("Preparing " + t);
		return t;
	}
	
	public <S, V> Map<S, V> testGeneric(S s, V v) {
		Map<S, V> map = new HashMap<>();
		map.put(s, v);
		return map;
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		Integer i = new Integer(10);
		String x = new String(" ");
		Map<Integer, String> map = gm.<Integer, String>testGeneric(i, x);
	}

}
