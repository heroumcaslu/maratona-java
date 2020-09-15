package com.devdojo.completablefuture.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.devdojo.completablefuture.Loja;

public class LojaTest2 {

	public static void main(String[] args) {

		List<Loja> lojas = Arrays.asList(new Loja("Americanas"), new Loja("Best Buy"), new Loja("Casas Bahia"),
				new Loja("Wallmart"));

	}

	private static List<String> acharPrecos(List<Loja> lojas) {

		System.out.println("Stream sequencial");
		long start = System.currentTimeMillis();
		List<String> collect = lojas.stream()
				.map(loja -> String.format("%s o preco é: %.2f", loja.getNome(), loja.getPreco()))
				.collect(Collectors.toList());

		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}

	private static List<String> acharPrecos2(List<Loja> lojas) {

		System.out.println("Stream paralelos");
		long start = System.currentTimeMillis();
		List<String> collect = lojas.parallelStream()
				.map(loja -> String.format("%s o preco é: %.2f", loja.getNome(), loja.getPreco()))
				.collect(Collectors.toList());

		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}
	
	private static List<String> acharPrecos3(List<Loja> lojas) {

		System.out.println("Completable future sequencial");
		long start = System.currentTimeMillis();
		
		//Pode passar um executor customizado
		List<String> collect = lojas.stream()
				.map(loja -> CompletableFuture.supplyAsync(
						() -> String.format("%s o preco é: %.2f", loja.getNome(), loja.getPreco())
						)).map(CompletableFuture::join)
				.collect(Collectors.toList());

		System.out.println("Tempo de invocação" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}
	
	private static List<String> acharPrecos4(List<Loja> lojas) {

		System.out.println("Completable future async");
		long start = System.currentTimeMillis();
		
		List<CompletableFuture<String>> precoFuturo = lojas.stream()
				.map(loja -> CompletableFuture.supplyAsync(
						() -> String.format("%s o preco é: %.2f", loja.getNome(), loja.getPreco())
						))
				.collect(Collectors.toList());

		System.out.println("Tempo de invocação" + (System.currentTimeMillis() - start) + " ms");
		
		List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());
		
		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}

}
