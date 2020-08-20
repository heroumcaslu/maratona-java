package com.devdojo.threads;

public class DeadLockTest {

	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	private static class ThreadExemplo1 extends Thread {

		public void run() {

			synchronized (lock1) {
				System.out.println("Thread 1: segurando lock1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1: esperando lock2");
				synchronized (lock2) {

					System.out.println("Thread 1: segurando lock1 e lock2");

				}
			}

		}

	}

	private static class ThreadExemplo2 extends Thread {

		public void run() {

			//pra resolver o deadlock é só por lock1 no primeiro e lock2 no segundo syncronized (mesma ordem da outra classe)
			synchronized (lock2) {
				System.out.println("Thread 2: segurando lock2");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2: esperando lock1");
				synchronized (lock1) {

					System.out.println("Thread 1: segurando lock1 e lock2");

				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ThreadExemplo1().start();
		
		new ThreadExemplo2().start();

	}

}
