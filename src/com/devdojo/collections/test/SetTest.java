package com.devdojo.collections.test;

import java.util.HashSet;
import java.util.Set;

import com.devdojo.collections.Produto;

public class SetTest {
	public static void main(String[] args) {
				
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d, 0);
		Produto teclado = new Produto("321", "Bright", 39.9, 10);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99, 5);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00, 0);
		
		//Set não permite elementos duplicados
		//não é indexado
		//não tem ordem
		//LinkedHashSet mantém a ordem de inserção
		Set<Produto> produtoSet = new HashSet<Produto>(); //Todos tipos abstratos que têm hash usam hashcode
		produtoSet.add(lenovo);
		produtoSet.add(teclado);
		produtoSet.add(mouse);
		produtoSet.add(celular);
		
		for(Produto p : produtoSet) {
			
			System.out.println(p);
			
		}
		
	}
}
