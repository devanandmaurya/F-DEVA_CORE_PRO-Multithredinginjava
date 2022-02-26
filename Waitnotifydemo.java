package com.duga.m;

public class Waitnotifydemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.toString();
		t.start();
		Thread.sleep(10000);
		synchronized (t) {
			System.out.println("main thread trying to call wait()");
			t.wait();
			System.out.println("main thread got notiffied");
			System.out.println(t.total);
		}

	}
}

class ThreadB extends Waitnotifydemo {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child thread start notifecation");
			for (int i = 0; i <= 10; i++) {
				total = total + i;
			}
			System.out.println("child thread trying to give  notifeccation");
			this.notify();
		}
	}

	public void start() {
		System.out.println("start method call ");
	}
}