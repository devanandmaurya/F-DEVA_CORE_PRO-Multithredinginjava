package com.duga.m;

class Myrunnable  implements Runnable {

	public void run() { // define overall thread block
		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread::"+i); // job of thread
		}
	}
}

public class byimplementMethod {
	public static void main(String[] args) throws InterruptedException {
		Myrunnable r = new Myrunnable();
		Thread t = new Thread(r); // here r is target runtime
		t.start();
		t.getClass();
		t.getThreadGroup();
	 System.out.println(t.currentThread());;
		t.getName();
		t.getPriority();
		t.getStackTrace();
		Thread.sleep(1022, 9000);
		System.out.println(t);
		System.out.println(t.MIN_PRIORITY);
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread running "+i);

		}
	}
}
