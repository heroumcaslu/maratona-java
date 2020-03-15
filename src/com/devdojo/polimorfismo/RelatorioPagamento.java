package com.devdojo.polimorfismo;

public class RelatorioPagamento {
	
	public void relatorioGerente(Gerente gerente) {
		
		System.out.println("Gerando relarório do gerente");
		gerente.calcularPagamento();
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		
	}
	
	public void relatorioVendedor(Vendedor vendedor) {
		
		System.out.println("Gerando relarório do vendedor");
		vendedor.calcularPagamento();
		System.out.println(vendedor.getNome());
		System.out.println(vendedor.getSalario());
		
	}
	
	public void relatorioGenerico(Funcionario funcionario) {
		
		System.out.println("Gerando relarório do vendedor");
		funcionario.calcularPagamento();
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
		//Verifica se o objeto referenciado é uma instancia de gerente.
		if (funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("PNL: "+g.getpNL());
			
		} else if(funcionario instanceof Vendedor) {
			
			Vendedor v = (Vendedor) funcionario;
			System.out.println("Total de vendas: "+ v.getTotalVendas());
			//((Vendedor) funcionario).getTotalVendas();
			
		}
		
	}

}
