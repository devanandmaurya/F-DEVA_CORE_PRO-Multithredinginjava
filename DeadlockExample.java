package com.dkh.deallocckexa;

public class DeadlockExample {
	public static void main(String[] args) {

		final String resource1 = "Devanand";
		final String resource2 = "Maurya";
		Thread thread1 = new Thread("Thread_1") {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread_1 lock resurce :resouce1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resource2) {
						System.out.println("Thread_1 lock resurce :resource2");
					}
				}

			}
		};
	
		// Tread2 tries to lock resource2 then resource1
		
		Thread thread2 = new Thread("Thread_2") {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread_2 lock resurce :resource2 gh");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resource1) {
						System.out.println("Thread_2 lock resurce :resource1");
					}
				}

			}
		};
		thread1.start();
		thread2.start();
	}

}

/*
 * 
 * Found one Java-level deadlock: ============================= "Thread_2":
 * waiting to lock monitor 0x00000000029276c8 (object 0x00000000eb386ef8, a
 * java.lang.String), which is held by "Thread_1" "Thread_1": waiting to lock
 * monitor 0x0000000002929ea8 (object 0x00000000eb386f30, a java.lang.String),
 * which is held by "Thread_2"
 * 
 * Java stack information for the threads listed above:
 * =================================================== "Thread_2": at
 * com.dkh.deallocckexa.DeadlockExample$2.run(DeadlockExample.java:38) - waiting
 * to lock <0x00000000eb386ef8> (a java.lang.String) - locked
 * <0x00000000eb386f30> (a java.lang.String) "Thread_1": at
 * com.dkh.deallocckexa.DeadlockExample$1.run(DeadlockExample.java:20) - waiting
 * to lock <0x00000000eb386f30> (a java.lang.String) - locked
 * <0x00000000eb386ef8> (a java.lang.String)
 * 
 * Found 1 deadlock.
 * 
 */
/*
 * C:\Users\DEV>jps -l -m 12688 sun.tools.jps.Jps -l -m 5840
 * com.dkh.deallocckexa.DeadlockExample 4516
 * com.dkh.deallocckexa.DeadlockExample 7220
 * 
 * C:\Users\DEV>jstack12688 'jstack12688' is not recognized as an internal or
 * external command, operable program or batch file.
 * 
 * C:\Users\DEV>jstack 12688 12688: no such process
 * 
 * C:\Users\DEV>5840 '5840' is not recognized as an internal or external
 * command, operable program or batch file.
 * 
 * C:\Users\DEV>jstack 5840 2020-05-19 10:54:52 Full thread dump Java
 * HotSpot(TM) 64-Bit Server VM (25.211-b12 mixed mode):
 * 
 * "DestroyJavaVM" #12 prio=5 os_prio=0 tid=0x0000000002cfe800 nid=0x3354
 * waiting on condition [0x0000000000000000] java.lang.Thread.State: RUNNABLE
 * 
 * "Thread_2" #11 prio=5 os_prio=0 tid=0x0000000016d06000 nid=0x2138 waiting for
 * monitor entry [0x000000001746f000] java.lang.Thread.State: BLOCKED (on object
 * monitor) at
 * com.dkh.deallocckexa.DeadlockExample$2.run(DeadlockExample.java:38) - waiting
 * to lock <0x00000000eb386ef8> (a java.lang.String) - locked
 * <0x00000000eb386f30> (a java.lang.String)
 * 
 * "Thread_1" #10 prio=5 os_prio=0 tid=0x0000000016d46000 nid=0x2dc4 waiting for
 * monitor entry [0x000000001736f000] java.lang.Thread.State: BLOCKED (on object
 * monitor) at
 * com.dkh.deallocckexa.DeadlockExample$1.run(DeadlockExample.java:20) - waiting
 * to lock <0x00000000eb386f30> (a java.lang.String) - locked
 * <0x00000000eb386ef8> (a java.lang.String)
 * 
 * "Service Thread" #9 daemon prio=9 os_prio=0 tid=0x0000000016c99800 nid=0x23dc
 * runnable [0x0000000000000000] java.lang.Thread.State: RUNNABLE
 * 
 * "C1 CompilerThread2" #8 daemon prio=9 os_prio=2 tid=0x0000000015303800
 * nid=0x1940 waiting on condition [0x0000000000000000] java.lang.Thread.State:
 * RUNNABLE
 * 
 * "C2 CompilerThread1" #7 daemon prio=9 os_prio=2 tid=0x00000000152f4000
 * nid=0x33dc waiting on condition [0x0000000000000000] java.lang.Thread.State:
 * RUNNABLE
 * 
 * "C2 CompilerThread0" #6 daemon prio=9 os_prio=2 tid=0x00000000152ef800
 * nid=0x280c waiting on condition [0x0000000000000000] java.lang.Thread.State:
 * RUNNABLE
 * 
 * "Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x00000000152ed800
 * nid=0x24bc waiting on condition [0x0000000000000000] java.lang.Thread.State:
 * RUNNABLE
 * 
 * "Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x00000000152ec000
 * nid=0x2434 runnable [0x0000000000000000] java.lang.Thread.State: RUNNABLE
 * 
 * "Finalizer" #3 daemon prio=8 os_prio=1 tid=0x0000000002c3e800 nid=0x3150 in
 * Object.wait() [0x000000001666e000] java.lang.Thread.State: WAITING (on object
 * monitor) at java.lang.Object.wait(Native Method) - waiting on
 * <0x00000000eb308ed0> (a java.lang.ref.ReferenceQueue$Lock) at
 * java.lang.ref.ReferenceQueue.remove(Unknown Source) - locked
 * <0x00000000eb308ed0> (a java.lang.ref.ReferenceQueue$Lock) at
 * java.lang.ref.ReferenceQueue.remove(Unknown Source) at
 * java.lang.ref.Finalizer$FinalizerThread.run(Unknown Source)
 * 
 * "Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x0000000002c33000
 * nid=0x1908 in Object.wait() [0x000000001656f000] java.lang.Thread.State:
 * WAITING (on object monitor) at java.lang.Object.wait(Native Method) - waiting
 * on <0x00000000eb306bf8> (a java.lang.ref.Reference$Lock) at
 * java.lang.Object.wait(Unknown Source) at
 * java.lang.ref.Reference.tryHandlePending(Unknown Source) - locked
 * <0x00000000eb306bf8> (a java.lang.ref.Reference$Lock) at
 * java.lang.ref.Reference$ReferenceHandler.run(Unknown Source)
 * 
 * "VM Thread" os_prio=2 tid=0x00000000152b7800 nid=0x1c84 runnable
 * 
 * "GC task thread#0 (ParallelGC)" os_prio=0 tid=0x0000000002b58000 nid=0x30d8
 * runnable
 */