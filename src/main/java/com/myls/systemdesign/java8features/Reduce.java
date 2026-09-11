package com.myls.systemdesign.java8features;

import java.util.List;
import java.util.Optional;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5);
		Optional<Integer> res = nums.stream().reduce((a, b) -> a + b);
		System.out.println(res.get());

		int res1 = nums.stream().reduce(0, (a, b) -> a + b);
		System.out.println(res1);

		int res2 = nums.parallelStream().reduce(0, (par, n) -> par + n, (sumA, sumB) -> sumA + sumB);
		System.out.println(res2);
	}

}
