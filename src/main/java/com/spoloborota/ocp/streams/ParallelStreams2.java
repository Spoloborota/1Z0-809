package com.spoloborota.ocp.streams;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreams2 {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger();
		Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
		stream
		.filter( e->{
			ai.incrementAndGet();
			return e.contains("o");
		}).allMatch(x->x.indexOf("o")>0);
		System.out.println("AI = "+ai);
		
		Stream<Integer> s2 = Stream.iterate(10, x -> x + 5).parallel();
		s2.peek(System.out::println).anyMatch(x -> x % 1000001 == 0);
		
	}
}
