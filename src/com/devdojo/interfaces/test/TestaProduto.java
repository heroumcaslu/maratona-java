package com.devdojo.interfaces.test;

import com.devdojo.interfaces.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto("Notebook", 4, 3000);
		p.calcularImposto();
		p.calcularFrete();
		System.out.println(p);

	}

}
