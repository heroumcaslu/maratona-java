package com.devdojo.collections.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import com.devdojo.collections.Celular;
import com.devdojo.collections.Produto;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d, 0);
		Produto teclado = new Produto("321", "Bright", 39.9, 10);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99, 5);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00, 0);
		
		//Celular cell = new Celular("iPhone SE", "1234");
		
		//Os elementos são ordenado automaticamente
		NavigableSet<Produto> produtoNavSet = new TreeSet<Produto>();
		//NavigableSet<Celular> celularNavSet = new TreeSet<Celular>();
		
		//Precisa implementar comparable ou informar um comparator.
		//celularNavSet.add(cell);
		
		produtoNavSet.add(celular);
		produtoNavSet.add(lenovo);
		produtoNavSet.add(mouse);
		produtoNavSet.add(teclado);
		
		for(Produto p : produtoNavSet.descendingSet()) {
			
			System.out.println(p);
			
		}
		
		System.out.println("-------------------------------------------------------------------------");
		//lower <
		//floor <=
		//higher >
		//ceiling >=
		//Encontra o mais barato antes do produto celular
		System.out.println(produtoNavSet.lower(celular));
		
		//pega o primeiro elemento e remove poolLast paga o ultimo.
		System.out.println(produtoNavSet.pollFirst());

	}

}
