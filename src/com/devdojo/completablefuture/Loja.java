package com.devdojo.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {

	private String nome;
	
	public Loja() {
		// TODO Auto-generated constructor stub
	}
	
	public Loja(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {

		// Vai pegar o preço

		return calcularPreco();

	}

	public Future<Double> getPrecoAsync() {
		
		CompletableFuture<Double> precoFuturo = new CompletableFuture<Double>();
		new Thread(()-> {
			//caso não ê pra usar o timeout no get
			try {
			
				precoFuturo.complete(calcularPreco());
			
			} catch (Exception e) {
				
				precoFuturo.completeExceptionally(e);
				
			}
			
		}).start();
		
		return precoFuturo;
		
	}
	
	public Future<Double> getPrecoAsyncTunado() {
		
		return CompletableFuture.supplyAsync(this::calcularPreco);
		
	}
	
	private double calcularPreco() {
		
		delay();
		//forçar exceção
		//System.out.println(1/0);
		return ThreadLocalRandom.current().nextDouble() * 100;
		
	}

	private static void delay() {

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
