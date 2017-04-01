package com.spoloborota.ocp.lambdas.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapTests {

	public static void main(String[] args) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		System.out.println(counts); // {Jenny=2}
		System.out.println(jenny); // 2
		System.out.println(sam); // null
		
		Map<String, Integer> counts2 = new HashMap<>();
		counts2.put("Jenny2", 15);
		counts2.put("Tom2", null);
		Function<String, Integer> mapper2 = (String k) -> {
			String st = "" + 1;
			Integer ii = counts2.get(k);
			if (Objects.nonNull(ii)) {
				return Integer.parseInt(st);
			} else {
				return 1;
			}
		};
		Integer jenny2 = counts2.computeIfAbsent("Jenny2", mapper2); // 15
		Integer sam2 = counts2.computeIfAbsent("Sam", mapper2); // 1
		Integer tom2 = counts2.computeIfAbsent("Tom2", mapper2); // 1
		System.out.println(counts2); // {Tom=1, Jenny=15, Sam=1}
		
		

	}

}
