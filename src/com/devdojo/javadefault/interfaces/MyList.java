package com.devdojo.javadefault.interfaces;

public interface MyList {

	//Java 7
	/*Interface não poderia conter metodo concreto nem estatico e todos atributos eram finais e estaticos*/
	//
	/* Java 8
	 * Possibilidade de ter metodos estáticos 
	 * Não pode criar um metodo estático sem corpo
	 * */
	
	static void sort() {
		
		System.out.println("dentro do sort");
		
	}
	
	void add();
	
	default void remove() {
		
		System.out.println("Dentro do remove");
		
	}
	
}
