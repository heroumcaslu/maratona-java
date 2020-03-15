package com.devdojo.polimorfismo.test;

import com.devdojo.polimorfismo.*;

public class PolimorfismoTeste {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente("Lucas", 5000, 2000);
		Vendedor v = new Vendedor("Yuri", 2000, 20000);
		RelatorioPagamento r = new RelatorioPagamento();
		
		r.relatorioGerente(g);
		r.relatorioVendedor(v);
		
		//Quem executa é o objeto, o método precisa estar declarado na classe pai.
		Funcionario f = g;
		System.out.println(f.getSalario());
		
		r.relatorioGenerico(g);
		r.relatorioGenerico(v);
		
	}

}
