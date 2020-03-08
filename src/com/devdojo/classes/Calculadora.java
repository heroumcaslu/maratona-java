package com.devdojo.classes;

public class Calculadora {
	
	int result;
	
	void somaArray(int[] numbers) {
		
		for(int num : numbers) {
			
			this.result += num;
			
		}
		System.out.println(this.result);
		
	}
	
	//Além de passar arrays, posso passar valores separados por virgula.
	void somaVarArgs(int... numbers) {
		
		for(int num : numbers) {
			
			this.result += num;
			
		}
		System.out.println(this.result);
		
	}

}
