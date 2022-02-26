package com.duga.m;

class Dkdevt extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("lazy program");
				Thread.sleep(7000);
			}
		} catch (Exception e) {
			System.out.println("i am inttreputed");
			e.printStackTrace();
		}
	}
}

public class Testt {
	public static void main(String[] args) throws InterruptedException {
		// System.out.println("devanand");
		// Thread.sleep(1234);
		// System.out.println("software dev");
		// Thread.sleep(1123, 790);
		
		// }

		Dkdevt d = new Dkdevt();
		d.start();
	//	d.interrupt();
		System.out.println("end of program succesfully");

	}
}
