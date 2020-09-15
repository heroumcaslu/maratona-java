package com.devdojo.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {

	public double getPreco() {

		// Vai pegar o preço

		return calcularPreco();

	}

	public Future<Double> getPrecoAsync() {
		
		CompletableFuture<Double> precoFuturo = new CompletableFuture<Double>();
		new Thread(()-> {
			
			precoFuturo.complete(calcularPreco());
			
		}).start();
		
		return precoFuturo;
		
	}
	
	private double calcularPreco() {
		
		delay();
		return ThreadLocalRandom.current().nextDouble() * 100;
		
	}

	private static void delay() {

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
