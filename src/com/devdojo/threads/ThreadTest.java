package com.devdojo.threads;

//Daemon x User
class ThreadExemplo extends Thread {

	private char c;

	public ThreadExemplo(char c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {

		System.out.println("Thread: " + Thread.currentThread().getName());
		for (int i = 0; i < 1000; i++) {

			System.out.println(c);
			if (i % 100 == 0) {

				System.out.println();

			}

		}

	}

}

class ThreadExemploRunnable implements Runnable {

	private char c;

	public ThreadExemploRunnable(char c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {

		System.out.println("Thread: " + Thread.currentThread().getName());
		for (int i = 0; i < 1000; i++) {

			System.out.println(c);
			if (i % 100 == 0) {

				System.out.println();

			}
			if(Thread.currentThread().getName().equals("T4")) {
				Thread.yield();
			}
			//try {
			//	Thread.sleep(2000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}

		}

	}

}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		//ThreadExemplo t1 = new ThreadExemplo('A');
		//ThreadExemplo t2 = new ThreadExemplo('B');
		//ThreadExemplo t3 = new ThreadExemplo('C');
		//ThreadExemplo t4 = new ThreadExemplo('D');
		
		Thread t1 = new Thread(new ThreadExemploRunnable('A'), "T1");
		Thread t2 = new Thread(new ThreadExemploRunnable('B'), "T2");
		Thread t3 = new Thread(new ThreadExemploRunnable('C'), "T3");
		Thread t4 = new Thread(new ThreadExemploRunnable('D'), "T4");

		t4.setPriority(Thread.MAX_PRIORITY);
		
		// t1.run();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		t4.start();

	}

}
