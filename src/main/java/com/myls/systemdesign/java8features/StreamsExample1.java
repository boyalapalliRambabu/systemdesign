package com.myls.systemdesign.java8features;

import java.util.List;
import java.util.stream.Stream;

public class StreamsExample1 {

	public static void main(String[] args) {

		List<String> names = List.of("Haj", "jska", "kjsakd");

		for (String name : names) {
			System.out.println(name);
		}
		for (String name : names) {
			System.out.println(name);
		}

		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);

	}

}
