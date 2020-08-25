package com.devdojo.concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.omg.CosNaming.IstringHelper;

class ThredTrabalhadoraExecutor implements Runnable {
	
	private String num;
	
	public ThredTrabalhadoraExecutor(String num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" iniciou: "+num);
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
}

public class ExecutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		//ExecutorService executorService = Executors.newFixedThreadPool(4);
		//Cria threads conforme necessário
		//ExecutorService executorService = Executors.newCachedThreadPool();
		//Retorna apenas uma thread as tarefas que não podem ser executadas são colocadas em uma fila
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
		threadPoolExecutor.setCorePoolSize(Runtime.getRuntime().availableProcessors());
		
		executorService.execute(new ThredTrabalhadoraExecutor("1"));
		executorService.execute(new ThredTrabalhadoraExecutor("2"));
		executorService.execute(new ThredTrabalhadoraExecutor("3"));
		executorService.execute(new ThredTrabalhadoraExecutor("4"));
		executorService.shutdown();
		
		while(!executorService.isTerminated()) {
			
			
			
		}
		System.out.println("finalizado!");
		
		
		
	}

}
