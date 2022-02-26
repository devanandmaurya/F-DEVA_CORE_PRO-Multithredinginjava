package com.duga.m;

public class ThreadName {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // main
		Thread.currentThread().setName("mythread");
		System.out.println(Thread.currentThread().getName());// mythread
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.activeCount());
	}
}
