package com.duga.m;

class myth extends Thread {
	public void run() {
		System.out.println("run method run()");
	}

	public void run(int i) {
		System.out.println("int run method()");
	}
}

public class Threaddemo2 {
	public static void main(String[] args) {

		myth t = new myth();
		t.start();
	//	t.start();   run method run()Exception in thread "main" 
//		java.lang.IllegalThreadStateException

	}
}
//override run it is possible but thread class start () always no argument run() only.