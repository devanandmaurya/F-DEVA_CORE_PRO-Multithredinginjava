package com.duga.m;

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Good morning guys");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class NewThread extends Thread {
	Display d;
	String name;

	NewThread(Display d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);

	}
}

public class Synchronizationexamp {
	public static void main(String[] args) {
		Display d = new Display();
		Display dd = new Display();
		NewThread t = new NewThread(d, "DEVANAND");
		NewThread tt = new NewThread(dd, "Maurya");
		t.start();
		tt.start();
	}
}
