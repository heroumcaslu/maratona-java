package com.devdojo.arrays;

public class Arrays {

	// Array objeto
	//byte, int, short, long, float e double = 0
	//char = '\u0000' ''
	//boolean = false
	//references (obj) = null
	int[] idades = new int[3];
	int[] secondIdades = {12, 19, 20};
	int[] thirdIdades = new int[]{12, 19, 20};
	
	void populateArray() {
		
		//enhanced-for
		for(int idade : idades) {
			  
			idades[idade] = idade;
			  
		}
		
	}
	 

}
