package com.myls.systemdesign.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample2 {

//	The five ways, side by side

	public static void main(String[] args) throws IOException {
		// Different ways to create streams

		// 1.From a Collection — by far the most common
		List<Integer> nums = List.of(1, 3, 6, 7);
		Stream<Integer> numsStream = nums.stream();

		// 2. From explicit values
		Stream<String> s1 = Stream.of("A", "B", "C");

		// 3. From an array
		int arr[] = { 2, 4, 6 };
		IntStream s3 = Arrays.stream(arr);

		// 4. Generative — INFINITE, must be bounded with limit()
		Stream<Integer> s4 = Stream.iterate(1, n -> n * 2).limit(5);
		Stream<Double> s5 = Stream.generate(Math::random).limit(3);
		// 5. External resource — MUST be try-with-resources, it holds an open file
		// handle
		try (Stream<String> lines = Files.lines(Path.of("data.txt"))) {
			lines.forEach(System.out::println);
		}

	}

}
