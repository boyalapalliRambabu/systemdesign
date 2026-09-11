package com.myls.systemdesign.java8features;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassicInterviewProblemsSolvedWithStreams {

	public static void main(String[] args) {
		String text = "the quick brown fox the lazy fox the dog";

		Map<Object, Long> res = Arrays.stream(text.split("\\s+"))
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		System.out.println(res);
	}

}
