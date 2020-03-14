package com.devdojo.classesabstratas.test;

import com.devdojo.classesabstratas.Funcionario;
import com.devdojo.classesabstratas.Gerente;
import com.devdojo.classesabstratas.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {
		
		//Funcionario f = new Funcionario("Lucas", "70170393437", 900);
		Gerente g = new Gerente("Ana", "01866407490", 5000);
		Vendedor v = new Vendedor("Camila", "018664007490", 1500, 3500);
		g.calcularSalario();
		v.calcularSalario();
		System.out.println(g);
		System.out.println(v);
		
	}
	
}
