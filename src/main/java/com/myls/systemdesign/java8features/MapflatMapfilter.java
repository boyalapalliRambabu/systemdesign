package com.myls.systemdesign.java8features;

import java.util.List;
import java.util.stream.Collectors;

public class MapflatMapfilter {

	public static void main(String[] args) {

		List<List<Integer>> ls = List.of(List.of(2, 4, 5, 5), List.of(3, 5, 6), List.of(1, 54));

		List<List<Integer>> res = ls.stream().map(list -> list).collect(Collectors.toList());
		System.out.println(res);

		List<Integer> flat = ls.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flat);
	}
}
