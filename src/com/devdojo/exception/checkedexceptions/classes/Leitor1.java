package com.devdojo.exception.checkedexceptions.classes;

public class Leitor1 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Fechando");
		
	}

	
	
}
