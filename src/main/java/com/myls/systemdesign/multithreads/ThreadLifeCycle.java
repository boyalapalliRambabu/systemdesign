package com.myls.systemdesign.multithreads;

public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		});

		System.out.println(t.getState());// NEW -- start() not called yet
		t.start();
		System.out.println(t.getState());// RUNNABLE (or briefly still NEW if scheduler hasn't picked it up yet)
		Thread.sleep(200);
		System.out.println(t.getState()); // TIMED_WAITING -- currently inside Thread.sleep(1000)
		t.join();
		System.out.println(t.getState()); // TERMINATED

		// BLOCKED specifically means "waiting on a monitor lock", not just "waiting for
		// anything":
		Object lock = new Object();
		synchronized (lock) {
			Thread other = new Thread(() -> {
				synchronized (lock) {
				} // this thread will show as BLOCKED while the outer thread holds `lock`

			});

			other.start();
			Thread.sleep(100);
			System.out.println(other.getState()); // BLOCKED
		}

	}

}
