package com.spoloborota.ocp.lambdas.methodlink;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class MethodLink<A, B> {
	
	public void printIt(A a) {
		a = null;
		System.out.println(a);
	}
	public void printIt(String x) {
		System.out.println(x);
	}
	public void printIt(A a, B b) {
		System.out.println(a + "" + b);
	}

	
	public static void main(String[] args) {
		MethodLink<String, Integer> ml = new MethodLink<>();
		BiConsumer<String, Integer> biCons = ml::printIt;
		BiConsumer<String, Integer> biCons3 = (ddddddDjbeeg, QR_eghr) -> {
			ml.printIt(ddddddDjbeeg, QR_eghr);
			System.nanoTime();
		};
		
		biCons.accept("xxx", 20);
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> biCons2 = map::put;
		
		biCons2.accept("xxx", 20);
		
		System.out.println(map);
		
		
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
	}
}
