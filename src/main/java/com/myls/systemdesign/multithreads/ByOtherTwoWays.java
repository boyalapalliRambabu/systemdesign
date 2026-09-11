package com.myls.systemdesign.multithreads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ByOtherTwoWays {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable task = () -> System.out.println("Running via runnable");
		new Thread(task).start();

		Callable<Integer> callableTask = () -> {
			Thread.sleep(100);
			return 42;
		};

		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> future = ex.submit(callableTask);
		System.out.println(future.get());
		ex.shutdown();

	}

}
