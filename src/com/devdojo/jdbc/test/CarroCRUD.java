package com.devdojo.jdbc.test;

import java.util.List;
import java.util.Scanner;

import com.devdojo.jdbc.classes.Carro;
import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.db.CarroDAO;

public class CarroCRUD {

	private static Scanner teclado = new Scanner(System.in);

	public static void executar(int op) {
		// TODO Auto-generated method stub
		switch (op) {

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
		System.out.println("Selecione um dos carros para deletar:");
		List<Carro> carros = listAll();
		int index = Integer.parseInt(teclado.nextLine());

		System.out.println("Tem certeza? Y/n");
		String op = teclado.nextLine();
		if (op.toUpperCase().startsWith("Y") | op.isEmpty()) {

			CarroDAO.remove(carros.get(index));

		}

	}

	private static void searchByName(String nome) {
		// TODO Auto-generated method stub

		List<Carro> carros = CarroDAO.selectByName(nome);
		for (int i = 0; i < carros.size(); i++) {

			Carro c = carros.get(i);
			System.out.println(c);

		}

	}

	private static List<Carro> listAll() {
		// TODO Auto-generated method stub
		List<Carro> carros = CarroDAO.selectAll();
		for (int i = 0; i < carros.size(); i++) {

			Carro c = carros.get(i);
			System.out.println(c);

		}
		return carros;

	}

	private static void atualizar() {
		// TODO Auto-generated method stub

		System.out.println("Selecione um dos carros abaixo");
		List<Carro> carros = listAll();
		Carro c = carros.get(Integer.parseInt(teclado.nextLine()));
		System.out.println("Novo nome ou enter para manter:");
		String nome = teclado.nextLine();
		System.out.println("Nova placa ou enter para manter");
		String placa = teclado.nextLine();

		if (!nome.isEmpty())
			c.setNome(nome);
		if (!placa.isEmpty())
			c.setPlaca(placa);

		CarroDAO.update(c);

	}

	private static void inserir() {
		// TODO Auto-generated method stub

		Carro c = new Carro();
		System.out.println("Nome: ");
		c.setNome(teclado.nextLine());
		System.out.println("Placa: ");
		c.setPlaca(teclado.nextLine());
		System.out.println("Selecione um dos compradores abaixo");
		List<Comprador> compradores = CompradorCRUD.listAll();
		c.setComprador(compradores.get(Integer.parseInt(teclado.nextLine())));

		CarroDAO.save(c);

	}

}
