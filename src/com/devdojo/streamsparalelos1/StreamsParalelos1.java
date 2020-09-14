package com.devdojo.streamsparalelos1;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsParalelos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Levar em consideração:
		// Benchmark - nem sempre os streams paralelos são mais rápidos que os sequenciais
		// Unboxing e boxing - afetam a performance
		// Algumas operações são piores em streams paralelas do que em sequenciais (limit, findFirst) (findAny, unordered)
		// Considerar o custo total da computação N, P (n= ELEMNETOS, P = Coeficiente de performance/processamento)
		// Quantidade de dados
		// Tipos de coleções
		// Tamanho do Stream (tamanho definido)
		// Processamento do merge - 
		/*
		if(tarefa == pequena || !divisivel) {
			
			sequencial
			
		} else {
			
			dividir as tarefas em duas
			chamar o metodo recursivamente
			esperar todas as tarefas serem completadas
			combinar todos os resultados
			
		}*/
		
		long num = 10_00_000;
		somaFor(num);
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println();
		//System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "4");

	}

	private static void somaFor(long num) {

		System.out.println("For");
		long result = 0;
		long init = System.currentTimeMillis();
		for (long i = 1L; i <= num; i++) {

			result += i;

		}
		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + " ms");

	}

	private static void somaStream(long num) {

		System.out.println("Stream sequencial");
		long result = 0;
		long init = System.currentTimeMillis();
		result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + " ms");

	}
	
	private static void somaParallelStream(long num) {

		System.out.println("Stream paralelos");
		long result = 0;
		long init = System.currentTimeMillis();
		result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + " ms");

	}
	
	private static void somaRangeClosedStream(long num) {

		System.out.println("Range Stream Sequencial");
		long result = 0;
		long init = System.currentTimeMillis();
		result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + " ms");

	}
	
	private static void somaRangeClosedStreamParallel(long num) {

		System.out.println("Range Stream Paralelo");
		long result = 0;
		long init = System.currentTimeMillis();
		result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + " ms");

	}

}
