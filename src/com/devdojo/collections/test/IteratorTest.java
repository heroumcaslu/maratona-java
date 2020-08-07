package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.devdojo.collections.Produto;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d, 0);
		Produto teclado = new Produto("321", "Bright", 39.9, 10);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99, 5);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00, 0);
		
		produtos.add(lenovo);
		produtos.add(teclado);
		produtos.add(mouse);
		produtos.add(celular);
		
		//não pode usar o remove dentro do for
		
		//forma de percorrer lista
		Iterator<Produto> produtoIterator = produtos.iterator();
		//hasNext(), next()
		
		while(produtoIterator.hasNext()) {
			
			Produto produto = produtoIterator.next();
			if(produto.getQuantidade() == 0) {
				
				produtoIterator.remove();
				
			}
			
		}
		
	}

}
