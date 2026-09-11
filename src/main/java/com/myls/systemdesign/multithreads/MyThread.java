package com.myls.systemdesign.multithreads;

// By extending thread class
public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		new MyThread().run();
	}

}
