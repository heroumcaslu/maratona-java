package com.devdojo.apresentacao;

public class ImprimindoVariaveis {
	
	//Comentário em linha
	/*
	 * Comentário em bloco
	 * 
	 */
	/***
	 * javadoc
	 * @param args parametro de entrada
	 */
	
	public static void main(String[] args) {
		
		//Variaveis primitivas = int, double, float, boolean, char, byte, short, long
		
		//Variaveis reference = Objetos
		
		//Nomeie as variaveis corretamente ex: h != height
		
		@SuppressWarnings("unused")
		int idade = 10; // 4bytes -2147483648, 2147483647
		@SuppressWarnings("unused")
		double salarioD = 2000D; // 8bytes -4,94E-307, 1.79769313486231570E+308
		@SuppressWarnings("unused")
		float salarioF = 2000f;// 4bytes -1,4024E-37, 3.40282347E+38
		@SuppressWarnings("unused")
		byte idadeByte = 12; // 1byte -128, 127
		@SuppressWarnings("unused")
		short idadeShort = 32767; // 2bytes -32768, 32767
		@SuppressWarnings("unused")
		boolean isUnderThirty = true; //false ou true
		@SuppressWarnings("unused")
		long longNumber = 1000L; // 8bytes -9223372036854770000, 9223372036854770000
		@SuppressWarnings("unused")
		char character = '\u0041'; // 2bytes 0, 65535
		
	}

}
