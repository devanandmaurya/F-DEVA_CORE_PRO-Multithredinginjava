package com.duga.m;

class myt extends Thread {
	public void run() {

		for (int i = 0; i <= 8; i++) {
			System.out.println("child thread");
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		myt m = new myt();
		m.setPriority(10);
		System.out.println(m);
		m.start();
		for (int i = 0; i <= 8; i++) {
			System.out.println("main thread"); 
		}

	}
}
 