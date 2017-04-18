package com.spoloborota.ocp.lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AllTest {

	public static void main(String[] args) {

		List<CharSequence> ls = Arrays.asList("11", "11", "22", "33", "33", "55", "66");

		//		ls.stream().find

		String[] array = new String[] { "w", "o", "l", "f" };
		String result = "";
		for (String s: array) result = result + s;
		System.out.println(result);

		//		Stream<String> stream = Stream.of("w", "o", "l", "f");
		Stream<Integer> stream = Stream.of(100, 30);
		Integer sum =  (Integer) stream.reduce(30, (s, c) -> (Integer)s + (Integer)c);
		System.out.println(sum);

		Stream<String> s = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);


		List<Integer> str = Arrays.asList(1,2, 3, 4 );
		str.stream().filter(x->{
			System.out.print(x+" ");
			return x>2;
		}).forEach(System.out::println);

	}

}
