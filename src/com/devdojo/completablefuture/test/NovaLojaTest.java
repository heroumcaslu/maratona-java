package com.devdojo.completablefuture.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.devdojo.completablefuture.Desconto;
import com.devdojo.completablefuture.Loja;
import com.devdojo.completablefuture.NovaLoja;
import com.devdojo.completablefuture.Orcamento;

public class NovaLojaTest {

	public static void main(String[] args) {

		List<NovaLoja> lojas = NovaLoja.lojas();

		lojas.stream().forEach(novaLoja -> System.out.println(novaLoja.getPreco()));

		final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r -> {

			Thread t = new Thread(r);
			t.setDaemon(true);

			return t;

		});
		
		long start = System.currentTimeMillis();
		CompletableFuture[] cf = acharPrecosStream(lojas, executor)
		.map(f -> f.thenAccept(s -> System
				.out
				.println(s+"finalizado em: "+(System.currentTimeMillis() - start)+" ms")))
		.toArray(CompletableFuture[]::new);
		//acharPrecosStream(lojas, executor).map(f -> f.thenAcceptAsync(System.out::println));
		
		CompletableFuture.allOf(cf).join();
		
		//Retorna o primeiro
		//CompletableFuture.anyOf(cf).join();
		
		System.out.println("Todas responderam em" + (System.currentTimeMillis() - start) + " ms");

	}

	private static List<String> acharPrecos(List<NovaLoja> lojas) {

		System.out.println("Stream sequencial");
		long start = System.currentTimeMillis();

		List<String> collect = lojas.stream().map(NovaLoja::getPreco).map(Orcamento::parse)
				.map(Desconto::calcularDesconto).collect(Collectors.toList());

		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}

	private static List<String> acharPrecosAsync(List<NovaLoja> lojas, Executor executor) {

		System.out.println("Completable Future Async");
		long start = System.currentTimeMillis();
		
		List<CompletableFuture<String>> completableFutures = lojas.stream()
		//Pega o preço original de forma async
		.map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
		//Transforma a string em um orçamento no momento em que ele se torna disponivel
		.map(future -> future
				.thenApply(Orcamento::parse))
		//Compoe o primeiro future com mais uma chamada async, para pegar os descontos
		//no momento em que a primeira requisição async estiver disponivel
		.map(future -> future
				.thenCompose(orcamento -> CompletableFuture
						.supplyAsync(() -> Desconto
								.calcularDesconto(orcamento), executor)))
		.collect(Collectors.toList());
		
		//Espera todos os futures no stream finalizarem para terem seus resultados extraidos
		List<String> collect = completableFutures.stream()
		.map(CompletableFuture::join)
		.collect(Collectors.toList());

		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return collect;

	}
	
	private static Stream<CompletableFuture<String>>acharPrecosStream(List<NovaLoja> lojas, Executor executor) {

		System.out.println("Completable Future Async Stream");
		long start = System.currentTimeMillis();
		
		Stream<CompletableFuture<String>> map = lojas.stream()
		//Pega o preço original de forma async
		.map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
		//Transforma a string em um orçamento no momento em que ele se torna disponivel
		.map(future -> future
				.thenApply(Orcamento::parse))
		//Compoe o primeiro future com mais uma chamada async, para pegar os descontos
		//no momento em que a primeira requisição async estiver disponivel
		.map(future -> future
				.thenCompose(orcamento -> CompletableFuture
						.supplyAsync(() -> Desconto
								.calcularDesconto(orcamento), executor)));
		
		
		System.out.println("Tempo total" + (System.currentTimeMillis() - start) + " ms");

		return map;

	}

}
