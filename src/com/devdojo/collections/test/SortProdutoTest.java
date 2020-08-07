package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.devdojo.collections.Produto;


class ProdutoNomeComparator implements Comparator<Produto>{

	@Override
	public int compare(Produto arg0, Produto arg1) {
		// TODO Auto-generated method stub
		return arg0.getNome().compareTo(arg1.getNome());
	}
	
	
	
}

public class SortProdutoTest {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		Produto[] produtosArray = new Produto[4];
		
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d);
		Produto teclado = new Produto("321", "Bright", 39.9);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00);
		
		produtos.add(lenovo);
		produtos.add(teclado);
		produtos.add(mouse);
		produtos.add(celular);
		
		produtosArray[0] = lenovo;
		produtosArray[0] = teclado;
		produtosArray[0] = mouse;
		produtosArray[0] = celular;
		
		//Collections.sort(produtos);
		
		Collections.sort(produtos, new ProdutoNomeComparator());
		
		for(Produto produto : produtos) {
			
			System.out.println(produto);
			
		}
		Arrays.sort(produtosArray);
		//Arrays.sort(produtosArray, new ProdutoNomeComparator());
		Arrays.toString(produtosArray);
		
		for (Produto produto : produtosArray) {
			
			System.out.println(produto);
			
		}
		
		
	}

}
