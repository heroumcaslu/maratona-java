package com.devdojo.io;

import java.io.Console;

public class ConsoleTeste {
	
	public static void main(String[] args) {
		
		Console c = System.console();
		char[] pw = c.readPassword("%s", "pw: ");
		
		for(char pass : pw) {
			
			c.format("%c", pass);
			
		}
		c.format("\n");
		
		String texto;
		while(true) {
			
			texto = c.readLine("%s", "digite aqui:");
			c.format("Esse texto %s foi digitado", retorno(texto));
			
		}
		
	}
	
	public static String retorno(String arg1) {
		
		return arg1;
		
	}

}
