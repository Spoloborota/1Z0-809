package com.spoloborota.ocp.lambdas.streams;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Test;

public class IntermediateOps {

	public static void main(String[] args) {

	}

	@Test
	public void intermediate_filter() {

	    long elementsLessThanThree = Stream.of(1, 2, 3, 4)
	            .filter(p -> p.intValue() < 3).count();

	    assertEquals(2, elementsLessThanThree);
	}
	
	@Test
	public void intermediate_map() {

	    List<String> strings = Stream.of("one", null, "three").map(s -> {
	        if (s == null)
	            return "[unknown]";
	        else
	            return s;
	    }).collect(Collectors.toList());

	    assertThat(strings, contains("one", "[unknown]", "three"));

	}
	
	@Test
	public void count_distinct_words_java8() throws IOException {

	    File file = new File("C:\\Users\\Spoloborota\\Documents\\Logcat\\2017-03-26_22.18\\logcat.log");

	    long uniqueWords = Files
	            .lines(Paths.get(file.toURI()), Charset.defaultCharset())
	            .flatMap(line -> Arrays.stream(line.split(" ."))).distinct()
	            .count();

	    assertEquals(80, uniqueWords);
	}
	
	@Test
	public void intermediate_peek() {

	    List<String> strings = Stream.of("Badgers", "finals", "four").sorted()
	            .filter(s -> s.length() >= 4).peek(s -> System.out.println(s))
	            .map(s -> s.toUpperCase()).collect(Collectors.toList());

	    assertThat(strings, contains("BADGERS", "FINALS", "FOUR"));
	}
	
	@Test
	public void intermediate_distinct() {

	    List<Integer> distinctIntegers = IntStream.of(5, 6, 6, 6, 3, 2, 2)
	            .distinct()
	            .boxed()
	            .collect(Collectors.toList());

	    assertEquals(4, distinctIntegers.size());
	    assertThat(distinctIntegers, contains(
	            5, 6, 3, 2));

	}
	
	@Test
	public void intermediate_sorted() {

	    List<Integer> sortedNumbers = Stream.of(5, 3, 1, 3, 6).sorted()
	            .collect(Collectors.toList());

	    assertThat(sortedNumbers, contains(1, 3, 3, 5, 6));
	}
	
	@Test
	public void intermediate_limit() {

	    List<String> vals = Stream.of("limit", "by", "two").limit(2)
	            .collect(Collectors.toList());

	    assertThat(vals, contains("limit", "by"));
	}
}
