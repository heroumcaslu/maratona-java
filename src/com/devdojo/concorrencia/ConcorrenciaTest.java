package com.devdojo.concorrencia;

import java.util.concurrent.atomic.AtomicInteger;

class Contador{
	
	private int count;
	private AtomicInteger atomicInteger = new AtomicInteger();
	
	public void increment() {
		
		count++;
		atomicInteger.getAndIncrement();
		
	}
	
	public int getCount() {
		
		return count;
		
	}
	
	public int getAtomicInteger() {
		return atomicInteger.intValue();
	}
	
	
}

class IncrementadorThread extends Thread {
	
	private Contador contador;
	
	public IncrementadorThread(Contador contador) {
		// TODO Auto-generated constructor stub
		this.contador = contador;
	}
	
	public void run() {
		
		for(int i = 0; i< 10000; i++) {
			
			contador.increment();
			
		}
		
	}
	
}

public class ConcorrenciaTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Contador c = new Contador();
		
		IncrementadorThread it1 = new IncrementadorThread(c);
		IncrementadorThread it2 = new IncrementadorThread(c);
		
		it1.start();
		it2.start();
		
		it1.join();
		it2.join();
		
		System.out.println(c.getCount());
		System.out.println(c.getAtomicInteger());
		
	}

}
