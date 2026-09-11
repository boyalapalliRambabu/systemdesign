package com.myls.systemdesign.multithreads;

public class ThreadControlls {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()));
		t.run();
		t.start();

		Thread worker = new Thread(() -> {
			while (!Thread.currentThread().isInterrupted()) {
				// Do some thing
				System.out.println("Hi");
			}
			System.out.println("Gracefully stopped");

		});

		worker.start();
		worker.interrupt();

		Thread sleeper = new Thread(() -> {

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		sleeper.start();
//		sleeper.interrupt();

		Thread backGround = new Thread(() -> {
			while (true) {
				System.out.println("Test");
			}
		});
		backGround.setDaemon(true);
		backGround.start();
	}
}
