package com.spoloborota.ocp.lambdas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFuncInterfaces {
	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		System.out.println(d1);
		System.out.println(d2);
		
		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		
		Predicate p = i -> (Integer)i == 20;
		BinaryOperator bo = (x, y) -> (Integer)(x) + (Integer)(y);
		
		
	}
}
