package com.duga.m;

class mythh extends Thread {
	public void start() {
		// super.start();
		System.out.println("start method execute..");
	}

	public void run() {
		System.out.println("run method execute");
	}
}

public class overridestartm {
	public static void main(String[] args) {

		mythh t = new mythh();
		t.start();
		// t.run();
		System.out.println("main method run");
	}
}
// if we orverride start() method  then it behave like normal method call.
// override run it is possible but thread class start () always no argument run()
// only.
//it is never recommended to override start() but always override run();
