package com.devdojo.generics.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.generics.Carro;

public class ClasseNGenericaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarroAlugavel carroAlugavel = new CarroAlugavel();
		Carro carroAlugado = carroAlugavel.getCarroDisponivel();
		System.out.println("Usando o carro por um mês");
		carroAlugavel.devolverCarro(carroAlugado);

	}

}

class CarroAlugavel {
	
	private List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	
	{
		
		carrosDisponiveis.add(new Carro("gol"));
		carrosDisponiveis.add(new Carro("BMW"));
		
	}
	
	public Carro getCarroDisponivel() {
		
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: "+c);
		return c;
		
	}
	
	public void devolverCarro(Carro c) {
		
		System.out.println("Devolver Carro: "+c);
		carrosDisponiveis.add(c);
		System.out.println("Carros disponiveis: "+carrosDisponiveis);
		
	}
	
}
