package com.myls.systemdesign.java8features;

import java.util.List;
import java.util.stream.Stream;

public class IntermediatevsTerminalOperations {

	public static void main(String[] args) {

		List<String> name = List.of("Zara", "Amit", "Wase");

		Stream<String> pipeLine = name.stream().map(n -> {
			System.out.println("Mapping " + n);// side effect, to observe WHEN this runs
			return n.toUpperCase();
		});
		System.out.println("Pipeline built. Nothing printed yet.");
		// Nothing has printed "mapping ..." at this point — map() is intermediate,
		// purely descriptive
//		so far
		long count = pipeLine.count();// TERMINAL operation — THIS is what actually runs map() for
//		each element
		// NOW "mapping Zara", "mapping Amit", "mapping Wei" print, in that order
		System.out.println("Count: " + count);

	}

}
