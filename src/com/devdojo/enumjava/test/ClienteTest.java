package com.devdojo.enumjava.test;

import com.devdojo.enumjava.Cliente;
import com.devdojo.enumjava.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
		//Cliente c = new Cliente("Anna", 10);
		System.out.println(c);
		
		
	}
	
}
