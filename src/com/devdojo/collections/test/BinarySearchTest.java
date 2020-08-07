package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.devdojo.collections.Produto;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<Produto> produtos = new ArrayList<Produto>();
		Integer[] arrayInt = new Integer[4];
			
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d);
		Produto teclado = new Produto("321", "Bright", 39.9);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00);
		Produto monitor = new Produto("023", "Monitor Philips", 999.00);
		
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		
		produtos.add(lenovo);
		produtos.add(teclado);
		produtos.add(mouse);
		produtos.add(celular);
		
		arrayInt[0] = 2;
		arrayInt[1] = 0;
		arrayInt[2] = 4;
		arrayInt[3] = 3;
		
		Collections.sort(numeros);
		Collections.sort(produtos, new ProdutoNomeComparator());
		Arrays.sort(arrayInt);
		
		//tem que estar ordenada
		//(-(ponto de inserção) -1)
		//se utilisou comparator no sort utilizar no binarySearch
		System.out.println(Collections.binarySearch(numeros, 2));
		//fazer lógica pra verificar se o index existe se não dá IndexOutOfBound
		//numeros.get(Collections.binarySearch(numeros, 2));
		
		System.out.println(Arrays.binarySearch(arrayInt, 1));
		
		Collections.binarySearch(produtos, monitor, new ProdutoNomeComparator());
		for(Produto produto : produtos) {
			
			System.out.println(produto);
			
		}
				
	}
	
}
