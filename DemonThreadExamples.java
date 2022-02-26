package com.duga.m;

//A therad which is executing in the background r calld daemon thread.
//main thred is non dameon thread.
//if parrent therad is dameon then child also demon
//non demon parent then  child also demon
//when main thread terminate after that child thread also terminate automatically as soon.

class Mydemon extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("lazy thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DemonThreadExamples {
	public static void main(String[] args) {

		Mydemon m = new Mydemon();
	m.setDaemon(true);
		m.start();
		System.out.println("end of main method");

	}
}
