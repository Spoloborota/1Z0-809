package com.spoloborota.ocp.lambdas.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapNewMethods {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("XXX", new Integer(20));
		map.put("YYY", new Integer(40));
		map.put("ZZZ", new Integer(3));
		map.put("TTT", new Integer(4680));
		
		System.out.println(map);
		
		BiFunction<String, Integer, Integer> remappingFunction = (k, v) -> v > 30 ? v : null;
		System.out.println(map.compute("XXX", remappingFunction));
		System.out.println(map);
		
		Function<String, Integer> mappingFunction = k -> k.length() > 4 ? 4 : 5;
		System.out.println(map.computeIfAbsent("ZZZ", mappingFunction));
		System.out.println(map);
		
		BiFunction<String, Integer, Integer> remappingFunction2 = (k, v) -> v < 5000 ? 5000 : v;
		System.out.println(map.computeIfPresent("TTT", remappingFunction2));
		System.out.println(map);
		
		BiFunction<Integer, Integer, Integer> merge = (v1, v2) -> v1 < v2 ? v2 : v1;
		map.merge("ZZZx", new Integer(4), merge);
		System.out.println(map);
		
//		map.compute("XXX", (k, v) -> {
//			if (((Integer)v) == 20) {
//				System.out.println("v == 20");
//			}
//			return 2000;
//		});
//		
//		map.computeIfAbsent("XXX", (k) -> {
//			if (k == 2000) {
//				System.out.println("a == ");
//			}
//			return "xxx";
//		});
//		
//		map.computeIfPresent("YYY", (a, b) -> {
//			if (((Integer)b) == 40) {
//				System.out.println("b == 40");
//			}
//			return "yyy";
//		});
//		
//		
//		System.out.println(map.getOrDefault("ddd", 50));
//		
//		map.merge("ZZZ", new Integer(60), (oldV, newV) -> {
//			boolean b = old < 50
//			return 
//		});
//		System.out.println(map);
		
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();

			
	}

}
