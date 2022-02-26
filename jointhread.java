package com.duga.m;

class Mthread extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("deva thread runing");
			try {
				Thread.sleep(1200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class jointhread {
	public static void main(String[] args) throws InterruptedException {
		Mthread t = new Mthread();
		t.start();
		t.join();

		for (int i = 0; i <= 9; i++) {

			System.out.println("main thhread is running ");
		}
	}
}
