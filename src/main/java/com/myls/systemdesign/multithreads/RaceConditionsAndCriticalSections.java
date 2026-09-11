package com.myls.systemdesign.multithreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RaceConditionsAndCriticalSections {

	public static void main(String[] args) throws InterruptedException {

		Counter count = new Counter();

		ExecutorService pool = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 1000; i++) {
			pool.submit(count::increment);
		}
		pool.shutdown();
		pool.awaitTermination(5, TimeUnit.SECONDS);
		System.out.println(count.getCount());

		SafeCounter safeCounter = new SafeCounter();

		ExecutorService pooll = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 1000; i++) {
			pooll.submit(safeCounter::increment);
		}
		pooll.shutdown();
		pooll.awaitTermination(5, TimeUnit.SECONDS);
		System.out.println(safeCounter.getCount());

	}

}
