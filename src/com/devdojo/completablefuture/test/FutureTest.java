package com.devdojo.completablefuture.test;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest {
	
	private static ExecutorService executorService = Executors.newFixedThreadPool(1);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Future<Double> future = executorService.submit(new Callable<Double>() {

			@Override
			public Double call() throws Exception {
				// TODO Auto-generated method stub
				TimeUnit.SECONDS.sleep(2);
				return 2000D;
			}
			
			
		});
		
		System.out.println();
		enrolando();
		
		try {
			
			Double resultado = future.get(1, TimeUnit.SECONDS);
			System.out.println(resultado);
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			executorService.shutdown();
			
		}

	}
	
	public static void enrolando() {
		
		long soma = 0;
		for(int i = 0; i < 1_000_000; i++) {
			
			soma += i;
			
		}
		System.out.println(soma);
		
	}

}
