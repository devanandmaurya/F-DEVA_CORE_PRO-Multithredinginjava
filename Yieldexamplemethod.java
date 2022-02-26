package com.duga.m;

class Mynewthread extends Thread {
	public void run() {
		for (int i = 0; i <= 8; i++) {
			Thread.yield();
			System.out.println("child thread will  execute here");
		}
	}
}

public class Yieldexamplemethod {
	public static void main(String[] args) {

		Mynewthread t = new Mynewthread();
		t.start();
		for (int i = 0; i <= 8; i++) {

			// t.getId();
			// t.hashCode();
			// t.interrupt();
			// System.out.println(t);
			System.out.println("main thread is running");

		}
	}
}