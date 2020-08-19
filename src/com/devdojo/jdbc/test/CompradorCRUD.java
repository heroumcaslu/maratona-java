package com.devdojo.jdbc.test;

import java.util.List;
import java.util.Scanner;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.db.CompradorDAO;

public class CompradorCRUD {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void executar(int op) {
		// TODO Auto-generated method stub
		switch(op) {
		
			case 1:
				inserir();
				break;
			case 2:
				atualizar();
				break;
			case 3:
				listAll();
				break;
			case 4:
				System.out.println("Digite um nome:");
				searchByName(teclado.nextLine());
				break;
			case 5:
				remove();
				break;
			default:
				System.out.println("Selecione uma opção entre 0 e 5 para continuar");
				break;
		
		}
		
	}

	private static void remove() {
		// TODO Auto-generated method stub
		System.out.println("Selecione um dos compradores para deletar:");
		List<Comprador> compradores = listAll();
		int index = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Tem certeza? Y/n");
		String op = teclado.nextLine();
		if(op.toUpperCase().startsWith("Y") | op.isEmpty()) {
			
			CompradorDAO.remove(compradores.get(index));
			
		}
		
	}



	private static void searchByName(String nome) {
		// TODO Auto-generated method stub
		
		List<Comprador> compradores = CompradorDAO.selectByName(nome);
		for(int i = 0; i < compradores.size(); i++) {
			
			Comprador c = compradores.get(i);
			System.out.println(c);
			
		}
		
	}



	public static List<Comprador> listAll() {
		// TODO Auto-generated method stub
		List<Comprador> compradores = CompradorDAO.selectAll();
		for(int i = 0; i < compradores.size(); i++) {
			
			Comprador c = compradores.get(i);
			System.out.println(c);
			
		}
		return compradores;
		
	}



	private static void atualizar() {
		// TODO Auto-generated method stub
		
		System.out.println("Selecione um dos compradores abaixo");
		List<Comprador> compradores = listAll();
		Comprador c = compradores.get(Integer.parseInt(teclado.nextLine()));
		System.out.println("Novo nome ou enter para manter:");
		String nome = teclado.nextLine();
		System.out.println("Novo cpf ou enter para manter");
		String cpf = teclado.nextLine();
		
		if(!nome.isEmpty())			
			c.setNome(nome);
		if(!cpf.isEmpty())
			c.setCpf(cpf);
		
		CompradorDAO.update(c);		
		
	}



	private static void inserir() {
		// TODO Auto-generated method stub
		
		Comprador c = new Comprador();
		System.out.println("Nome: ");
		c.setNome(teclado.nextLine());
		System.out.println("CPF: ");
		c.setCpf(teclado.nextLine());
		
		CompradorDAO.save(c);
		
	}

}
