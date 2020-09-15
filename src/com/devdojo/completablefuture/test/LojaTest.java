package com.devdojo.completablefuture.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.devdojo.completablefuture.Loja;

public class LojaTest {

	public static void main(String[] args) {

		Loja americanas = new Loja();
		Loja casasBahia = new Loja();
		Loja bestBuy = new Loja();
		Loja wallmart = new Loja();

		long start = System.currentTimeMillis();

		/*
		 * System.out.println(americanas.getPreco());
		 * System.out.println(casasBahia.getPreco());
		 * System.out.println(bestBuy.getPreco());
		 * System.out.println(wallmart.getPreco());
		 */

		Future<Double> precoAsync = americanas.getPrecoAsync();
		Future<Double> precoAsync2 = casasBahia.getPrecoAsync();
		Future<Double> precoAsync3 = wallmart.getPrecoAsync();
		Future<Double> precoAsync4 = bestBuy.getPrecoAsync();

		System.out.println("Tempo: " + (System.currentTimeMillis() - start) + " ms");
		enrolando();
		try {
			System.out.println("Americanas: "+precoAsync.get()+
			"Casas Bahia: "+precoAsync2.get()+
			"Wallmart: "+precoAsync3.get()+
			"bestBuy: "+precoAsync4.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Tempo para pegar o resultado: "+(System.currentTimeMillis() - start)+" ms");

	}

	public static void enrolando() {

		long soma = 0;
		for (int i = 0; i < 1_000_000; i++) {

			soma += i;

		}
		System.out.println(soma);

	}

}
