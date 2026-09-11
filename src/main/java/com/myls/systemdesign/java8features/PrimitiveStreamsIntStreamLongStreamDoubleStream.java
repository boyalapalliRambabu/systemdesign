package com.myls.systemdesign.java8features;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamsIntStreamLongStreamDoubleStream {

	public static void main(String[] args) {

		List<Integer> nums = List.of(1, 2, 3, 4, 5);

		int sum = nums.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		int sum1 = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum1);

		IntSummaryStatistics stat = nums.stream().mapToInt(Integer::intValue).summaryStatistics();

		System.out.println(stat.getMin());
		System.out.println(stat.getMax());
		System.out.println(stat.getAverage());
		System.out.println(stat.getCount());

		IntStream.range(0, 5).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 5).forEach(System.out::print);

	}

}
