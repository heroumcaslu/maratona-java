package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.devdojo.collections.Produto;

public class SortProdutoTest {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d);
		Produto teclado = new Produto("321", "Bright", 39.9);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00);
		
		produtos.add(lenovo);
		produtos.add(teclado);
		produtos.add(mouse);
		produtos.add(celular);
		
		Collections.sort(produtos);
		
		for(Produto produto : produtos) {
			
			System.out.println(produto);
			
		}
		
		
		
	}

}
