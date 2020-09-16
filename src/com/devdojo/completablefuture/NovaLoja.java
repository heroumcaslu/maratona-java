package com.devdojo.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class NovaLoja {

	private String nome;
	
	public NovaLoja() {
		// TODO Auto-generated constructor stub
	}
	
	public NovaLoja(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPreco() {

		// Vai pegar o preço
		double preco = calcularPreco();
		Desconto.Codigo codigo = Desconto
				.Codigo
				.values()[ThreadLocalRandom
				          .current()
				          .nextInt(Desconto.Codigo.values().length)];
		
		return String.format("%s:%.2f:%s", nome, preco, codigo);

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
	
	public static List<NovaLoja> lojas() {
		
		List<NovaLoja> lojas = Arrays.asList(new NovaLoja("Americanas"),
				new NovaLoja("Casas Bahia"),
				new NovaLoja("Best Buy"),
				new NovaLoja("Wallmart"),
				new NovaLoja("BH Photo & Video"));
		
		return lojas;
		
	}

}
