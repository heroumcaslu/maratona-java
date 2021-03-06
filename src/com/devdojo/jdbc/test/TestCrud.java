package com.devdojo.jdbc.test;

import java.util.List;
import java.util.Scanner;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.db.CompradorDAO;

public class TestCrud {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int op;
		while (true) {

			menu();
			op = Integer.parseInt(teclado.nextLine());
			if (op == 0) {

				System.out.println("Saindo do sistema");
				break;

			}
			if(op == 1) {
				
				menuComprador();
				op = Integer.parseInt(teclado.nextLine());
				CompradorCRUD.executar(op);
			
			}
			if(op == 2) {
				
				menuCarro();
				op = Integer.parseInt(teclado.nextLine());
				CarroCRUD.executar(op);
				
			}

		}

	}
	
	private static void menu() {
		
		System.out.println("Selecione uma opção:");
		System.out.println("1. Comprador");
		System.out.println("2. Carro");
		System.out.println("0. Sair");
		
	}

	public static void menuComprador() {

		System.out.println("Digite a opção para começar:");
		System.out.println("1. Inserir comprador");
		System.out.println("2. Atualizar comprador");
		System.out.println("3. Listar todos compradores");
		System.out.println("4. Buscar comprador por nome");
		System.out.println("5. Deletar");
		System.out.println("9. Voltar");

	}

	public static void menuCarro() {

		System.out.println("Digite a opção para começar:");
		System.out.println("1. Inserir carro");
		System.out.println("2. Atualizar carro");
		System.out.println("3. Listar todos carros");
		System.out.println("4. Buscar comprador por nome");
		System.out.println("5. Deletar");
		System.out.println("9. Voltar");

	}

}
