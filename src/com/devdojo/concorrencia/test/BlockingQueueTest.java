package com.devdojo.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
		
		//SynchronousQueue<E>
		//DelayQueue<Delayed>
		
		Thread t1 = new Thread(new RemoveFromQueue(bq));
		
		bq.put("William");
		//pega o valor mas não remove
		System.out.println(bq.peek());
		System.out.println("Tentando inserir outro valor");
		t1.start();
		bq.put("alou");
		System.out.println("Inserido");
		

	}
	
	static class RemoveFromQueue implements Runnable {
		
		private BlockingQueue<String> bq;
		
		public RemoveFromQueue(BlockingQueue<String> bq) {
			// TODO Auto-generated constructor stub
			this.bq = bq;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName()+" entrando em espera por 2s");
			try {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("recuperando e removendo o valor"+bq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
