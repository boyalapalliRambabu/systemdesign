package com.myls.systemdesign.java8features;

import java.util.List;
import java.util.Optional;

public class LazinessAndShortCircuiting {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Optional<Integer> res = nums.stream().filter(n -> {
			return n % 2 == 0;
		}).map(n -> {
			return n * 10;
		}).findFirst();

		System.out.println(res);
	}
}
