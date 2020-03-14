package com.devdojo.enumjava;

public enum TipoCliente {

	//Todos os atributos aqui são considerados constantes.
	PESSOA_FISICA(1,"Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
		
		//Constant specific class body
		public String getId() {
			
			return "B";
			
		}
		
	};
	//você pode criar atributos dentro de numeração contanto que não seja antes das constantes.
	private String nome;
	private int tipo;

	private TipoCliente(int attr, String nome) {
		this.tipo = attr;
		this.nome = nome;
	}
	
	//Constant specific class body
	public String getId() {
		
		return "A";
		
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}
	
}
