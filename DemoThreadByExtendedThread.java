package com.duga.m;

class Mythread extends Thread {
	public void run() {  //define a thread  
		for (int i = 0; i <= 10; i++) { // execute child thread
			System.out.println("child thread");
		}
	}
}

public class DemoThreadByExtendedThread {

	public static void main(String[] args) {
		Mythread t = new Mythread(); // main thread instantiation of thread
		t.start(); //child thread and main thread execute
	//	t.run();
		for (int i = 0; i <= 10; i++) { //execute main thread 
			System.out.println("main thread");
		}
	}
}
//t.start() >> a new thtead will created and that thread responsible to execute run();
// but in case of t.run() method no new thread will be created
//and run method will execute just like normal call method .
//t.run() case child thread 8 times and main thread 10 time