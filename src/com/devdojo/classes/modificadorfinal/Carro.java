package com.devdojo.classes.modificadorfinal;

public class Carro {

	//Se a constante for um objeto pode-se alterar os valores dentro do objeto mas não criar uma nova referência.
	//Se a classe é final ela não pode ser estendida. (é muito raro)
	//métodos final não pode ser sobrescrito.
	private static final double VELOCIDADE_FINAL = 240;
	private String nome;
	private String marca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static double getVelocidadeFinal() {
		return VELOCIDADE_FINAL;
	}

}
