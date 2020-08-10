package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.devdojo.collections.Consumidor;
import com.devdojo.collections.Produto;

public class ConsumidorMapTest {
	
	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor("Lucas", "132");
		Consumidor customer = new Consumidor("Herom", "321");
		
		Produto lenovo = new Produto("123", "Laptop Lenovo", 2000d);
		Produto teclado = new Produto("321", "Bright", 39.9);
		Produto mouse = new Produto("879", "MK25BK C3 Tech", 9.99);
		Produto celular = new Produto("012", "Smartphone Lenovo", 999.00);
		
		//Não pode criar consumidores iguais They'll be replaced, se a chave já existir ex cpf 321 o valor não é replaced
		Map<Consumidor, Produto> order = new HashMap<Consumidor, Produto>();
		Map<Consumidor, List<Produto>> order2 = new HashMap<Consumidor, List<Produto>>();
		
		List<Produto> produtosConsumidor = new ArrayList<Produto>();
		produtosConsumidor.add(celular);
		produtosConsumidor.add(teclado);
		
		List<Produto> produtosCustomer = new ArrayList<Produto>();
		produtosCustomer.add(mouse);
		produtosCustomer.add(lenovo);
		
		order.put(consumidor, lenovo);
		order.put(customer, celular);
		
		order2.put(customer, produtosCustomer);
		order2.put(consumidor, produtosConsumidor);
		
		for(Map.Entry<Consumidor, Produto> entry: order.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		//1 consumidor com mais de um produto
		
		for(Map.Entry<Consumidor, List<Produto>> entry : order2.entrySet()) {
			
			for(Produto prod : entry.getValue()) {
				
				System.out.println(entry.getKey().getNome()+" "+prod.getNome());
				
			}
			
		}
		
	}

}
