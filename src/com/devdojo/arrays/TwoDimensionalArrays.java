package com.devdojo.arrays;

public class TwoDimensionalArrays {
	
	int[][] twoDimensionalArray = new int[][] {{1,2,3},{1,2,3}};
	
	void printArray() {
		
		System.out.println(twoDimensionalArray);
		
	}
	
	//int[][] arr = new int[3][];
	//arr[0] = new int[2]
	
	int[][] teste = new int[3][4];
	void populateArr() {
		
		for(int[] linha : teste) {
		    
		    for(int coluna : linha){
		        
		        linha[coluna] = coluna;
		        
		    }
		    
		}
		
		
		//Imprime o array e quebra linha no fim da linha do array    
	    for(int[] linha : teste) {
	    
		    for(int coluna : linha){
		        
		        System.out.print(coluna);
		        
		    }
		    System.out.print("\n");
	    
	    }
	    
	}

}
